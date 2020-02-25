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
		T__31=32, PRINT=33, RETURN=34, INPUT=35, DEF=36, STRUCT=37, MAIN=38, ONE_LINE_COMMENT=39, 
		COMMENT=40, WHITESPACE=41, INT_CONSTANT=42, REAL_CONSTANT=43, CHAR_CONSTANT=44, 
		ID=45;
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
			"RETURN", "INPUT", "DEF", "STRUCT", "MAIN", "ONE_LINE_COMMENT", "COMMENT", 
			"WHITESPACE", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", 
			"'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'='", "','", "';'", "'while'", "':'", "'{'", "'}'", "'if'", "'else'", 
			"'int'", "'char'", "'double'", "'void'", "'print'", "'return'", "'input'", 
			"'def'", "'struct'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "PRINT", "RETURN", 
			"INPUT", "DEF", "STRUCT", "MAIN", "ONE_LINE_COMMENT", "COMMENT", "WHITESPACE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0154\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\7(\u00de"+
		"\n(\f(\16(\u00e1\13(\3(\3(\3)\3)\3)\3)\3)\7)\u00ea\n)\f)\16)\u00ed\13"+
		")\3)\3)\3)\3)\3)\3)\3*\6*\u00f6\n*\r*\16*\u00f7\3*\3*\3+\3+\3+\7+\u00ff"+
		"\n+\f+\16+\u0102\13+\5+\u0104\n+\3,\5,\u0107\n,\3,\3,\6,\u010b\n,\r,\16"+
		",\u010c\3,\3,\3,\3,\3,\3,\5,\u0115\n,\3,\6,\u0118\n,\r,\16,\u0119\3,\3"+
		",\3,\7,\u011f\n,\f,\16,\u0122\13,\3,\3,\5,\u0126\n,\3,\6,\u0129\n,\r,"+
		"\16,\u012a\5,\u012d\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u014c\n-\3.\3.\7.\u0150\n"+
		".\f.\16.\u0153\13.\3\u00eb\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\13"+
		"\4\2\f\f\16\17\7\2\13\f\16\17\"\"GHQQ\3\2\63;\3\2\62;\4\2GGgg\4\2--//"+
		"\4\2C\\c|\5\2C\\aac|\6\2\62;C\\aac|\2\u0169\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2\tc\3\2\2\2\13e\3\2"+
		"\2\2\rg\3\2\2\2\17i\3\2\2\2\21k\3\2\2\2\23m\3\2\2\2\25o\3\2\2\2\27q\3"+
		"\2\2\2\31s\3\2\2\2\33u\3\2\2\2\35x\3\2\2\2\37z\3\2\2\2!}\3\2\2\2#\u0080"+
		"\3\2\2\2%\u0083\3\2\2\2\'\u0086\3\2\2\2)\u0089\3\2\2\2+\u008b\3\2\2\2"+
		"-\u008d\3\2\2\2/\u008f\3\2\2\2\61\u0095\3\2\2\2\63\u0097\3\2\2\2\65\u0099"+
		"\3\2\2\2\67\u009b\3\2\2\29\u009e\3\2\2\2;\u00a3\3\2\2\2=\u00a7\3\2\2\2"+
		"?\u00ac\3\2\2\2A\u00b3\3\2\2\2C\u00b8\3\2\2\2E\u00be\3\2\2\2G\u00c5\3"+
		"\2\2\2I\u00cb\3\2\2\2K\u00cf\3\2\2\2M\u00d6\3\2\2\2O\u00db\3\2\2\2Q\u00e4"+
		"\3\2\2\2S\u00f5\3\2\2\2U\u0103\3\2\2\2W\u012c\3\2\2\2Y\u014b\3\2\2\2["+
		"\u014d\3\2\2\2]^\7*\2\2^\4\3\2\2\2_`\7+\2\2`\6\3\2\2\2ab\7]\2\2b\b\3\2"+
		"\2\2cd\7_\2\2d\n\3\2\2\2ef\7\60\2\2f\f\3\2\2\2gh\7/\2\2h\16\3\2\2\2ij"+
		"\7#\2\2j\20\3\2\2\2kl\7,\2\2l\22\3\2\2\2mn\7\61\2\2n\24\3\2\2\2op\7\'"+
		"\2\2p\26\3\2\2\2qr\7-\2\2r\30\3\2\2\2st\7@\2\2t\32\3\2\2\2uv\7@\2\2vw"+
		"\7?\2\2w\34\3\2\2\2xy\7>\2\2y\36\3\2\2\2z{\7>\2\2{|\7?\2\2| \3\2\2\2}"+
		"~\7#\2\2~\177\7?\2\2\177\"\3\2\2\2\u0080\u0081\7?\2\2\u0081\u0082\7?\2"+
		"\2\u0082$\3\2\2\2\u0083\u0084\7(\2\2\u0084\u0085\7(\2\2\u0085&\3\2\2\2"+
		"\u0086\u0087\7~\2\2\u0087\u0088\7~\2\2\u0088(\3\2\2\2\u0089\u008a\7?\2"+
		"\2\u008a*\3\2\2\2\u008b\u008c\7.\2\2\u008c,\3\2\2\2\u008d\u008e\7=\2\2"+
		"\u008e.\3\2\2\2\u008f\u0090\7y\2\2\u0090\u0091\7j\2\2\u0091\u0092\7k\2"+
		"\2\u0092\u0093\7n\2\2\u0093\u0094\7g\2\2\u0094\60\3\2\2\2\u0095\u0096"+
		"\7<\2\2\u0096\62\3\2\2\2\u0097\u0098\7}\2\2\u0098\64\3\2\2\2\u0099\u009a"+
		"\7\177\2\2\u009a\66\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d\7h\2\2\u009d"+
		"8\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7u\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2:\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5"+
		"\u00a6\7v\2\2\u00a6<\3\2\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7j\2\2\u00a9"+
		"\u00aa\7c\2\2\u00aa\u00ab\7t\2\2\u00ab>\3\2\2\2\u00ac\u00ad\7f\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7d\2\2\u00b0\u00b1\7n\2\2"+
		"\u00b1\u00b2\7g\2\2\u00b2@\3\2\2\2\u00b3\u00b4\7x\2\2\u00b4\u00b5\7q\2"+
		"\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7f\2\2\u00b7B\3\2\2\2\u00b8\u00b9\7"+
		"r\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd"+
		"\7v\2\2\u00bdD\3\2\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1"+
		"\7v\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7p\2\2\u00c4"+
		"F\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7r\2\2\u00c8"+
		"\u00c9\7w\2\2\u00c9\u00ca\7v\2\2\u00caH\3\2\2\2\u00cb\u00cc\7f\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7h\2\2\u00ceJ\3\2\2\2\u00cf\u00d0\7u\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7e\2\2"+
		"\u00d4\u00d5\7v\2\2\u00d5L\3\2\2\2\u00d6\u00d7\7o\2\2\u00d7\u00d8\7c\2"+
		"\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00daN\3\2\2\2\u00db\u00df\7"+
		"%\2\2\u00dc\u00de\n\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00e3\b(\2\2\u00e3P\3\2\2\2\u00e4\u00e5\7$\2\2\u00e5\u00e6"+
		"\7$\2\2\u00e6\u00e7\7$\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00ea\13\2\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ec\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7$\2\2\u00ef"+
		"\u00f0\7$\2\2\u00f0\u00f1\7$\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b)\2"+
		"\2\u00f3R\3\2\2\2\u00f4\u00f6\t\3\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\b*\2\2\u00faT\3\2\2\2\u00fb\u0104\7\62\2\2\u00fc\u0100\t\4\2\2"+
		"\u00fd\u00ff\t\5\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u00fb\3\2\2\2\u0103\u00fc\3\2\2\2\u0104V\3\2\2\2\u0105\u0107\5U+\2\u0106"+
		"\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\7\60"+
		"\2\2\u0109\u010b\t\5\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u012d\3\2\2\2\u010e\u010f\5U"+
		"+\2\u010f\u0110\7\60\2\2\u0110\u012d\3\2\2\2\u0111\u0112\5U+\2\u0112\u0114"+
		"\t\6\2\2\u0113\u0115\t\7\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0118\t\5\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u012d\3\2\2\2\u011b"+
		"\u011c\5U+\2\u011c\u0120\7\60\2\2\u011d\u011f\t\5\2\2\u011e\u011d\3\2"+
		"\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\t\6\2\2\u0124\u0126\t\7"+
		"\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127"+
		"\u0129\t\5\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u0106\3\2\2\2\u012c"+
		"\u010e\3\2\2\2\u012c\u0111\3\2\2\2\u012c\u011b\3\2\2\2\u012dX\3\2\2\2"+
		"\u012e\u012f\7)\2\2\u012f\u0130\t\b\2\2\u0130\u014c\7)\2\2\u0131\u0132"+
		"\7)\2\2\u0132\u0133\7\60\2\2\u0133\u014c\7)\2\2\u0134\u0135\7)\2\2\u0135"+
		"\u0136\7^\2\2\u0136\u0137\5U+\2\u0137\u0138\5U+\2\u0138\u0139\5U+\2\u0139"+
		"\u013a\7)\2\2\u013a\u014c\3\2\2\2\u013b\u013c\7)\2\2\u013c\u013d\7^\2"+
		"\2\u013d\u013e\7p\2\2\u013e\u013f\3\2\2\2\u013f\u014c\7)\2\2\u0140\u0141"+
		"\7)\2\2\u0141\u0142\7^\2\2\u0142\u0143\7v\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u014c\7)\2\2\u0145\u0146\7)\2\2\u0146\u0147\7/\2\2\u0147\u014c\7)\2\2"+
		"\u0148\u0149\7)\2\2\u0149\u014a\7\u0080\2\2\u014a\u014c\7)\2\2\u014b\u012e"+
		"\3\2\2\2\u014b\u0131\3\2\2\2\u014b\u0134\3\2\2\2\u014b\u013b\3\2\2\2\u014b"+
		"\u0140\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u0148\3\2\2\2\u014cZ\3\2\2\2"+
		"\u014d\u0151\t\t\2\2\u014e\u0150\t\n\2\2\u014f\u014e\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\\\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\22\2\u00df\u00eb\u00f7\u0100\u0103\u0106\u010c\u0114\u0119"+
		"\u0120\u0125\u012a\u012c\u014b\u0151\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}