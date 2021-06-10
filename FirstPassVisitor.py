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
        self.current_scope_name = "global"
        self.if_scope_counter_dict = {}

    def aggregateResult(self, aggregate, nextResult):
        if nextResult is not None and type(nextResult) != list and self.current_if_scope < 0:
            self.aggr_stats.append(nextResult)
            # print(self.aggr_stats)
        elif self.current_if_scope > -1 and type(nextResult) != list and nextResult is not None:
            self.if_scopes[self.current_if_scope].append(nextResult)
            # print(self.if_scopes)

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
        elif ctx.getText() == 'DISARM':
            return disarmStatement(self.game_field)
        else:
            return None

    def visitBracket_cond(self, ctx:GrammarParser.Bracket_condContext):
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
        full_name = self.checkFunction(name)

        try:
            if full_name is not None:
                print("Ok, function", name, " was declared")
                x = self.all_functions[full_name]
                return x
            else:
                raise TypeError("Error, undeclared function: " + name)
        except:
            print("Error, undeclared function: " + name)
            exit()

    def visitFunction(self, ctx: GrammarParser.FunctionContext):
        self.current_scope_name += ":" + str(ctx.NAME())


        self.if_scopes.append([])
        self.current_if_scope += 1
        self.visit(ctx.statements())

        tmp_body = self.if_scopes.pop(self.current_if_scope)
        tmp_scope = self.current_scope_name.split(":")


        body = []
        for i in range(len(tmp_body)):
            if issubclass(type(tmp_body[i]), Statement):
                body.append(tmp_body[i])

        self.current_scope_name = ':'.join([str(elem) for elem in tmp_scope[:-1]])
        self.current_if_scope -= 1
        '''
        if self.current_if_scope > -1:
            self.if_scopes[self.current_if_scope].append(ctx.NAME())
        else:
            self.global_scope.append(ctx.NAME())
        '''
        tmp = functionStatement(body)
        function_name = self.current_scope_name + ":" + str(ctx.NAME())
        try:
            if function_name not in self.all_functions:
                print("add fun")
                self.all_functions[function_name] = tmp
            else:
                raise TypeError("Error, function already defined in this scope!")
        except:
            print("Error, function", str(ctx.NAME()), "already defined in this scope!")
            exit()

    '''
    def checkFunction(self, name):
        for i in range(len(self.if_scopes)):
            for j in range(len(self.if_scopes[i])):
                if str(self.if_scopes[i][j]) == str(name):
                    return True
        for k in range(len(self.global_scope)):
            if str(self.global_scope[k]) == str(name):
                return True

        return False
    '''

    def checkFunction(self, name):
        tmp_scope = self.current_scope_name.split(":")
        x = ':'.join([str(elem) for elem in tmp_scope])
        while (len(x) > 0):
            if x + ":" + name in self.all_functions.keys():
                return x + ":" + name
            tmp_scope = x.split(":")
            x = ':'.join([str(elem) for elem in tmp_scope[:-1]])
        return None
