import sys
from antlr4 import *
from GrammarParser import GrammarParser
from GrammarListener import GrammarListener
import Gameclass



class HeroListener(GrammarListener):
    def __init__(self, output, game_field):
        self.output = output
        self.game_field = game_field
        self.statements_to_execute = []

        #game_field.start()

    def exitStatements(self, ctx:GrammarParser.StatementsContext):
        self.game_field.start(self.statements_to_execute)

    def 


    



