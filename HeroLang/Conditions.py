class Condition:

    def __init__(self, x, game):
        self.term = x
        self.game = game

    def getValue(self):
        return self.game.checkCondition(self.term)

class bracketCondition:

    def __init__(self, x):
        self.cond = x

    def getValue(self):
        return self.cond.getValue()


class negCondition(Condition):

    def __init__(self, x, game):
        self.cond = x
        self.game = game

    def getValue(self):
        return not self.cond.getValue()


class binCondition(Condition):
    def __init__(self, left, right, op):
        self.left = left
        self.right = right
        self.op = op

    def getValue(self):
        if self.op == "or":
            return self.left.getValue() or self.right.getValue()
        else:
            return self.left.getValue() and self.right.getValue()
