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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, COMMENT=7, IF=8, WHILE=9, 
		NEGATION=10, WALL=11, ENEMY=12, TREASURE=13, TRAP=14, AND=15, OR=16, FORWARD=17, 
		TURN=18, ATTACK=19, DISARM=20, LEFT=21, RIGHT=22, FUN=23, TRUE=24, FALSE=25, 
		FOR=26, PRINT=27, NAME=28, NUMBER=29, SOME_STRING=30, WHITESPACE=31, NEWLINE=32;
	public static final int
		RULE_statements = 0, RULE_statement = 1, RULE_function_call = 2, RULE_if_statement = 3, 
		RULE_while_statement = 4, RULE_for_statement = 5, RULE_print_statement = 6, 
		RULE_bracket_cond = 7, RULE_cond_help = 8, RULE_condition = 9, RULE_action = 10, 
		RULE_direction = 11, RULE_function = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"statements", "statement", "function_call", "if_statement", "while_statement", 
			"for_statement", "print_statement", "bracket_cond", "cond_help", "condition", 
			"action", "direction", "function"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'('", "')'", "'['", "']'", null, "'if'", "'while'", 
			"'NO'", "'WALL'", "'ENEMY'", "'TREASURE'", "'TRAP'", "'AND'", "'OR'", 
			"'forward'", "'turn'", "'attack'", "'disarm'", "'left'", "'right'", "'fun'", 
			"'TRUE'", "'FALSE'", "'FOR'", "'PRINT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "COMMENT", "IF", "WHILE", "NEGATION", 
			"WALL", "ENEMY", "TREASURE", "TRAP", "AND", "OR", "FORWARD", "TURN", 
			"ATTACK", "DISARM", "LEFT", "RIGHT", "FUN", "TRUE", "FALSE", "FOR", "PRINT", 
			"NAME", "NUMBER", "SOME_STRING", "WHITESPACE", "NEWLINE"
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				statement();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FORWARD) | (1L << TURN) | (1L << ATTACK) | (1L << DISARM) | (1L << FUN) | (1L << FOR) | (1L << PRINT) | (1L << NAME))) != 0) );
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
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
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
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				while_statement();
				}
				break;
			case FORWARD:
			case TURN:
			case ATTACK:
			case DISARM:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				action();
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				function();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(35);
				function_call();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(36);
				for_statement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(37);
				print_statement();
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(NAME);
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
		public Bracket_condContext bracket_cond() {
			return getRuleContext(Bracket_condContext.class,0);
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
		enterRule(_localctx, 6, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(IF);
			setState(43);
			match(T__0);
			setState(44);
			bracket_cond(0);
			setState(45);
			match(T__1);
			setState(46);
			match(T__2);
			setState(47);
			statements();
			setState(48);
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
		public Bracket_condContext bracket_cond() {
			return getRuleContext(Bracket_condContext.class,0);
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
		enterRule(_localctx, 8, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(WHILE);
			setState(51);
			match(T__0);
			setState(52);
			bracket_cond(0);
			setState(53);
			match(T__1);
			setState(54);
			match(T__2);
			setState(55);
			statements();
			setState(56);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(FOR);
			setState(59);
			match(T__0);
			setState(60);
			match(NUMBER);
			setState(61);
			match(T__1);
			setState(62);
			match(T__2);
			setState(63);
			statements();
			setState(64);
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

	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public TerminalNode SOME_STRING() { return getToken(GrammarParser.SOME_STRING, 0); }
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrint_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(PRINT);
			setState(67);
			match(T__0);
			setState(68);
			match(SOME_STRING);
			setState(69);
			match(T__1);
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

	public static class Bracket_condContext extends ParserRuleContext {
		public List<Bracket_condContext> bracket_cond() {
			return getRuleContexts(Bracket_condContext.class);
		}
		public Bracket_condContext bracket_cond(int i) {
			return getRuleContext(Bracket_condContext.class,i);
		}
		public TerminalNode NEGATION() { return getToken(GrammarParser.NEGATION, 0); }
		public Cond_helpContext cond_help() {
			return getRuleContext(Cond_helpContext.class,0);
		}
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public Bracket_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBracket_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBracket_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBracket_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracket_condContext bracket_cond() throws RecognitionException {
		return bracket_cond(0);
	}

	private Bracket_condContext bracket_cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bracket_condContext _localctx = new Bracket_condContext(_ctx, _parentState);
		Bracket_condContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_bracket_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(72);
				match(T__4);
				setState(73);
				bracket_cond(0);
				setState(74);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(76);
				match(NEGATION);
				setState(77);
				match(T__4);
				setState(78);
				bracket_cond(0);
				setState(79);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(81);
				cond_help(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(90);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Bracket_condContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bracket_cond);
						setState(84);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(85);
						match(OR);
						setState(86);
						bracket_cond(4);
						}
						break;
					case 2:
						{
						_localctx = new Bracket_condContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bracket_cond);
						setState(87);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(88);
						match(AND);
						setState(89);
						bracket_cond(3);
						}
						break;
					}
					} 
				}
				setState(94);
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

	public static class Cond_helpContext extends ParserRuleContext {
		public TerminalNode NEGATION() { return getToken(GrammarParser.NEGATION, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<Cond_helpContext> cond_help() {
			return getRuleContexts(Cond_helpContext.class);
		}
		public Cond_helpContext cond_help(int i) {
			return getRuleContext(Cond_helpContext.class,i);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_cond_help, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				{
				setState(96);
				match(NEGATION);
				setState(97);
				condition();
				}
				break;
			case WALL:
			case ENEMY:
			case TREASURE:
			case TRAP:
			case TRUE:
			case FALSE:
				{
				setState(98);
				condition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Cond_helpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond_help);
						setState(101);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(102);
						match(OR);
						setState(103);
						cond_help(3);
						}
						break;
					case 2:
						{
						_localctx = new Cond_helpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond_help);
						setState(104);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(105);
						match(AND);
						setState(106);
						cond_help(2);
						}
						break;
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode TREASURE() { return getToken(GrammarParser.TREASURE, 0); }
		public TerminalNode TRUE() { return getToken(GrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GrammarParser.FALSE, 0); }
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
		enterRule(_localctx, 18, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WALL) | (1L << ENEMY) | (1L << TREASURE) | (1L << TRAP) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_action);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORWARD:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(FORWARD);
				}
				break;
			case TURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(TURN);
				setState(116);
				direction();
				}
				break;
			case ATTACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(ATTACK);
				}
				break;
			case DISARM:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
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
		enterRule(_localctx, 22, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		enterRule(_localctx, 24, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(FUN);
			setState(124);
			match(NAME);
			setState(125);
			match(T__2);
			setState(126);
			statements();
			setState(127);
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
		case 7:
			return bracket_cond_sempred((Bracket_condContext)_localctx, predIndex);
		case 8:
			return cond_help_sempred((Cond_helpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bracket_cond_sempred(Bracket_condContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cond_help_sempred(Cond_helpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0084\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tU\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3\n\3\n\3\n\3\n\5\nf\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\nn\n\n\f\n\16\nq\13\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\5\fz\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\2\4\20\22\17"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\4\2\r\20\32\33\3\2\27\30\2\u0087"+
		"\2\35\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\b,\3\2\2\2\n\64\3\2\2\2\f<\3\2\2\2"+
		"\16D\3\2\2\2\20T\3\2\2\2\22e\3\2\2\2\24r\3\2\2\2\26y\3\2\2\2\30{\3\2\2"+
		"\2\32}\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2"+
		"\37 \3\2\2\2 \3\3\2\2\2!)\5\b\5\2\")\5\n\6\2#)\5\26\f\2$)\5\32\16\2%)"+
		"\5\6\4\2&)\5\f\7\2\')\5\16\b\2(!\3\2\2\2(\"\3\2\2\2(#\3\2\2\2($\3\2\2"+
		"\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\7\36\2\2+\7\3\2\2\2,-\7"+
		"\n\2\2-.\7\3\2\2./\5\20\t\2/\60\7\4\2\2\60\61\7\5\2\2\61\62\5\2\2\2\62"+
		"\63\7\6\2\2\63\t\3\2\2\2\64\65\7\13\2\2\65\66\7\3\2\2\66\67\5\20\t\2\67"+
		"8\7\4\2\289\7\5\2\29:\5\2\2\2:;\7\6\2\2;\13\3\2\2\2<=\7\34\2\2=>\7\3\2"+
		"\2>?\7\37\2\2?@\7\4\2\2@A\7\5\2\2AB\5\2\2\2BC\7\6\2\2C\r\3\2\2\2DE\7\35"+
		"\2\2EF\7\3\2\2FG\7 \2\2GH\7\4\2\2H\17\3\2\2\2IJ\b\t\1\2JK\7\7\2\2KL\5"+
		"\20\t\2LM\7\b\2\2MU\3\2\2\2NO\7\f\2\2OP\7\7\2\2PQ\5\20\t\2QR\7\b\2\2R"+
		"U\3\2\2\2SU\5\22\n\2TI\3\2\2\2TN\3\2\2\2TS\3\2\2\2U^\3\2\2\2VW\f\5\2\2"+
		"WX\7\22\2\2X]\5\20\t\6YZ\f\4\2\2Z[\7\21\2\2[]\5\20\t\5\\V\3\2\2\2\\Y\3"+
		"\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\21\3\2\2\2`^\3\2\2\2ab\b\n\1\2"+
		"bc\7\f\2\2cf\5\24\13\2df\5\24\13\2ea\3\2\2\2ed\3\2\2\2fo\3\2\2\2gh\f\4"+
		"\2\2hi\7\22\2\2in\5\22\n\5jk\f\3\2\2kl\7\21\2\2ln\5\22\n\4mg\3\2\2\2m"+
		"j\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\23\3\2\2\2qo\3\2\2\2rs\t\2\2"+
		"\2s\25\3\2\2\2tz\7\23\2\2uv\7\24\2\2vz\5\30\r\2wz\7\25\2\2xz\7\26\2\2"+
		"yt\3\2\2\2yu\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\27\3\2\2\2{|\t\3\2\2|\31\3\2"+
		"\2\2}~\7\31\2\2~\177\7\36\2\2\177\u0080\7\5\2\2\u0080\u0081\5\2\2\2\u0081"+
		"\u0082\7\6\2\2\u0082\33\3\2\2\2\13\37(T\\^emoy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}