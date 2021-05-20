# Generated from Grammar.g4 by ANTLR 4.9.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32")
        buf.write("W\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2\6\2\30\n\2\r\2\16\2")
        buf.write("\31\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\5\3\5\3\5\3")
        buf.write("\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7")
        buf.write("\3\7\3\7\3\7\5\79\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7A\n\7")
        buf.write("\f\7\16\7D\13\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tM\n\t\3")
        buf.write("\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\2\3\f\f\2\4")
        buf.write("\6\b\n\f\16\20\22\24\2\4\3\2\13\16\3\2\25\26\2W\2\27\3")
        buf.write("\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\b$\3\2\2\2\n,\3\2\2\2\f")
        buf.write("8\3\2\2\2\16E\3\2\2\2\20L\3\2\2\2\22N\3\2\2\2\24P\3\2")
        buf.write("\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3")
        buf.write("\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33!\5\b\5\2\34!\5\n")
        buf.write("\6\2\35!\5\20\t\2\36!\5\24\13\2\37!\5\6\4\2 \33\3\2\2")
        buf.write("\2 \34\3\2\2\2 \35\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!\5")
        buf.write("\3\2\2\2\"#\7\30\2\2#\7\3\2\2\2$%\7\b\2\2%&\7\3\2\2&\'")
        buf.write("\5\f\7\2\'(\7\4\2\2()\7\5\2\2)*\5\2\2\2*+\7\6\2\2+\t\3")
        buf.write("\2\2\2,-\7\t\2\2-.\7\3\2\2./\5\f\7\2/\60\7\4\2\2\60\61")
        buf.write("\7\5\2\2\61\62\5\2\2\2\62\63\7\6\2\2\63\13\3\2\2\2\64")
        buf.write("\65\b\7\1\2\65\66\7\n\2\2\669\5\16\b\2\679\5\16\b\28\64")
        buf.write("\3\2\2\28\67\3\2\2\29B\3\2\2\2:;\f\4\2\2;<\7\20\2\2<A")
        buf.write("\5\16\b\2=>\f\3\2\2>?\7\17\2\2?A\5\16\b\2@:\3\2\2\2@=")
        buf.write("\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\r\3\2\2\2DB\3")
        buf.write("\2\2\2EF\t\2\2\2F\17\3\2\2\2GM\7\21\2\2HI\7\22\2\2IM\5")
        buf.write("\22\n\2JM\7\23\2\2KM\7\24\2\2LG\3\2\2\2LH\3\2\2\2LJ\3")
        buf.write("\2\2\2LK\3\2\2\2M\21\3\2\2\2NO\t\3\2\2O\23\3\2\2\2PQ\7")
        buf.write("\27\2\2QR\7\30\2\2RS\7\5\2\2ST\5\2\2\2TU\7\6\2\2U\25\3")
        buf.write("\2\2\2\b\31 8@BL")
        return buf.getvalue()


class GrammarParser ( Parser ):

    grammarFileName = "Grammar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'<'", "'>'", "'('", "')'", "<INVALID>", 
                     "'if'", "'while'", "'NO'", "'WALL'", "'ENEMY'", "'TREASURE'", 
                     "'TRAP'", "'AND'", "'OR'", "'forward'", "'turn'", "'attack'", 
                     "'disarm'", "'left'", "'right'", "'fun'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "COMMENT", "IF", "WHILE", "NEGATION", 
                      "WALL", "ENEMY", "TREASURE", "TRAP", "AND", "OR", 
                      "FORWARD", "TURN", "ATTACK", "DISARM", "LEFT", "RIGHT", 
                      "FUN", "NAME", "WHITESPACE", "NEWLINE" ]

    RULE_statements = 0
    RULE_statement = 1
    RULE_function_call = 2
    RULE_if_statement = 3
    RULE_while_statement = 4
    RULE_cond_help = 5
    RULE_condition = 6
    RULE_action = 7
    RULE_direction = 8
    RULE_function = 9

    ruleNames =  [ "statements", "statement", "function_call", "if_statement", 
                   "while_statement", "cond_help", "condition", "action", 
                   "direction", "function" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    COMMENT=5
    IF=6
    WHILE=7
    NEGATION=8
    WALL=9
    ENEMY=10
    TREASURE=11
    TRAP=12
    AND=13
    OR=14
    FORWARD=15
    TURN=16
    ATTACK=17
    DISARM=18
    LEFT=19
    RIGHT=20
    FUN=21
    NAME=22
    WHITESPACE=23
    NEWLINE=24

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StatementsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(GrammarParser.StatementContext)
            else:
                return self.getTypedRuleContext(GrammarParser.StatementContext,i)


        def getRuleIndex(self):
            return GrammarParser.RULE_statements

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatements" ):
                listener.enterStatements(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatements" ):
                listener.exitStatements(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatements" ):
                return visitor.visitStatements(self)
            else:
                return visitor.visitChildren(self)




    def statements(self):

        localctx = GrammarParser.StatementsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_statements)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 21 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 20
                self.statement()
                self.state = 23 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << GrammarParser.IF) | (1 << GrammarParser.WHILE) | (1 << GrammarParser.FORWARD) | (1 << GrammarParser.TURN) | (1 << GrammarParser.ATTACK) | (1 << GrammarParser.DISARM) | (1 << GrammarParser.FUN) | (1 << GrammarParser.NAME))) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def if_statement(self):
            return self.getTypedRuleContext(GrammarParser.If_statementContext,0)


        def while_statement(self):
            return self.getTypedRuleContext(GrammarParser.While_statementContext,0)


        def action(self):
            return self.getTypedRuleContext(GrammarParser.ActionContext,0)


        def function(self):
            return self.getTypedRuleContext(GrammarParser.FunctionContext,0)


        def function_call(self):
            return self.getTypedRuleContext(GrammarParser.Function_callContext,0)


        def getRuleIndex(self):
            return GrammarParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = GrammarParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_statement)
        try:
            self.state = 30
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [GrammarParser.IF]:
                self.enterOuterAlt(localctx, 1)
                self.state = 25
                self.if_statement()
                pass
            elif token in [GrammarParser.WHILE]:
                self.enterOuterAlt(localctx, 2)
                self.state = 26
                self.while_statement()
                pass
            elif token in [GrammarParser.FORWARD, GrammarParser.TURN, GrammarParser.ATTACK, GrammarParser.DISARM]:
                self.enterOuterAlt(localctx, 3)
                self.state = 27
                self.action()
                pass
            elif token in [GrammarParser.FUN]:
                self.enterOuterAlt(localctx, 4)
                self.state = 28
                self.function()
                pass
            elif token in [GrammarParser.NAME]:
                self.enterOuterAlt(localctx, 5)
                self.state = 29
                self.function_call()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Function_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NAME(self):
            return self.getToken(GrammarParser.NAME, 0)

        def getRuleIndex(self):
            return GrammarParser.RULE_function_call

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction_call" ):
                listener.enterFunction_call(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction_call" ):
                listener.exitFunction_call(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunction_call" ):
                return visitor.visitFunction_call(self)
            else:
                return visitor.visitChildren(self)




    def function_call(self):

        localctx = GrammarParser.Function_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_function_call)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 32
            self.match(GrammarParser.NAME)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class If_statementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(GrammarParser.IF, 0)

        def cond_help(self):
            return self.getTypedRuleContext(GrammarParser.Cond_helpContext,0)


        def statements(self):
            return self.getTypedRuleContext(GrammarParser.StatementsContext,0)


        def getRuleIndex(self):
            return GrammarParser.RULE_if_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIf_statement" ):
                listener.enterIf_statement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIf_statement" ):
                listener.exitIf_statement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIf_statement" ):
                return visitor.visitIf_statement(self)
            else:
                return visitor.visitChildren(self)




    def if_statement(self):

        localctx = GrammarParser.If_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_if_statement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 34
            self.match(GrammarParser.IF)
            self.state = 35
            self.match(GrammarParser.T__0)
            self.state = 36
            self.cond_help(0)
            self.state = 37
            self.match(GrammarParser.T__1)
            self.state = 38
            self.match(GrammarParser.T__2)
            self.state = 39
            self.statements()
            self.state = 40
            self.match(GrammarParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class While_statementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHILE(self):
            return self.getToken(GrammarParser.WHILE, 0)

        def cond_help(self):
            return self.getTypedRuleContext(GrammarParser.Cond_helpContext,0)


        def statements(self):
            return self.getTypedRuleContext(GrammarParser.StatementsContext,0)


        def getRuleIndex(self):
            return GrammarParser.RULE_while_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhile_statement" ):
                listener.enterWhile_statement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhile_statement" ):
                listener.exitWhile_statement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhile_statement" ):
                return visitor.visitWhile_statement(self)
            else:
                return visitor.visitChildren(self)




    def while_statement(self):

        localctx = GrammarParser.While_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_while_statement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 42
            self.match(GrammarParser.WHILE)
            self.state = 43
            self.match(GrammarParser.T__0)
            self.state = 44
            self.cond_help(0)
            self.state = 45
            self.match(GrammarParser.T__1)
            self.state = 46
            self.match(GrammarParser.T__2)
            self.state = 47
            self.statements()
            self.state = 48
            self.match(GrammarParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Cond_helpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NEGATION(self):
            return self.getToken(GrammarParser.NEGATION, 0)

        def condition(self):
            return self.getTypedRuleContext(GrammarParser.ConditionContext,0)


        def cond_help(self):
            return self.getTypedRuleContext(GrammarParser.Cond_helpContext,0)


        def OR(self):
            return self.getToken(GrammarParser.OR, 0)

        def AND(self):
            return self.getToken(GrammarParser.AND, 0)

        def getRuleIndex(self):
            return GrammarParser.RULE_cond_help

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCond_help" ):
                listener.enterCond_help(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCond_help" ):
                listener.exitCond_help(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCond_help" ):
                return visitor.visitCond_help(self)
            else:
                return visitor.visitChildren(self)



    def cond_help(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = GrammarParser.Cond_helpContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 10
        self.enterRecursionRule(localctx, 10, self.RULE_cond_help, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 54
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [GrammarParser.NEGATION]:
                self.state = 51
                self.match(GrammarParser.NEGATION)
                self.state = 52
                self.condition()
                pass
            elif token in [GrammarParser.WALL, GrammarParser.ENEMY, GrammarParser.TREASURE, GrammarParser.TRAP]:
                self.state = 53
                self.condition()
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 64
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,4,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 62
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
                    if la_ == 1:
                        localctx = GrammarParser.Cond_helpContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_cond_help)
                        self.state = 56
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 57
                        self.match(GrammarParser.OR)
                        self.state = 58
                        self.condition()
                        pass

                    elif la_ == 2:
                        localctx = GrammarParser.Cond_helpContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_cond_help)
                        self.state = 59
                        if not self.precpred(self._ctx, 1):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 1)")
                        self.state = 60
                        self.match(GrammarParser.AND)
                        self.state = 61
                        self.condition()
                        pass

             
                self.state = 66
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class ConditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WALL(self):
            return self.getToken(GrammarParser.WALL, 0)

        def ENEMY(self):
            return self.getToken(GrammarParser.ENEMY, 0)

        def TRAP(self):
            return self.getToken(GrammarParser.TRAP, 0)

        def TREASURE(self):
            return self.getToken(GrammarParser.TREASURE, 0)

        def getRuleIndex(self):
            return GrammarParser.RULE_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondition" ):
                listener.enterCondition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondition" ):
                listener.exitCondition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondition" ):
                return visitor.visitCondition(self)
            else:
                return visitor.visitChildren(self)




    def condition(self):

        localctx = GrammarParser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_condition)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 67
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << GrammarParser.WALL) | (1 << GrammarParser.ENEMY) | (1 << GrammarParser.TREASURE) | (1 << GrammarParser.TRAP))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ActionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FORWARD(self):
            return self.getToken(GrammarParser.FORWARD, 0)

        def TURN(self):
            return self.getToken(GrammarParser.TURN, 0)

        def direction(self):
            return self.getTypedRuleContext(GrammarParser.DirectionContext,0)


        def ATTACK(self):
            return self.getToken(GrammarParser.ATTACK, 0)

        def DISARM(self):
            return self.getToken(GrammarParser.DISARM, 0)

        def getRuleIndex(self):
            return GrammarParser.RULE_action

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAction" ):
                listener.enterAction(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAction" ):
                listener.exitAction(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAction" ):
                return visitor.visitAction(self)
            else:
                return visitor.visitChildren(self)




    def action(self):

        localctx = GrammarParser.ActionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_action)
        try:
            self.state = 74
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [GrammarParser.FORWARD]:
                self.enterOuterAlt(localctx, 1)
                self.state = 69
                self.match(GrammarParser.FORWARD)
                pass
            elif token in [GrammarParser.TURN]:
                self.enterOuterAlt(localctx, 2)
                self.state = 70
                self.match(GrammarParser.TURN)
                self.state = 71
                self.direction()
                pass
            elif token in [GrammarParser.ATTACK]:
                self.enterOuterAlt(localctx, 3)
                self.state = 72
                self.match(GrammarParser.ATTACK)
                pass
            elif token in [GrammarParser.DISARM]:
                self.enterOuterAlt(localctx, 4)
                self.state = 73
                self.match(GrammarParser.DISARM)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DirectionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LEFT(self):
            return self.getToken(GrammarParser.LEFT, 0)

        def RIGHT(self):
            return self.getToken(GrammarParser.RIGHT, 0)

        def getRuleIndex(self):
            return GrammarParser.RULE_direction

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDirection" ):
                listener.enterDirection(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDirection" ):
                listener.exitDirection(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDirection" ):
                return visitor.visitDirection(self)
            else:
                return visitor.visitChildren(self)




    def direction(self):

        localctx = GrammarParser.DirectionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_direction)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 76
            _la = self._input.LA(1)
            if not(_la==GrammarParser.LEFT or _la==GrammarParser.RIGHT):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FUN(self):
            return self.getToken(GrammarParser.FUN, 0)

        def NAME(self):
            return self.getToken(GrammarParser.NAME, 0)

        def statements(self):
            return self.getTypedRuleContext(GrammarParser.StatementsContext,0)


        def getRuleIndex(self):
            return GrammarParser.RULE_function

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction" ):
                listener.enterFunction(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction" ):
                listener.exitFunction(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunction" ):
                return visitor.visitFunction(self)
            else:
                return visitor.visitChildren(self)




    def function(self):

        localctx = GrammarParser.FunctionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_function)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.match(GrammarParser.FUN)
            self.state = 79
            self.match(GrammarParser.NAME)
            self.state = 80
            self.match(GrammarParser.T__2)
            self.state = 81
            self.statements()
            self.state = 82
            self.match(GrammarParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[5] = self.cond_help_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def cond_help_sempred(self, localctx:Cond_helpContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 2)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 1)
         




