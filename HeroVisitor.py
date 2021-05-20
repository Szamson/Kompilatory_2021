import sys
from antlr4 import *
from GrammarParser import GrammarParser
from GrammarVisitor import GrammarVisitor
from Gameclass import Gameclass
from Statement import *
from Conditions import *


class HeroVisitor(GrammarVisitor):

    def __init__(self, game_field):
        self.game_field = game_field
        self.aggr_stats = []
        self.in_loop = False
        self.if_scopes = []
        self.current_if_scope = -1
        #self.game_field.start()

    def aggregateResult(self, aggregate, nextResult):
        if nextResult is not None and type(nextResult) != list and self.current_if_scope<0:
            self.aggr_stats.append(nextResult)
        elif self.current_if_scope >-1 and type(nextResult) != list and nextResult is not None:
            self.if_scopes[self.current_if_scope].append(nextResult)


    def visitStatements(self, ctx: GrammarParser.StatementsContext):
        self.visitChildren(ctx)
        return self.aggr_stats


    def visitStatement(self, ctx: GrammarParser.StatementContext):
        if ctx.if_statement():
            return self.visit(ctx.if_statement())
        elif ctx.while_statement():
            return self.visit(ctx.while_statement())
        elif ctx.action():
            return self.visit(ctx.action())

    def visitIf_statement(self, ctx: GrammarParser.If_statementContext):
        self.if_scopes.append([])
        self.current_if_scope += 1
        cond = self.visit(ctx.cond_help())
        self.visit(ctx.statements())
        body = self.if_scopes.pop(self.current_if_scope)
        self.current_if_scope -= 1
        return ifStatement(body, cond)

    def visitWhile_statement(self, ctx: GrammarParser.While_statementContext):
        self.if_scopes.append([])
        self.current_if_scope += 1
        cond = self.visit(ctx.cond_help())
        self.visit(ctx.statements())
        body = self.if_scopes.pop(self.current_if_scope)
        self.current_if_scope -= 1
        return whileStatement(body, cond)

    def visitAction(self, ctx: GrammarParser.ActionContext):

        if ctx.getText() == 'turnleft':
            direc = "left"
            return turnStatement(self.game_field, direc)
        elif ctx.getText() == 'turnright':
            direc = "right"
            return turnStatement(self.game_field, direc)
        elif ctx.getText() == 'attack':
            return attackStatement(self.game_field)
        elif ctx.getText() == 'forward':
            return forwardStatement(self.game_field)
        elif ctx.getText() == 'DISARM':
            return disarmStatement(self.game_field)
        else:
            return None

    def visitCond_help(self, ctx: GrammarParser.Cond_helpContext):
        if ctx.AND():
            left = self.visit(ctx.cond_help())
            right = self.visit(ctx.condition())
            return binCondition(left, right, 'and')
        elif ctx.OR():
            left = self.visit(ctx.cond_help())
            right = self.visit(ctx.condition())
            return binCondition(left, right, 'or')
        elif ctx.NEGATION():
            x = self.visit(ctx.condition())
            return negCondition(x, self.game_field)
        else:
            x = self.visit(ctx.condition())
            return Condition(x, self.game_field)

    def visitCondition(self, ctx:GrammarParser.ConditionContext):
        return ctx.getText()


