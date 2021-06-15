import time


class Statement:
    def execute(self, statement_list):
        return


class ifStatement(Statement):

    def __init__(self, _body, _cond):
        self.body = _body
        self.cond = _cond

    def __str__(self):
        return "ifStatement"

    def execute(self, statement_list):
        if self.cond.getValue():
            tmp = statement_list
            for a in self.body[::-1]:
                tmp.insert(0, a)
            return tmp
        return statement_list


class functionStatement(Statement):

    def __init__(self, _body):
        self.body = _body

    def __str__(self):
        return "functionStatement"

    def execute(self, statement_list):
        print("Executing function")
        if self.body is not None:
            tmp = statement_list
            for a in self.body[::-1]:
                tmp.insert(0, a)
            return tmp
        return statement_list


class whileStatement(Statement):

    def __init__(self, _body, _cond):
        self.body = _body
        self.cond = _cond

    def __str__(self):
        return "whileStatement"

    def execute(self, statement_list):
        if self.cond.getValue():
            tmp = statement_list
            tmp.insert(0, self)
            for a in self.body[::-1]:
                tmp.insert(0, a)
            return tmp
        return statement_list


class forwardStatement(Statement):
    def __init__(self, game):
        self.game = game

    def __str__(self):
        return "forwardStatement"

    def execute(self, statement_list):
        self.game.moveForward()
        print("forward")
        return statement_list


class attackStatement(Statement):
    def __init__(self, game):
        self.game = game

    def __str__(self):
        return "attackStatement"

    def execute(self, statement_list):
        self.game.attack()
        print("attacking")
        return statement_list


class turnStatement(Statement):
    def __init__(self, game, direction):
        self.game = game
        self.direction = direction

    def __str__(self):
        return "turnStatement"

    def execute(self, statement_list):
        self.game.turn(self.direction)
        print("turning")
        return statement_list


class disarmStatement(Statement):
    def __init__(self, game):
        self.game = game

    def __str__(self):
        return "disarmStatement"

    def execute(self, statement_list):
        self.game.disarm()
        return statement_list


class forStatement(Statement):
    def __init__(self, _body, _num):
        self.body = _body
        self.num = _num

    def __str__(self):
        return "forStatement"

    def execute(self, statement_list):
        if self.num > 0:
            self.num -= 1
            tmp = statement_list
            tmp.insert(0, self)
            for a in self.body[::-1]:
                tmp.insert(0, a)
            return tmp
        return statement_list

class printStatement(Statement):
    def __init__(self, text):
        self.text = text.strip()

    def __str__(self):
        return "printStatement"

    def execute(self, statement_list):
        print(self.text.strip("\n"))
        return statement_list


def executeCommands(body):
    if body is not None:
        for a in body:
            a.execute()
            # time.sleep(1)
