import time
class Statement:
    def execute(self):
        return


class ifStatement(Statement):

    def __init__(self, _body, _cond):
        self.body = _body
        self.cond = _cond


    def execute(self):
        if self.cond.getValue():
            executeCommands(self.body)

class functionStatement(Statement):

    def __init__(self, _body):
        self.body = _body


    def execute(self):
        print("Executing function")
        if self.body is not None:
            executeCommands(self.body)

class whileStatement(Statement):

    def __init__(self, _body, _cond):
        self.body = _body
        self.cond = _cond
        self.whilecond = self.cond.getValue()

    def execute(self):
        while self.whilecond:
            executeCommands(self.body)
            self.whilecond = self.cond.getValue()


class forwardStatement(Statement):
    def __init__(self, game):
        self.game = game

    def execute(self):
        self.game.moveForward()
        print("forward")


class attackStatement(Statement):
    def __init__(self, game):
        self.game = game

    def execute(self):
        self.game.attack()
        print("attacking")


class turnStatement(Statement):
    def __init__(self, game, direction):
        self.game = game
        self.direction = direction

    def execute(self):
        self.game.turn(self.direction)
        print("turning")


class disarmStatement(Statement):
    def __init__(self, game):
        self.game = game

    def execute(self):
        self.game.disarm()


def executeCommands(body):
    if body is not None:
        for a in body:
            a.execute()
            #time.sleep(1)