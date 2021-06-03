class Condition:

    def __init__(self, x, game):
        self.term = x
        self.game = game

    def getValue(self):
        return self.game.checkCondition(self.term)


class negCondition(Condition):

    def __init__(self, x, game):
        self.term = x
        self.game = game

    def getValue(self):
        return not self.game.checkCondition(self.term)


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
