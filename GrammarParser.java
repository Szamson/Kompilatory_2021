// Generated from Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, COMMENT=5, IF=6, WHILE=7, NEGATION=8, 
		WALL=9, ENEMY=10, TRAP=11, AND=12, OR=13, FORWARD=14, TURN=15, ATTACK=16, 
		DISARM=17, LEFT=18, RIGHT=19, FUN=20, NAME=21, WHITESPACE=22, NEWLINE=23;
	public static final int
		RULE_statements = 0, RULE_statement = 1, RULE_if_statement = 2, RULE_while_statement = 3, 
		RULE_cond_help = 4, RULE_condition = 5, RULE_action = 6, RULE_direction = 7, 
		RULE_function = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"statements", "statement", "if_statement", "while_statement", "cond_help", 
			"condition", "action", "direction", "function"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'('", "')'", null, "'if'", "'while'", "'NO'", "'WALL'", 
			"'ENEMY'", "'TRAP'", "'AND'", "'OR'", "'forward'", "'turn'", "'attack'", 
			"'disarm'", "'left'", "'right'", "'fun'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "COMMENT", "IF", "WHILE", "NEGATION", "WALL", 
			"ENEMY", "TRAP", "AND", "OR", "FORWARD", "TURN", "ATTACK", "DISARM", 
			"LEFT", "RIGHT", "FUN", "NAME", "WHITESPACE", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				statement();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FORWARD) | (1L << TURN) | (1L << ATTACK) | (1L << DISARM) | (1L << FUN))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				while_statement();
				}
				break;
			case FORWARD:
			case TURN:
			case ATTACK:
			case DISARM:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				action();
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public Cond_helpContext cond_help() {
			return getRuleContext(Cond_helpContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(IF);
			setState(30);
			match(T__0);
			setState(31);
			cond_help(0);
			setState(32);
			match(T__1);
			setState(33);
			match(T__2);
			setState(34);
			statements();
			setState(35);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public Cond_helpContext cond_help() {
			return getRuleContext(Cond_helpContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(WHILE);
			setState(38);
			match(T__0);
			setState(39);
			cond_help(0);
			setState(40);
			match(T__1);
			setState(41);
			match(T__2);
			setState(42);
			statements();
			setState(43);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_helpContext extends ParserRuleContext {
		public TerminalNode NEGATION() { return getToken(GrammarParser.NEGATION, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Cond_helpContext cond_help() {
			return getRuleContext(Cond_helpContext.class,0);
		}
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public Cond_helpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_help; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCond_help(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCond_help(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCond_help(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_helpContext cond_help() throws RecognitionException {
		return cond_help(0);
	}

	private Cond_helpContext cond_help(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Cond_helpContext _localctx = new Cond_helpContext(_ctx, _parentState);
		Cond_helpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_cond_help, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				{
				setState(46);
				match(NEGATION);
				setState(47);
				condition();
				}
				break;
			case WALL:
			case ENEMY:
			case TRAP:
				{
				setState(48);
				condition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(57);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Cond_helpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond_help);
						setState(51);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(52);
						match(OR);
						setState(53);
						condition();
						}
						break;
					case 2:
						{
						_localctx = new Cond_helpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond_help);
						setState(54);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(55);
						match(AND);
						setState(56);
						condition();
						}
						break;
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode WALL() { return getToken(GrammarParser.WALL, 0); }
		public TerminalNode ENEMY() { return getToken(GrammarParser.ENEMY, 0); }
		public TerminalNode TRAP() { return getToken(GrammarParser.TRAP, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WALL) | (1L << ENEMY) | (1L << TRAP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode FORWARD() { return getToken(GrammarParser.FORWARD, 0); }
		public TerminalNode TURN() { return getToken(GrammarParser.TURN, 0); }
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public TerminalNode ATTACK() { return getToken(GrammarParser.ATTACK, 0); }
		public TerminalNode DISARM() { return getToken(GrammarParser.DISARM, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_action);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORWARD:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(FORWARD);
				}
				break;
			case TURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(TURN);
				setState(66);
				direction();
				}
				break;
			case ATTACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(ATTACK);
				}
				break;
			case DISARM:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(DISARM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(GrammarParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(GrammarParser.RIGHT, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==LEFT || _la==RIGHT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(GrammarParser.FUN, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(FUN);
			setState(74);
			match(NAME);
			setState(75);
			match(T__2);
			setState(76);
			statements();
			setState(77);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return cond_help_sempred((Cond_helpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_help_sempred(Cond_helpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\64\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6<\n\6\f\6\16\6?\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\5\bH\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\2\3\n\13\2\4\6\b\n\f\16"+
		"\20\22\2\4\3\2\13\r\3\2\24\25\2R\2\25\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2"+
		"\2\b\'\3\2\2\2\n\63\3\2\2\2\f@\3\2\2\2\16G\3\2\2\2\20I\3\2\2\2\22K\3\2"+
		"\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2"+
		"\2\2\30\3\3\2\2\2\31\36\5\6\4\2\32\36\5\b\5\2\33\36\5\16\b\2\34\36\5\22"+
		"\n\2\35\31\3\2\2\2\35\32\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2"+
		"\2\2\37 \7\b\2\2 !\7\3\2\2!\"\5\n\6\2\"#\7\4\2\2#$\7\5\2\2$%\5\2\2\2%"+
		"&\7\6\2\2&\7\3\2\2\2\'(\7\t\2\2()\7\3\2\2)*\5\n\6\2*+\7\4\2\2+,\7\5\2"+
		"\2,-\5\2\2\2-.\7\6\2\2.\t\3\2\2\2/\60\b\6\1\2\60\61\7\n\2\2\61\64\5\f"+
		"\7\2\62\64\5\f\7\2\63/\3\2\2\2\63\62\3\2\2\2\64=\3\2\2\2\65\66\f\4\2\2"+
		"\66\67\7\17\2\2\67<\5\f\7\289\f\3\2\29:\7\16\2\2:<\5\f\7\2;\65\3\2\2\2"+
		";8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\13\3\2\2\2?=\3\2\2\2@A\t\2\2"+
		"\2A\r\3\2\2\2BH\7\20\2\2CD\7\21\2\2DH\5\20\t\2EH\7\22\2\2FH\7\23\2\2G"+
		"B\3\2\2\2GC\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\17\3\2\2\2IJ\t\3\2\2J\21\3\2"+
		"\2\2KL\7\26\2\2LM\7\27\2\2MN\7\5\2\2NO\5\2\2\2OP\7\6\2\2P\23\3\2\2\2\b"+
		"\27\35\63;=G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}