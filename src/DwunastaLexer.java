// Generated from Dwunasta.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DwunastaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IF=4, ENDIF=5, THEN=6, BEGINFUNCTION=7, LOOP_BEGIN=8, 
		LOOP_END=9, ENDFUNCTION=10, PRINT=11, LEFT_SQ_BRCKT=12, RIGHT_SQ_BRCKT=13, 
		READ=14, ARRAY=15, CASTINT=16, ASSIGN=17, CASTREAL=18, ID=19, REAL=20, 
		INT=21, ADD=22, SEMICOLON=23, SUB=24, STRING=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "IF", "ENDIF", "THEN", "BEGINFUNCTION", "LOOP_BEGIN", 
			"LOOP_END", "ENDFUNCTION", "PRINT", "LEFT_SQ_BRCKT", "RIGHT_SQ_BRCKT", 
			"READ", "ARRAY", "CASTINT", "ASSIGN", "CASTREAL", "ID", "REAL", "INT", 
			"ADD", "SEMICOLON", "SUB", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=='", "'('", "')'", "'if'", "'endif'", "'then'", "'beginf'", 
			"'loop'", "'endloop'", "'endf'", "'print'", "'['", "']'", "'scan'", null, 
			"'(int)'", "'='", "'(real)'", null, null, null, "'+'", "';'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IF", "ENDIF", "THEN", "BEGINFUNCTION", "LOOP_BEGIN", 
			"LOOP_END", "ENDFUNCTION", "PRINT", "LEFT_SQ_BRCKT", "RIGHT_SQ_BRCKT", 
			"READ", "ARRAY", "CASTINT", "ASSIGN", "CASTREAL", "ID", "REAL", "INT", 
			"ADD", "SEMICOLON", "SUB", "STRING", "WS"
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


	public DwunastaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Dwunasta.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\6\20w\n\20\r\20\16\20x\3\20\5\20|\n\20\6\20~\n\20\r\20\16"+
		"\20\177\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\6\24\u0094\n\24\r\24\16\24\u0095\3\25\6\25"+
		"\u0099\n\25\r\25\16\25\u009a\3\25\3\25\6\25\u009f\n\25\r\25\16\25\u00a0"+
		"\3\26\6\26\u00a4\n\26\r\26\16\26\u00a5\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\7\32\u00b0\n\32\f\32\16\32\u00b3\13\32\3\32\3\32\3\33\6\33\u00b8"+
		"\n\33\r\33\16\33\u00b9\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\3\2\5\4\2C\\c|\4\2$$^^\5\2\13\f\17\17\"\"\2"+
		"\u00c5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5:\3\2\2"+
		"\2\7<\3\2\2\2\t>\3\2\2\2\13A\3\2\2\2\rG\3\2\2\2\17L\3\2\2\2\21S\3\2\2"+
		"\2\23X\3\2\2\2\25`\3\2\2\2\27e\3\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35o\3\2"+
		"\2\2\37t\3\2\2\2!\u0083\3\2\2\2#\u0089\3\2\2\2%\u008b\3\2\2\2\'\u0093"+
		"\3\2\2\2)\u0098\3\2\2\2+\u00a3\3\2\2\2-\u00a7\3\2\2\2/\u00a9\3\2\2\2\61"+
		"\u00ab\3\2\2\2\63\u00ad\3\2\2\2\65\u00b7\3\2\2\2\678\7?\2\289\7?\2\29"+
		"\4\3\2\2\2:;\7*\2\2;\6\3\2\2\2<=\7+\2\2=\b\3\2\2\2>?\7k\2\2?@\7h\2\2@"+
		"\n\3\2\2\2AB\7g\2\2BC\7p\2\2CD\7f\2\2DE\7k\2\2EF\7h\2\2F\f\3\2\2\2GH\7"+
		"v\2\2HI\7j\2\2IJ\7g\2\2JK\7p\2\2K\16\3\2\2\2LM\7d\2\2MN\7g\2\2NO\7i\2"+
		"\2OP\7k\2\2PQ\7p\2\2QR\7h\2\2R\20\3\2\2\2ST\7n\2\2TU\7q\2\2UV\7q\2\2V"+
		"W\7r\2\2W\22\3\2\2\2XY\7g\2\2YZ\7p\2\2Z[\7f\2\2[\\\7n\2\2\\]\7q\2\2]^"+
		"\7q\2\2^_\7r\2\2_\24\3\2\2\2`a\7g\2\2ab\7p\2\2bc\7f\2\2cd\7h\2\2d\26\3"+
		"\2\2\2ef\7r\2\2fg\7t\2\2gh\7k\2\2hi\7p\2\2ij\7v\2\2j\30\3\2\2\2kl\7]\2"+
		"\2l\32\3\2\2\2mn\7_\2\2n\34\3\2\2\2op\7u\2\2pq\7e\2\2qr\7c\2\2rs\7p\2"+
		"\2s\36\3\2\2\2t}\7]\2\2uw\4\62;\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2"+
		"\2\2y{\3\2\2\2z|\7.\2\2{z\3\2\2\2{|\3\2\2\2|~\3\2\2\2}v\3\2\2\2~\177\3"+
		"\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
		"\7_\2\2\u0082 \3\2\2\2\u0083\u0084\7*\2\2\u0084\u0085\7k\2\2\u0085\u0086"+
		"\7p\2\2\u0086\u0087\7v\2\2\u0087\u0088\7+\2\2\u0088\"\3\2\2\2\u0089\u008a"+
		"\7?\2\2\u008a$\3\2\2\2\u008b\u008c\7*\2\2\u008c\u008d\7t\2\2\u008d\u008e"+
		"\7g\2\2\u008e\u008f\7c\2\2\u008f\u0090\7n\2\2\u0090\u0091\7+\2\2\u0091"+
		"&\3\2\2\2\u0092\u0094\t\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096(\3\2\2\2\u0097\u0099\4"+
		"\62;\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\7\60\2\2\u009d\u009f\4"+
		"\62;\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1*\3\2\2\2\u00a2\u00a4\4\62;\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6,\3"+
		"\2\2\2\u00a7\u00a8\7-\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7=\2\2\u00aa\60\3"+
		"\2\2\2\u00ab\u00ac\7/\2\2\u00ac\62\3\2\2\2\u00ad\u00b1\7$\2\2\u00ae\u00b0"+
		"\n\3\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7$"+
		"\2\2\u00b5\64\3\2\2\2\u00b6\u00b8\t\4\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\b\33\2\2\u00bc\66\3\2\2\2\f\2x{\177\u0095\u009a\u00a0\u00a5\u00b1"+
		"\u00b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}