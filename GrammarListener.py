# Generated from Grammar.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GrammarParser import GrammarParser
else:
    from GrammarParser import GrammarParser

# This class defines a complete listener for a parse tree produced by GrammarParser.
class GrammarListener(ParseTreeListener):

    # Enter a parse tree produced by GrammarParser#statements.
    def enterStatements(self, ctx:GrammarParser.StatementsContext):
        pass

    # Exit a parse tree produced by GrammarParser#statements.
    def exitStatements(self, ctx:GrammarParser.StatementsContext):
        pass


    # Enter a parse tree produced by GrammarParser#statement.
    def enterStatement(self, ctx:GrammarParser.StatementContext):
        pass

    # Exit a parse tree produced by GrammarParser#statement.
    def exitStatement(self, ctx:GrammarParser.StatementContext):
        pass


    # Enter a parse tree produced by GrammarParser#function_call.
    def enterFunction_call(self, ctx:GrammarParser.Function_callContext):
        pass

    # Exit a parse tree produced by GrammarParser#function_call.
    def exitFunction_call(self, ctx:GrammarParser.Function_callContext):
        pass


    # Enter a parse tree produced by GrammarParser#if_statement.
    def enterIf_statement(self, ctx:GrammarParser.If_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#if_statement.
    def exitIf_statement(self, ctx:GrammarParser.If_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#while_statement.
    def enterWhile_statement(self, ctx:GrammarParser.While_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#while_statement.
    def exitWhile_statement(self, ctx:GrammarParser.While_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#bracket_cond.
    def enterBracket_cond(self, ctx:GrammarParser.Bracket_condContext):
        pass

    # Exit a parse tree produced by GrammarParser#bracket_cond.
    def exitBracket_cond(self, ctx:GrammarParser.Bracket_condContext):
        pass


    # Enter a parse tree produced by GrammarParser#cond_help.
    def enterCond_help(self, ctx:GrammarParser.Cond_helpContext):
        pass

    # Exit a parse tree produced by GrammarParser#cond_help.
    def exitCond_help(self, ctx:GrammarParser.Cond_helpContext):
        pass


    # Enter a parse tree produced by GrammarParser#condition.
    def enterCondition(self, ctx:GrammarParser.ConditionContext):
        pass

    # Exit a parse tree produced by GrammarParser#condition.
    def exitCondition(self, ctx:GrammarParser.ConditionContext):
        pass


    # Enter a parse tree produced by GrammarParser#action.
    def enterAction(self, ctx:GrammarParser.ActionContext):
        pass

    # Exit a parse tree produced by GrammarParser#action.
    def exitAction(self, ctx:GrammarParser.ActionContext):
        pass


    # Enter a parse tree produced by GrammarParser#direction.
    def enterDirection(self, ctx:GrammarParser.DirectionContext):
        pass

    # Exit a parse tree produced by GrammarParser#direction.
    def exitDirection(self, ctx:GrammarParser.DirectionContext):
        pass


    # Enter a parse tree produced by GrammarParser#function.
    def enterFunction(self, ctx:GrammarParser.FunctionContext):
        pass

    # Exit a parse tree produced by GrammarParser#function.
    def exitFunction(self, ctx:GrammarParser.FunctionContext):
        pass



del GrammarParser