import sys
from antlr4 import *
from GrammarParser import GrammarParser
from GrammarVisitor import GrammarVisitor
from Gameclass import Gameclass
from Statement import *
from Conditions import *


class HeroVisitor(GrammarVisitor):

    def __init__(self, game_field, _all_functions):
        self.game_field = game_field
        self.aggr_stats = []
        self.in_loop = False
        self.if_scopes = []
        self.current_if_scope = -1
        self.all_functions = _all_functions
        self.global_scope = []
        self.current_scope_name = "global"
        self.if_scope_counter_dict = {}

    def aggregateResult(self, aggregate, nextResult):
        if nextResult is not None and type(nextResult) != list and self.current_if_scope < 0:
            self.aggr_stats.append(nextResult)
        elif self.current_if_scope > -1 and type(nextResult) != list and nextResult is not None:
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
        elif ctx.function_call():
            return self.visit(ctx.function_call())
        elif ctx.for_statement():
            return self.visit(ctx.for_statement())
        elif ctx.print_statement():
            return self.visit(ctx.print_statement())

    def visitPrint_statement(self, ctx: GrammarParser.Print_statementContext):
        text = ctx.SOME_STRING()
        text = str(text)
        print(text)
        return printStatement(text[1:-1])



    def visitIf_statement(self, ctx: GrammarParser.If_statementContext):
        if_number = 0
        if self.current_scope_name in self.if_scope_counter_dict:
            self.if_scope_counter_dict[self.current_scope_name] += 1
            if_number = self.if_scope_counter_dict[self.current_scope_name]
        else:
            self.if_scope_counter_dict[self.current_scope_name] = 1
            if_number = 1

        self.current_scope_name += ":if" + str(if_number)

        self.if_scopes.append([])
        self.current_if_scope += 1
        cond = self.visit(ctx.bracket_cond())
        self.visit(ctx.statements())
        body = self.if_scopes.pop(self.current_if_scope)

        tmp_scope = self.current_scope_name.split(":")
        self.current_scope_name = ':'.join([str(elem) for elem in tmp_scope[:-1]])

        self.current_if_scope -= 1
        return ifStatement(body, cond)

    def visitFor_statement(self, ctx:GrammarParser.For_statementContext):
        if_number = 0
        if self.current_scope_name in self.if_scope_counter_dict:
            self.if_scope_counter_dict[self.current_scope_name] += 1
            if_number = self.if_scope_counter_dict[self.current_scope_name]
        else:
            self.if_scope_counter_dict[self.current_scope_name] = 1
            if_number = 1

        self.current_scope_name += ":for" + str(if_number)

        self.if_scopes.append([])
        self.current_if_scope += 1

        numb = ctx.NUMBER()
        self.visit(ctx.statements())
        body = self.if_scopes.pop(self.current_if_scope)

        tmp_scope = self.current_scope_name.split(":")
        self.current_scope_name = ':'.join([str(elem) for elem in tmp_scope[:-1]])

        self.current_if_scope -= 1
        return forStatement(body, int(str(numb)))

    def visitWhile_statement(self, ctx: GrammarParser.While_statementContext):
        if_number = 0
        if self.current_scope_name in self.if_scope_counter_dict:
            self.if_scope_counter_dict[self.current_scope_name] += 1
            if_number = self.if_scope_counter_dict[self.current_scope_name]
        else:
            self.if_scope_counter_dict[self.current_scope_name] = 1
            if_number = 1

        self.current_scope_name += ":while" + str(if_number)

        self.if_scopes.append([])
        self.current_if_scope += 1
        cond = self.visit(ctx.bracket_cond())
        self.visit(ctx.statements())
        body = self.if_scopes.pop(self.current_if_scope)

        tmp_scope = self.current_scope_name.split(":")
        self.current_scope_name = ':'.join([str(elem) for elem in tmp_scope[:-1]])

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
        elif ctx.getText() == 'disarm':
            return disarmStatement(self.game_field)
        else:
            return None

    def visitBracket_cond(self, ctx: GrammarParser.Bracket_condContext):
        if ctx.AND():
            left = self.visit(ctx.getChild(0))
            right = self.visit(ctx.getChild(2))
            return binCondition(left, right, 'and')
        elif ctx.OR():
            left = self.visit(ctx.getChild(0))
            right = self.visit(ctx.getChild(2))
            return binCondition(left, right, 'or')
        elif ctx.cond_help():
            return self.visit(ctx.cond_help())
        elif ctx.NEGATION():
            x = self.visit(ctx.getChild(2))
            return negCondition(x, self.game_field)
        else:
            x = self.visit(ctx.getChild(1))
            return bracketCondition(x)

    def visitCond_help(self, ctx: GrammarParser.Cond_helpContext):
        if ctx.AND():
            left = self.visit(ctx.getChild(0))
            right = self.visit(ctx.getChild(2))
            return binCondition(left, right, 'and')
        elif ctx.OR():
            left = self.visit(ctx.getChild(0))
            right = self.visit(ctx.getChild(2))
            return binCondition(left, right, 'or')
        elif ctx.NEGATION():
            x = self.visit(ctx.condition())
            return negCondition(Condition(x, self.game_field), self.game_field)
        else:
            x = self.visit(ctx.condition())
            return Condition(x, self.game_field)

    def visitCondition(self, ctx: GrammarParser.ConditionContext):
        return ctx.getText()

    def visitFunction_call(self, ctx: GrammarParser.Function_callContext):
        name = ctx.getText()
        x = self.checkFunction(name)
        if x is not None:
            return self.all_functions[x]



    def checkFunction(self, name):
        tmp_scope = self.current_scope_name.split(":")
        x = ':'.join([str(elem) for elem in tmp_scope])
        while (len(x) > 0):
            if x + ":" + name in self.all_functions.keys():
                return x + ":" + name
            tmp_scope = x.split(":")
            x = ':'.join([str(elem) for elem in tmp_scope[:-1]])
        return None
