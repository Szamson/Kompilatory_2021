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
		WALL=9, ENEMY=10, TREASURE=11, TRAP=12, AND=13, OR=14, FORWARD=15, TURN=16, 
		ATTACK=17, DISARM=18, LEFT=19, RIGHT=20, FUN=21, NAME=22, WHITESPACE=23, 
		NEWLINE=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "COMMENT", "IF", "WHILE", "NEGATION", 
			"WALL", "ENEMY", "TREASURE", "TRAP", "AND", "OR", "FORWARD", "TURN", 
			"ATTACK", "DISARM", "LEFT", "RIGHT", "FUN", "NAME", "WHITESPACE", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'('", "')'", null, "'if'", "'while'", "'NO'", "'WALL'", 
			"'ENEMY'", "'TREASURE'", "'TRAP'", "'AND'", "'OR'", "'forward'", "'turn'", 
			"'attack'", "'disarm'", "'left'", "'right'", "'fun'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "COMMENT", "IF", "WHILE", "NEGATION", "WALL", 
			"ENEMY", "TREASURE", "TRAP", "AND", "OR", "FORWARD", "TURN", "ATTACK", 
			"DISARM", "LEFT", "RIGHT", "FUN", "NAME", "WHITESPACE", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6@\n\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\6\27\u009b\n\27"+
		"\r\27\16\27\u009c\3\27\7\27\u00a0\n\27\f\27\16\27\u00a3\13\27\3\30\3\30"+
		"\3\30\3\30\3\31\5\31\u00aa\n\31\3\31\3\31\6\31\u00ae\n\31\r\31\16\31\u00af"+
		"\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\5\4\2"+
		"C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2\u00b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5"+
		"\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\rC\3\2\2\2\17F\3\2\2\2"+
		"\21L\3\2\2\2\23O\3\2\2\2\25T\3\2\2\2\27Z\3\2\2\2\31c\3\2\2\2\33h\3\2\2"+
		"\2\35l\3\2\2\2\37o\3\2\2\2!w\3\2\2\2#|\3\2\2\2%\u0083\3\2\2\2\'\u008a"+
		"\3\2\2\2)\u008f\3\2\2\2+\u0095\3\2\2\2-\u009a\3\2\2\2/\u00a4\3\2\2\2\61"+
		"\u00ad\3\2\2\2\63\64\7>\2\2\64\4\3\2\2\2\65\66\7@\2\2\66\6\3\2\2\2\67"+
		"8\7*\2\28\b\3\2\2\29:\7+\2\2:\n\3\2\2\2;<\7\61\2\2<=\7\61\2\2=?\3\2\2"+
		"\2>@\13\2\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\b\6\2\2B\f\3\2\2\2CD\7k"+
		"\2\2DE\7h\2\2E\16\3\2\2\2FG\7y\2\2GH\7j\2\2HI\7k\2\2IJ\7n\2\2JK\7g\2\2"+
		"K\20\3\2\2\2LM\7P\2\2MN\7Q\2\2N\22\3\2\2\2OP\7Y\2\2PQ\7C\2\2QR\7N\2\2"+
		"RS\7N\2\2S\24\3\2\2\2TU\7G\2\2UV\7P\2\2VW\7G\2\2WX\7O\2\2XY\7[\2\2Y\26"+
		"\3\2\2\2Z[\7V\2\2[\\\7T\2\2\\]\7G\2\2]^\7C\2\2^_\7U\2\2_`\7W\2\2`a\7T"+
		"\2\2ab\7G\2\2b\30\3\2\2\2cd\7V\2\2de\7T\2\2ef\7C\2\2fg\7R\2\2g\32\3\2"+
		"\2\2hi\7C\2\2ij\7P\2\2jk\7F\2\2k\34\3\2\2\2lm\7Q\2\2mn\7T\2\2n\36\3\2"+
		"\2\2op\7h\2\2pq\7q\2\2qr\7t\2\2rs\7y\2\2st\7c\2\2tu\7t\2\2uv\7f\2\2v "+
		"\3\2\2\2wx\7v\2\2xy\7w\2\2yz\7t\2\2z{\7p\2\2{\"\3\2\2\2|}\7c\2\2}~\7v"+
		"\2\2~\177\7v\2\2\177\u0080\7c\2\2\u0080\u0081\7e\2\2\u0081\u0082\7m\2"+
		"\2\u0082$\3\2\2\2\u0083\u0084\7f\2\2\u0084\u0085\7k\2\2\u0085\u0086\7"+
		"u\2\2\u0086\u0087\7c\2\2\u0087\u0088\7t\2\2\u0088\u0089\7o\2\2\u0089&"+
		"\3\2\2\2\u008a\u008b\7n\2\2\u008b\u008c\7g\2\2\u008c\u008d\7h\2\2\u008d"+
		"\u008e\7v\2\2\u008e(\3\2\2\2\u008f\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7i\2\2\u0092\u0093\7j\2\2\u0093\u0094\7v\2\2\u0094*\3\2\2\2\u0095"+
		"\u0096\7h\2\2\u0096\u0097\7w\2\2\u0097\u0098\7p\2\2\u0098,\3\2\2\2\u0099"+
		"\u009b\t\2\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0\t\3\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2.\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\t\4\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a7\b\30\2\2\u00a7\60\3\2\2\2\u00a8\u00aa\7\17\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\7\f"+
		"\2\2\u00ac\u00ae\7\17\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\b\31\2\2\u00b2\62\3\2\2\2\t\2?\u009c\u00a1\u00a9\u00ad"+
		"\u00af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}