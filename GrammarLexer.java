// Generated from Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, COMMENT=5, IF=6, WHILE=7, NEGATION=8, 
		WALL=9, ENEMY=10, TRAP=11, AND=12, OR=13, FORWARD=14, TURN=15, ATTACK=16, 
		DISARM=17, LEFT=18, RIGHT=19, FUN=20, NAME=21, WHITESPACE=22, NEWLINE=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "COMMENT", "IF", "WHILE", "NEGATION", 
			"WALL", "ENEMY", "TRAP", "AND", "OR", "FORWARD", "TURN", "ATTACK", "DISARM", 
			"LEFT", "RIGHT", "FUN", "NAME", "WHITESPACE", "NEWLINE"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6>\n\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\6\26\u0090\n\26\r\26\16\26\u0091\3\26\7\26\u0095\n\26\f\26\16\26"+
		"\u0098\13\26\3\27\3\27\3\27\3\27\3\30\5\30\u009f\n\30\3\30\3\30\6\30\u00a3"+
		"\n\30\r\30\16\30\u00a4\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\3\2\5\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2\u00ad\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2"+
		"\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\rA\3\2\2\2\17D\3"+
		"\2\2\2\21J\3\2\2\2\23M\3\2\2\2\25R\3\2\2\2\27X\3\2\2\2\31]\3\2\2\2\33"+
		"a\3\2\2\2\35d\3\2\2\2\37l\3\2\2\2!q\3\2\2\2#x\3\2\2\2%\177\3\2\2\2\'\u0084"+
		"\3\2\2\2)\u008a\3\2\2\2+\u008f\3\2\2\2-\u0099\3\2\2\2/\u00a2\3\2\2\2\61"+
		"\62\7>\2\2\62\4\3\2\2\2\63\64\7@\2\2\64\6\3\2\2\2\65\66\7*\2\2\66\b\3"+
		"\2\2\2\678\7+\2\28\n\3\2\2\29:\7\61\2\2:;\7\61\2\2;=\3\2\2\2<>\13\2\2"+
		"\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\b\6\2\2@\f\3\2\2\2AB\7k\2\2BC\7h\2"+
		"\2C\16\3\2\2\2DE\7y\2\2EF\7j\2\2FG\7k\2\2GH\7n\2\2HI\7g\2\2I\20\3\2\2"+
		"\2JK\7P\2\2KL\7Q\2\2L\22\3\2\2\2MN\7Y\2\2NO\7C\2\2OP\7N\2\2PQ\7N\2\2Q"+
		"\24\3\2\2\2RS\7G\2\2ST\7P\2\2TU\7G\2\2UV\7O\2\2VW\7[\2\2W\26\3\2\2\2X"+
		"Y\7V\2\2YZ\7T\2\2Z[\7C\2\2[\\\7R\2\2\\\30\3\2\2\2]^\7C\2\2^_\7P\2\2_`"+
		"\7F\2\2`\32\3\2\2\2ab\7Q\2\2bc\7T\2\2c\34\3\2\2\2de\7h\2\2ef\7q\2\2fg"+
		"\7t\2\2gh\7y\2\2hi\7c\2\2ij\7t\2\2jk\7f\2\2k\36\3\2\2\2lm\7v\2\2mn\7w"+
		"\2\2no\7t\2\2op\7p\2\2p \3\2\2\2qr\7c\2\2rs\7v\2\2st\7v\2\2tu\7c\2\2u"+
		"v\7e\2\2vw\7m\2\2w\"\3\2\2\2xy\7f\2\2yz\7k\2\2z{\7u\2\2{|\7c\2\2|}\7t"+
		"\2\2}~\7o\2\2~$\3\2\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081\u0082"+
		"\7h\2\2\u0082\u0083\7v\2\2\u0083&\3\2\2\2\u0084\u0085\7t\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7i\2\2\u0087\u0088\7j\2\2\u0088\u0089\7v\2\2\u0089"+
		"(\3\2\2\2\u008a\u008b\7h\2\2\u008b\u008c\7w\2\2\u008c\u008d\7p\2\2\u008d"+
		"*\3\2\2\2\u008e\u0090\t\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2"+
		"\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0096\3\2\2\2\u0093\u0095"+
		"\t\3\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097,\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\t\4\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u009c\b\27\2\2\u009c.\3\2\2\2\u009d\u009f\7"+
		"\17\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a3\7\f\2\2\u00a1\u00a3\7\17\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a1\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\b\30\2\2\u00a7\60\3\2\2\2\t\2=\u0091\u0096"+
		"\u009e\u00a2\u00a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}