from enum import IntEnum

import pygame
import numpy as np


class Compass(IntEnum):
    NORTH = 0
    EAST = 1
    SOUTH = 2
    WEST = 3


class Map(IntEnum):
    PATH = 0
    HERO = 1
    WALL = 2
    ENEMY = 3
    TRAP = 4
    TREASURE = 5


class Gameclass:

    def __init__(self, map_file, print_mode):

        pygame.init()
        self.print_mode = print_mode
        self.map_file = map_file

        "Size"
        self.display_width = 600
        self.display_height = 600
        self.field_size = 15  # liczba kratek
        self.menu_width = 600 / 20
        self.menuX = min(self.display_width, self.display_height)

        "Windows settings"
        self.display_window = pygame.display.set_mode((self.display_width, self.display_height))
        pygame.display.set_caption("Battleground Simulator")
        clock = pygame.time.Clock()
        self.display_window.fill(pygame.Color("white"))
        self.block_size = min(self.display_height, self.display_width) / self.field_size

        "Data"
        self.direction = Compass.NORTH
        self.field = np.zeros((10, 10))
        self.position = (1, 13)
        self.makeMap()
        self.instructions = []
        self.instructions_counter = 0

    def drawGrid(self):
        """"
        Wygodne rysowanie siatki na ekranie
        :param number: rozmiar siatki
        """

        for x in range(self.field_size):
            for y in range(self.field_size):
                rect = pygame.Rect(x * self.block_size, y * self.block_size,
                                   self.block_size, self.block_size)
                pygame.draw.rect(self.display_window, pygame.Color("black"), rect, 1)

    def drawRect(self, color, x, y):
        pygame.draw.rect(
            self.display_window,
            pygame.Color(color),
            pygame.Rect(x * self.block_size, y * self.block_size, self.block_size, self.block_size),
            0)

    def fillMap(self):
        try:
            for x in range(self.field_size):
                for y in range(self.field_size):
                    if self.field[x, y] == Map.HERO:
                        self.drawRect("green", x, y)
                    elif self.field[x, y] == Map.WALL:
                        self.drawRect("black", x, y)
                    elif self.field[x, y] == Map.ENEMY:
                        self.drawRect("red", x, y)
                    elif self.field[x, y] == Map.TREASURE:
                        self.drawRect("yellow", x, y)
                    elif self.field[x, y] == Map.TRAP:
                        self.drawRect("blue", x, y)
                    elif self.field[x, y] == Map.PATH:
                        self.drawRect("white", x, y)
        except:
            print("Wrong map input!")
            exit()

    def makeMap(self):
        map_array = self.read_from_file()
        try:
            self.field = np.transpose(np.array(map_array))
            self.field[self.position] = Map.HERO
            self.field[0, :] = Map.WALL
            self.field[self.field_size-1, :] = Map.WALL
            self.field[:, 0] = Map.WALL
            self.field[:, self.field_size-1] = Map.WALL
        except:
            print("Wrong map input!")
            exit()

    def read_from_file(self):
        mylist = []
        try:
            with open(self.map_file, "r") as fp:
                for i in fp.readlines():
                    tmp = i.split(',')
                    tmp = [int(i) for i in tmp]
                    mylist.append(tmp)
            return mylist
        except:
            print("File " + str(self.map_file) + "does not exist!")
            exit()


    def moveForward(self):

        if self.field[self.fieldInFront()] == Map.PATH:
            self.field[self.position] = Map.PATH
            self.position = self.fieldInFront()
            self.field[self.position] = Map.HERO
        elif self.field[self.fieldInFront()] == Map.ENEMY or self.field[self.fieldInFront()] == Map.TRAP:
            print("You lost! Try again")
            pygame.quit()
            exit()
        elif self.field[self.fieldInFront()] == Map.TREASURE:
            print("You won. Congratulations!")
            pygame.quit()
            exit()

    def turn(self, direction):
        if direction == "right":
            self.direction = (self.direction + 1) % 4
        elif direction == "left":
            self.direction = (self.direction - 1) % 4

    def checkCondition(self, condition):

        if condition == "TRUE":
            return True
        if condition == "FALSE":
            return False

        field_in_front = self.fieldInFront()

        if condition == Map(self.field[field_in_front[0], field_in_front[1]]).name:
            return True
        else:
            return False

    def attack(self):
        field_in_front = self.fieldInFront()

        if self.field[field_in_front[0], field_in_front[1]] == Map.ENEMY:
            self.field[field_in_front[0], field_in_front[1]] = 0

    def disarm(self):
        field_in_front = self.fieldInFront()

        if self.field[field_in_front[0], field_in_front[1]] == Map.TRAP:
            self.field[field_in_front[0], field_in_front[1]] = 0

    def fieldInFront(self):
        field_in_front = self.position

        if self.direction == Compass.NORTH:
            field_in_front = (field_in_front[0], field_in_front[1] - 1)
        if self.direction == Compass.SOUTH:
            field_in_front = (field_in_front[0], field_in_front[1] + 1)
        if self.direction == Compass.EAST:
            field_in_front = (field_in_front[0] + 1, field_in_front[1])
        if self.direction == Compass.WEST:
            field_in_front = (field_in_front[0] - 1, field_in_front[1])

        return field_in_front

    def start(self, statements_to_execute):
        while 1:
            self.fillMap()
            self.drawGrid()

            for event in pygame.event.get():

                if event.type == pygame.QUIT:
                    pygame.quit()
                    exit()

                if event.type == pygame.MOUSEBUTTONDOWN:

                    if len(statements_to_execute) > 0:
                        statements_to_execute = statements_to_execute.pop(0).execute(statements_to_execute)
                    else:
                        print("No more commands to execute. Closing...")
                        pygame.quit()
                        exit()
                    if self.print_mode:
                        print('< ', end='')
                        for a in statements_to_execute:
                            print(str(a) + ', ', end='')
                        print(' >')

            pygame.display.update()
