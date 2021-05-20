import sys
from antlr4 import *
from GrammarLexer import GrammarLexer
from GrammarParser import GrammarParser
from HeroVisitor import HeroVisitor
from Gameclass import Gameclass
from Statement import executeCommands


def main(argv):
    input = FileStream(argv[1])
    lexer = GrammarLexer(input)
    stream = CommonTokenStream(lexer)
    parser = GrammarParser(stream)
    tree = parser.statements()

    field = Gameclass()
    v = HeroVisitor(field)
    st = v.visit(tree)

    print("In main:")
    print(st)
    print("Executing:")
    #executeCommands(st)
    field.start(st)


if __name__ == '__main__':
    main(sys.argv)