import sys
from antlr4 import *
from GrammarLexer import GrammarLexer
from GrammarParser import GrammarParser
from HeroVisitor import HeroVisitor
from FirstPassVisitor import FirstPassVisitor
from Gameclass import Gameclass
from Statement import executeCommands


def main(file_name, map, print_mode):
    input = FileStream(file_name)
    lexer = GrammarLexer(input)
    stream = CommonTokenStream(lexer)
    parser = GrammarParser(stream)
    tree = parser.statements()

    field = Gameclass(map, print_mode)

    print("First pass:")
    fv = FirstPassVisitor(field)
    try:
        f = fv.visit(tree)
    except:
        print("Syntax error")
        exit()
    print("Functions from first pass: ")
    if (len(list(f)) > 0):
        print(list(f))

    print("Second pass:")
    v = HeroVisitor(field, f)
    st = v.visit(tree)

    print("In main:")
    print(st)
    print("Executing:")
    # executeCommands(st)
    field.start(st)


if __name__ == '__main__':
    main("code", 1, True)


