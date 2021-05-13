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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31")
        buf.write("W\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3\2\3\2\7\2\32\n\2\f")
        buf.write("\2\16\2\35\13\2\3\3\3\3\3\3\3\3\5\3#\n\3\3\4\3\4\3\4\3")
        buf.write("\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6")
        buf.write("\3\6\3\6\3\6\5\69\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6A\n\6")
        buf.write("\f\6\16\6D\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bM\n\b\3")
        buf.write("\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\2\4\2\n\13\2\4\6\b")
        buf.write("\n\f\16\20\22\2\4\3\2\13\r\3\2\24\25\2W\2\24\3\2\2\2\4")
        buf.write("\"\3\2\2\2\6$\3\2\2\2\b,\3\2\2\2\n8\3\2\2\2\fE\3\2\2\2")
        buf.write("\16L\3\2\2\2\20N\3\2\2\2\22P\3\2\2\2\24\25\b\2\1\2\25")
        buf.write("\26\5\4\3\2\26\33\3\2\2\2\27\30\f\3\2\2\30\32\5\4\3\2")
        buf.write("\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2")
        buf.write("\2\34\3\3\2\2\2\35\33\3\2\2\2\36#\5\6\4\2\37#\5\b\5\2")
        buf.write(" #\5\16\b\2!#\5\22\n\2\"\36\3\2\2\2\"\37\3\2\2\2\" \3")
        buf.write("\2\2\2\"!\3\2\2\2#\5\3\2\2\2$%\7\b\2\2%&\7\3\2\2&\'\5")
        buf.write("\n\6\2\'(\7\4\2\2()\7\5\2\2)*\5\2\2\2*+\7\6\2\2+\7\3\2")
        buf.write("\2\2,-\7\t\2\2-.\7\3\2\2./\5\n\6\2/\60\7\4\2\2\60\61\7")
        buf.write("\5\2\2\61\62\5\2\2\2\62\63\7\6\2\2\63\t\3\2\2\2\64\65")
        buf.write("\b\6\1\2\65\66\7\n\2\2\669\5\f\7\2\679\5\f\7\28\64\3\2")
        buf.write("\2\28\67\3\2\2\29B\3\2\2\2:;\f\4\2\2;<\7\17\2\2<A\5\n")
        buf.write("\6\5=>\f\3\2\2>?\7\16\2\2?A\5\n\6\4@:\3\2\2\2@=\3\2\2")
        buf.write("\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\13\3\2\2\2DB\3\2\2\2")
        buf.write("EF\t\2\2\2F\r\3\2\2\2GM\7\20\2\2HI\7\21\2\2IM\5\20\t\2")
        buf.write("JM\7\22\2\2KM\7\23\2\2LG\3\2\2\2LH\3\2\2\2LJ\3\2\2\2L")
        buf.write("K\3\2\2\2M\17\3\2\2\2NO\t\3\2\2O\21\3\2\2\2PQ\7\26\2\2")
        buf.write("QR\7\27\2\2RS\7\5\2\2ST\5\2\2\2TU\7\6\2\2U\23\3\2\2\2")
        buf.write("\b\33\"8@BL")
        return buf.getvalue()


class GrammarParser ( Parser ):

    grammarFileName = "Grammar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'<'", "'>'", "'('", "')'", "<INVALID>", 
                     "'if'", "'while'", "'NO'", "'WALL'", "'ENEMY'", "'TRAP'", 
                     "'AND'", "'OR'", "'forward'", "'turn'", "'attack'", 
                     "'disarm'", "'left'", "'right'", "'fun'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "COMMENT", "IF", "WHILE", "NEGATION", 
                      "WALL", "ENEMY", "TRAP", "AND", "OR", "FORWARD", "TURN", 
                      "ATTACK", "DISARM", "LEFT", "RIGHT", "FUN", "NAME", 
                      "WHITESPACE", "NEWLINE" ]

    RULE_statements = 0
    RULE_statement = 1
    RULE_if_statement = 2
    RULE_while_statement = 3
    RULE_cond_help = 4
    RULE_condition = 5
    RULE_action = 6
    RULE_direction = 7
    RULE_function = 8

    ruleNames =  [ "statements", "statement", "if_statement", "while_statement", 
                   "cond_help", "condition", "action", "direction", "function" ]

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
    TRAP=11
    AND=12
    OR=13
    FORWARD=14
    TURN=15
    ATTACK=16
    DISARM=17
    LEFT=18
    RIGHT=19
    FUN=20
    NAME=21
    WHITESPACE=22
    NEWLINE=23

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

        def statement(self):
            return self.getTypedRuleContext(GrammarParser.StatementContext,0)


        def statements(self):
            return self.getTypedRuleContext(GrammarParser.StatementsContext,0)


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



    def statements(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = GrammarParser.StatementsContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 0
        self.enterRecursionRule(localctx, 0, self.RULE_statements, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 19
            self.statement()
            self._ctx.stop = self._input.LT(-1)
            self.state = 25
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,0,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = GrammarParser.StatementsContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_statements)
                    self.state = 21
                    if not self.precpred(self._ctx, 1):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 1)")
                    self.state = 22
                    self.statement() 
                self.state = 27
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,0,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
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
            self.state = 32
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [GrammarParser.IF]:
                self.enterOuterAlt(localctx, 1)
                self.state = 28
                self.if_statement()
                pass
            elif token in [GrammarParser.WHILE]:
                self.enterOuterAlt(localctx, 2)
                self.state = 29
                self.while_statement()
                pass
            elif token in [GrammarParser.FORWARD, GrammarParser.TURN, GrammarParser.ATTACK, GrammarParser.DISARM]:
                self.enterOuterAlt(localctx, 3)
                self.state = 30
                self.action()
                pass
            elif token in [GrammarParser.FUN]:
                self.enterOuterAlt(localctx, 4)
                self.state = 31
                self.function()
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
        self.enterRule(localctx, 4, self.RULE_if_statement)
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
            self.statements(0)
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
        self.enterRule(localctx, 6, self.RULE_while_statement)
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
            self.statements(0)
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


        def cond_help(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(GrammarParser.Cond_helpContext)
            else:
                return self.getTypedRuleContext(GrammarParser.Cond_helpContext,i)


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
        _startState = 8
        self.enterRecursionRule(localctx, 8, self.RULE_cond_help, _p)
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
            elif token in [GrammarParser.WALL, GrammarParser.ENEMY, GrammarParser.TRAP]:
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
                        self.cond_help(3)
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
                        self.cond_help(2)
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
        self.enterRule(localctx, 10, self.RULE_condition)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 67
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << GrammarParser.WALL) | (1 << GrammarParser.ENEMY) | (1 << GrammarParser.TRAP))) != 0)):
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
        self.enterRule(localctx, 12, self.RULE_action)
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
        self.enterRule(localctx, 14, self.RULE_direction)
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
        self.enterRule(localctx, 16, self.RULE_function)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.match(GrammarParser.FUN)
            self.state = 79
            self.match(GrammarParser.NAME)
            self.state = 80
            self.match(GrammarParser.T__2)
            self.state = 81
            self.statements(0)
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
        self._predicates[0] = self.statements_sempred
        self._predicates[4] = self.cond_help_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def statements_sempred(self, localctx:StatementsContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 1)
         

    def cond_help_sempred(self, localctx:Cond_helpContext, predIndex:int):
            if predIndex == 1:
                return self.precpred(self._ctx, 2)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 1)
         




