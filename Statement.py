import time


class Statement:
    def execute(self, statement_list):
        return


class ifStatement(Statement):

    def __init__(self, _body, _cond):
        self.body = _body
        self.cond = _cond

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

    def execute(self, statement_list):
        self.game.moveForward()
        print("forward")
        return statement_list


class attackStatement(Statement):
    def __init__(self, game):
        self.game = game

    def execute(self, statement_list):
        self.game.attack()
        print("attacking")
        return statement_list


class turnStatement(Statement):
    def __init__(self, game, direction):
        self.game = game
        self.direction = direction

    def execute(self, statement_list):
        self.game.turn(self.direction)
        print("turning")
        return statement_list


class disarmStatement(Statement):
    def __init__(self, game):
        self.game = game

    def execute(self, statement_list):
        self.game.disarm()
        return statement_list


def executeCommands(body):
    if body is not None:
        for a in body:
            a.execute()
            # time.sleep(1)
