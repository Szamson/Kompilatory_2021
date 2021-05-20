import sys
from antlr4 import *
from GrammarParser import GrammarParser
from GrammarVisitor import GrammarVisitor
from Gameclass import Gameclass
from Statement import *
from Conditions import *

class FirstPassVisitor(GrammarVisitor):

    def __init__(self, game_field):
        self.game_field = game_field
        self.aggr_stats = []
        self.in_loop = False
        self.if_scopes = []
        self.current_if_scope = -1
        self.all_functions = {}
        self.global_scope = []

    def aggregateResult(self, aggregate, nextResult):
        if nextResult is not None and type(nextResult) != list and self.current_if_scope<0:
            self.aggr_stats.append(nextResult)
        elif self.current_if_scope >-1 and type(nextResult) != list and nextResult is not None:
            self.if_scopes[self.current_if_scope].append(nextResult)

    def visitStatements(self, ctx: GrammarParser.StatementsContext):
        self.visitChildren(ctx)

        return self.all_functions

    def visitStatement(self, ctx: GrammarParser.StatementContext):
        if ctx.if_statement():
            return self.visit(ctx.if_statement())
        elif ctx.while_statement():
            return self.visit(ctx.while_statement())
        elif ctx.action():
            return self.visit(ctx.action())
        elif ctx.function():
            return self.visit(ctx.function())
        elif ctx.function_call():
            return self.visit(ctx.function_call())

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

    def visitCondition(self, ctx: GrammarParser.ConditionContext):
        return ctx.getText()

    def visitFunction_call(self, ctx:GrammarParser.Function_callContext):
        name = ctx.getText()
        cond = self.checkFunction(name)
        if cond:
            print("Ok, function was declared")
        else:
            print("Error, undeclared function!")




    def visitFunction(self, ctx:GrammarParser.FunctionContext):
        print(ctx.NAME())
        self.if_scopes.append([])
        self.current_if_scope += 1
        self.visit(ctx.statements())
        body = self.if_scopes.pop(self.current_if_scope)
        print("Body:")
        print(body)
        self.current_if_scope -= 1
        if self.current_if_scope>-1:
            self.if_scopes[self.current_if_scope].append(ctx.NAME())
        else:
            self.global_scope.append(ctx.NAME())
        tmp = functionStatement(body)
        if str(ctx.NAME()) not in self.all_functions:
            print("add fun")
            self.all_functions[str(ctx.NAME())] = tmp
        else:
            print("Multiple definitions. Stored first declared value")

    def checkFunction(self, name):
        for i in range(len(self.if_scopes)):
            for j in range(len(self.if_scopes[i])):
                if str(self.if_scopes[i][j]) == str(name):
                    return True
        for k in range(len(self.global_scope)):
            if str(self.global_scope[k]) == str(name):
                return True
            else:
                return False
