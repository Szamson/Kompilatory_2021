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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, COMMENT=7, IF=8, WHILE=9, 
		NEGATION=10, WALL=11, ENEMY=12, TREASURE=13, TRAP=14, AND=15, OR=16, FORWARD=17, 
		TURN=18, ATTACK=19, DISARM=20, LEFT=21, RIGHT=22, FUN=23, TRUE=24, FALSE=25, 
		FOR=26, NAME=27, NUMBER=28, WHITESPACE=29, NEWLINE=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "COMMENT", "IF", "WHILE", 
			"NEGATION", "WALL", "ENEMY", "TREASURE", "TRAP", "AND", "OR", "FORWARD", 
			"TURN", "ATTACK", "DISARM", "LEFT", "RIGHT", "FUN", "TRUE", "FALSE", 
			"FOR", "NAME", "NUMBER", "WHITESPACE", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'('", "')'", "'['", "']'", null, "'if'", "'while'", 
			"'NO'", "'WALL'", "'ENEMY'", "'TREASURE'", "'TRAP'", "'AND'", "'OR'", 
			"'forward'", "'turn'", "'attack'", "'disarm'", "'left'", "'right'", "'fun'", 
			"'TRUE'", "'FALSE'", "'FOR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "COMMENT", "IF", "WHILE", "NEGATION", 
			"WALL", "ENEMY", "TREASURE", "TRAP", "AND", "OR", "FORWARD", "TURN", 
			"ATTACK", "DISARM", "LEFT", "RIGHT", "FUN", "TRUE", "FALSE", "FOR", "NAME", 
			"NUMBER", "WHITESPACE", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\bP\n\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\34\6\34\u00ba\n\34\r\34\16\34\u00bb\3\34\7\34\u00bf\n\34\f\34\16\34\u00c2"+
		"\13\34\3\35\3\35\7\35\u00c6\n\35\f\35\16\35\u00c9\13\35\3\36\3\36\3\36"+
		"\3\36\3\37\5\37\u00d0\n\37\3\37\3\37\6\37\u00d4\n\37\r\37\16\37\u00d5"+
		"\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= \3\2\7\4\2C\\c|\5\2\62;C\\c|\3\2\63;\3\2\62;\4\2\13"+
		"\13\"\"\2\u00df\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tE\3"+
		"\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21S\3\2\2\2\23V\3\2\2\2\25\\"+
		"\3\2\2\2\27_\3\2\2\2\31d\3\2\2\2\33j\3\2\2\2\35s\3\2\2\2\37x\3\2\2\2!"+
		"|\3\2\2\2#\177\3\2\2\2%\u0087\3\2\2\2\'\u008c\3\2\2\2)\u0093\3\2\2\2+"+
		"\u009a\3\2\2\2-\u009f\3\2\2\2/\u00a5\3\2\2\2\61\u00a9\3\2\2\2\63\u00ae"+
		"\3\2\2\2\65\u00b4\3\2\2\2\67\u00b9\3\2\2\29\u00c3\3\2\2\2;\u00ca\3\2\2"+
		"\2=\u00d3\3\2\2\2?@\7>\2\2@\4\3\2\2\2AB\7@\2\2B\6\3\2\2\2CD\7*\2\2D\b"+
		"\3\2\2\2EF\7+\2\2F\n\3\2\2\2GH\7]\2\2H\f\3\2\2\2IJ\7_\2\2J\16\3\2\2\2"+
		"KL\7\61\2\2LM\7\61\2\2MO\3\2\2\2NP\13\2\2\2ON\3\2\2\2OP\3\2\2\2PQ\3\2"+
		"\2\2QR\b\b\2\2R\20\3\2\2\2ST\7k\2\2TU\7h\2\2U\22\3\2\2\2VW\7y\2\2WX\7"+
		"j\2\2XY\7k\2\2YZ\7n\2\2Z[\7g\2\2[\24\3\2\2\2\\]\7P\2\2]^\7Q\2\2^\26\3"+
		"\2\2\2_`\7Y\2\2`a\7C\2\2ab\7N\2\2bc\7N\2\2c\30\3\2\2\2de\7G\2\2ef\7P\2"+
		"\2fg\7G\2\2gh\7O\2\2hi\7[\2\2i\32\3\2\2\2jk\7V\2\2kl\7T\2\2lm\7G\2\2m"+
		"n\7C\2\2no\7U\2\2op\7W\2\2pq\7T\2\2qr\7G\2\2r\34\3\2\2\2st\7V\2\2tu\7"+
		"T\2\2uv\7C\2\2vw\7R\2\2w\36\3\2\2\2xy\7C\2\2yz\7P\2\2z{\7F\2\2{ \3\2\2"+
		"\2|}\7Q\2\2}~\7T\2\2~\"\3\2\2\2\177\u0080\7h\2\2\u0080\u0081\7q\2\2\u0081"+
		"\u0082\7t\2\2\u0082\u0083\7y\2\2\u0083\u0084\7c\2\2\u0084\u0085\7t\2\2"+
		"\u0085\u0086\7f\2\2\u0086$\3\2\2\2\u0087\u0088\7v\2\2\u0088\u0089\7w\2"+
		"\2\u0089\u008a\7t\2\2\u008a\u008b\7p\2\2\u008b&\3\2\2\2\u008c\u008d\7"+
		"c\2\2\u008d\u008e\7v\2\2\u008e\u008f\7v\2\2\u008f\u0090\7c\2\2\u0090\u0091"+
		"\7e\2\2\u0091\u0092\7m\2\2\u0092(\3\2\2\2\u0093\u0094\7f\2\2\u0094\u0095"+
		"\7k\2\2\u0095\u0096\7u\2\2\u0096\u0097\7c\2\2\u0097\u0098\7t\2\2\u0098"+
		"\u0099\7o\2\2\u0099*\3\2\2\2\u009a\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7h\2\2\u009d\u009e\7v\2\2\u009e,\3\2\2\2\u009f\u00a0\7t\2\2\u00a0"+
		"\u00a1\7k\2\2\u00a1\u00a2\7i\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7v\2\2"+
		"\u00a4.\3\2\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7p\2"+
		"\2\u00a8\60\3\2\2\2\u00a9\u00aa\7V\2\2\u00aa\u00ab\7T\2\2\u00ab\u00ac"+
		"\7W\2\2\u00ac\u00ad\7G\2\2\u00ad\62\3\2\2\2\u00ae\u00af\7H\2\2\u00af\u00b0"+
		"\7C\2\2\u00b0\u00b1\7N\2\2\u00b1\u00b2\7U\2\2\u00b2\u00b3\7G\2\2\u00b3"+
		"\64\3\2\2\2\u00b4\u00b5\7H\2\2\u00b5\u00b6\7Q\2\2\u00b6\u00b7\7T\2\2\u00b7"+
		"\66\3\2\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2"+
		"\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf"+
		"\t\3\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c18\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c7\t\4\2\2"+
		"\u00c4\u00c6\t\5\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8:\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cb\t\6\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\36\2\2\u00cd<\3\2\2\2"+
		"\u00ce\u00d0\7\17\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d4\7\f\2\2\u00d2\u00d4\7\17\2\2\u00d3\u00cf\3\2\2\2"+
		"\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b\37\2\2\u00d8>\3\2\2\2\n\2O"+
		"\u00bb\u00c0\u00c7\u00cf\u00d3\u00d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}