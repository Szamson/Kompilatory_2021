import sys
from antlr4 import *
from GrammarLexer import GrammarLexer
from GrammarParser import GrammarParser
from HeroVisitor import HeroVisitor
from FirstPassVisitor import FirstPassVisitor
from Gameclass import Gameclass
from Statement import executeCommands


def main(argv):
    input = FileStream(argv)
    lexer = GrammarLexer(input)
    stream = CommonTokenStream(lexer)
    parser = GrammarParser(stream)
    tree = parser.statements()

    field = Gameclass()

    print("First pass:")
    fv = FirstPassVisitor(field)
    f = fv.visit(tree)
    print(list(f))

    print("Second pass:")
    v = HeroVisitor(field, f)
    st = v.visit(tree)

    print("In main:")
    print(st)
    print("Executing:")
    #executeCommands(st)
    field.start(st)


if __name__ == '__main__':
    main("code")