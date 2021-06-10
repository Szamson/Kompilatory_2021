# Generated from Grammar.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GrammarParser import GrammarParser
else:
    from GrammarParser import GrammarParser

# This class defines a complete generic visitor for a parse tree produced by GrammarParser.

class GrammarVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by GrammarParser#statements.
    def visitStatements(self, ctx:GrammarParser.StatementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#statement.
    def visitStatement(self, ctx:GrammarParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#function_call.
    def visitFunction_call(self, ctx:GrammarParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#if_statement.
    def visitIf_statement(self, ctx:GrammarParser.If_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#while_statement.
    def visitWhile_statement(self, ctx:GrammarParser.While_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#bracket_cond.
    def visitBracket_cond(self, ctx:GrammarParser.Bracket_condContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#cond_help.
    def visitCond_help(self, ctx:GrammarParser.Cond_helpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#condition.
    def visitCondition(self, ctx:GrammarParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#action.
    def visitAction(self, ctx:GrammarParser.ActionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#direction.
    def visitDirection(self, ctx:GrammarParser.DirectionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#function.
    def visitFunction(self, ctx:GrammarParser.FunctionContext):
        return self.visitChildren(ctx)



del GrammarParser