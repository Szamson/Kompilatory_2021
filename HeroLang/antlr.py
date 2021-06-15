from antlr4 import *
from HeroLang.GrammarLexer import GrammarLexer
from HeroLang.GrammarParser import GrammarParser
from HeroLang.HeroVisitor import HeroVisitor
from HeroLang.FirstPassVisitor import FirstPassVisitor
from HeroLang.Gameclass import Gameclass
import sys


def main():
    input = FileStream(sys.argv[1])
    lexer = GrammarLexer(input)
    stream = CommonTokenStream(lexer)
    parser = GrammarParser(stream)
    tree = parser.statements()

    field = Gameclass(str(sys.argv[2]), bool(int(sys.argv[3])))

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
    main()


