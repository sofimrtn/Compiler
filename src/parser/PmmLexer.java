// Generated from C:/Users/msame/IdeaProjects/Compiler/src/parser\Pmm.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, PRINT=33, RETURN=34, INPUT=35, DEF=36, STRUCT=37, ONE_LINE_COMMENT=38, 
		COMMENT=39, WHITESPACE=40, INT_CONSTANT=41, REAL_CONSTANT=42, CHAR_CONSTANT=43, 
		ID=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "PRINT", 
			"RETURN", "INPUT", "DEF", "STRUCT", "ONE_LINE_COMMENT", "COMMENT", "WHITESPACE", 
			"INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", 
			"'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'='", "','", "';'", "'while'", "':'", "'{'", "'}'", "'if'", "'else'", 
			"'int'", "'char'", "'double'", "'void'", "'print'", "'return'", "'input'", 
			"'def'", "'struct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "PRINT", "RETURN", 
			"INPUT", "DEF", "STRUCT", "ONE_LINE_COMMENT", "COMMENT", "WHITESPACE", 
			"INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u014d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\7\'\u00d7\n\'\f\'\16\'\u00da\13\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\7(\u00e3\n(\f(\16(\u00e6\13(\3(\3(\3(\3(\3(\3"+
		"(\3)\6)\u00ef\n)\r)\16)\u00f0\3)\3)\3*\3*\3*\7*\u00f8\n*\f*\16*\u00fb"+
		"\13*\5*\u00fd\n*\3+\5+\u0100\n+\3+\3+\6+\u0104\n+\r+\16+\u0105\3+\3+\3"+
		"+\3+\3+\3+\5+\u010e\n+\3+\6+\u0111\n+\r+\16+\u0112\3+\3+\3+\7+\u0118\n"+
		"+\f+\16+\u011b\13+\3+\3+\5+\u011f\n+\3+\6+\u0122\n+\r+\16+\u0123\5+\u0126"+
		"\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\5,\u0145\n,\3-\3-\7-\u0149\n-\f-\16-\u014c\13-\3"+
		"\u00e4\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\13\4\2\f\f\16\17\7\2\13"+
		"\f\16\17\"\"GHQQ\3\2\63;\3\2\62;\4\2GGgg\4\2--//\4\2C\\c|\5\2C\\aac|\6"+
		"\2\62;C\\aac|\2\u0162\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3"+
		"\2\2\2\7_\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17g\3\2\2\2\21i\3"+
		"\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2\2\2\35"+
		"v\3\2\2\2\37x\3\2\2\2!{\3\2\2\2#~\3\2\2\2%\u0081\3\2\2\2\'\u0084\3\2\2"+
		"\2)\u0087\3\2\2\2+\u0089\3\2\2\2-\u008b\3\2\2\2/\u008d\3\2\2\2\61\u0093"+
		"\3\2\2\2\63\u0095\3\2\2\2\65\u0097\3\2\2\2\67\u0099\3\2\2\29\u009c\3\2"+
		"\2\2;\u00a1\3\2\2\2=\u00a5\3\2\2\2?\u00aa\3\2\2\2A\u00b1\3\2\2\2C\u00b6"+
		"\3\2\2\2E\u00bc\3\2\2\2G\u00c3\3\2\2\2I\u00c9\3\2\2\2K\u00cd\3\2\2\2M"+
		"\u00d4\3\2\2\2O\u00dd\3\2\2\2Q\u00ee\3\2\2\2S\u00fc\3\2\2\2U\u0125\3\2"+
		"\2\2W\u0144\3\2\2\2Y\u0146\3\2\2\2[\\\7*\2\2\\\4\3\2\2\2]^\7+\2\2^\6\3"+
		"\2\2\2_`\7]\2\2`\b\3\2\2\2ab\7_\2\2b\n\3\2\2\2cd\7\60\2\2d\f\3\2\2\2e"+
		"f\7/\2\2f\16\3\2\2\2gh\7#\2\2h\20\3\2\2\2ij\7,\2\2j\22\3\2\2\2kl\7\61"+
		"\2\2l\24\3\2\2\2mn\7\'\2\2n\26\3\2\2\2op\7-\2\2p\30\3\2\2\2qr\7@\2\2r"+
		"\32\3\2\2\2st\7@\2\2tu\7?\2\2u\34\3\2\2\2vw\7>\2\2w\36\3\2\2\2xy\7>\2"+
		"\2yz\7?\2\2z \3\2\2\2{|\7#\2\2|}\7?\2\2}\"\3\2\2\2~\177\7?\2\2\177\u0080"+
		"\7?\2\2\u0080$\3\2\2\2\u0081\u0082\7(\2\2\u0082\u0083\7(\2\2\u0083&\3"+
		"\2\2\2\u0084\u0085\7~\2\2\u0085\u0086\7~\2\2\u0086(\3\2\2\2\u0087\u0088"+
		"\7?\2\2\u0088*\3\2\2\2\u0089\u008a\7.\2\2\u008a,\3\2\2\2\u008b\u008c\7"+
		"=\2\2\u008c.\3\2\2\2\u008d\u008e\7y\2\2\u008e\u008f\7j\2\2\u008f\u0090"+
		"\7k\2\2\u0090\u0091\7n\2\2\u0091\u0092\7g\2\2\u0092\60\3\2\2\2\u0093\u0094"+
		"\7<\2\2\u0094\62\3\2\2\2\u0095\u0096\7}\2\2\u0096\64\3\2\2\2\u0097\u0098"+
		"\7\177\2\2\u0098\66\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7h\2\2\u009b"+
		"8\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7n\2\2\u009e\u009f\7u\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0:\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4<\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7j\2\2\u00a7"+
		"\u00a8\7c\2\2\u00a8\u00a9\7t\2\2\u00a9>\3\2\2\2\u00aa\u00ab\7f\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af\7n\2\2"+
		"\u00af\u00b0\7g\2\2\u00b0@\3\2\2\2\u00b1\u00b2\7x\2\2\u00b2\u00b3\7q\2"+
		"\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7f\2\2\u00b5B\3\2\2\2\u00b6\u00b7\7"+
		"r\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bbD\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7g\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7p\2\2\u00c2"+
		"F\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7r\2\2\u00c6"+
		"\u00c7\7w\2\2\u00c7\u00c8\7v\2\2\u00c8H\3\2\2\2\u00c9\u00ca\7f\2\2\u00ca"+
		"\u00cb\7g\2\2\u00cb\u00cc\7h\2\2\u00ccJ\3\2\2\2\u00cd\u00ce\7u\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7e\2\2"+
		"\u00d2\u00d3\7v\2\2\u00d3L\3\2\2\2\u00d4\u00d8\7%\2\2\u00d5\u00d7\n\2"+
		"\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\b\'"+
		"\2\2\u00dcN\3\2\2\2\u00dd\u00de\7$\2\2\u00de\u00df\7$\2\2\u00df\u00e0"+
		"\7$\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e3\13\2\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7$\2\2\u00e8\u00e9\7$\2\2\u00e9\u00ea"+
		"\7$\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b(\2\2\u00ecP\3\2\2\2\u00ed\u00ef"+
		"\t\3\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b)\2\2\u00f3R\3\2\2\2\u00f4"+
		"\u00fd\7\62\2\2\u00f5\u00f9\t\4\2\2\u00f6\u00f8\t\5\2\2\u00f7\u00f6\3"+
		"\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f5\3\2"+
		"\2\2\u00fdT\3\2\2\2\u00fe\u0100\5S*\2\u00ff\u00fe\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\7\60\2\2\u0102\u0104\t\5\2\2"+
		"\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0126\3\2\2\2\u0107\u0108\5S*\2\u0108\u0109\7\60\2\2\u0109"+
		"\u0126\3\2\2\2\u010a\u010b\5S*\2\u010b\u010d\t\6\2\2\u010c\u010e\t\7\2"+
		"\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u0111"+
		"\t\5\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0126\3\2\2\2\u0114\u0115\5S*\2\u0115\u0119\7\60"+
		"\2\2\u0116\u0118\t\5\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011c\u011e\t\6\2\2\u011d\u011f\t\7\2\2\u011e\u011d\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u0122\t\5\2\2\u0121\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u00ff\3\2\2\2\u0125\u0107\3\2\2\2\u0125\u010a\3\2"+
		"\2\2\u0125\u0114\3\2\2\2\u0126V\3\2\2\2\u0127\u0128\7)\2\2\u0128\u0129"+
		"\t\b\2\2\u0129\u0145\7)\2\2\u012a\u012b\7)\2\2\u012b\u012c\7\60\2\2\u012c"+
		"\u0145\7)\2\2\u012d\u012e\7)\2\2\u012e\u012f\7^\2\2\u012f\u0130\5S*\2"+
		"\u0130\u0131\5S*\2\u0131\u0132\5S*\2\u0132\u0133\7)\2\2\u0133\u0145\3"+
		"\2\2\2\u0134\u0135\7)\2\2\u0135\u0136\7^\2\2\u0136\u0137\7p\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0145\7)\2\2\u0139\u013a\7)\2\2\u013a\u013b\7^\2"+
		"\2\u013b\u013c\7v\2\2\u013c\u013d\3\2\2\2\u013d\u0145\7)\2\2\u013e\u013f"+
		"\7)\2\2\u013f\u0140\7/\2\2\u0140\u0145\7)\2\2\u0141\u0142\7)\2\2\u0142"+
		"\u0143\7\u0080\2\2\u0143\u0145\7)\2\2\u0144\u0127\3\2\2\2\u0144\u012a"+
		"\3\2\2\2\u0144\u012d\3\2\2\2\u0144\u0134\3\2\2\2\u0144\u0139\3\2\2\2\u0144"+
		"\u013e\3\2\2\2\u0144\u0141\3\2\2\2\u0145X\3\2\2\2\u0146\u014a\t\t\2\2"+
		"\u0147\u0149\t\n\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014bZ\3\2\2\2\u014c\u014a\3\2\2\2\22\2\u00d8"+
		"\u00e4\u00f0\u00f9\u00fc\u00ff\u0105\u010d\u0112\u0119\u011e\u0123\u0125"+
		"\u0144\u014a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}