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
		ONE_LINE_COMMENT=1, COMMENT=2, WHITESPACE=3, INT_CONSTANT=4, REAL_CONSTANT=5, 
		CHAR_CONSTANT=6, ID=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ONE_LINE_COMMENT", "COMMENT", "WHITESPACE", "INT_CONSTANT", "REAL_CONSTANT", 
			"CHAR_CONSTANT", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ONE_LINE_COMMENT", "COMMENT", "WHITESPACE", "INT_CONSTANT", "REAL_CONSTANT", 
			"CHAR_CONSTANT", "ID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u008a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\7\2\24\n\2"+
		"\f\2\16\2\27\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4,\n\4\r\4\16\4-\3\4\3\4\3\5\3\5\3\5\7"+
		"\5\65\n\5\f\5\16\58\13\5\5\5:\n\5\3\6\5\6=\n\6\3\6\3\6\6\6A\n\6\r\6\16"+
		"\6B\3\6\3\6\3\6\3\6\3\6\3\6\5\6K\n\6\3\6\6\6N\n\6\r\6\16\6O\3\6\3\6\3"+
		"\6\7\6U\n\6\f\6\16\6X\13\6\3\6\3\6\5\6\\\n\6\3\6\6\6_\n\6\r\6\16\6`\5"+
		"\6c\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3"+
		"\b\3\b\7\b\u0086\n\b\f\b\16\b\u0089\13\b\3!\2\t\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\3\2\13\4\2\f\f\16\17\7\2\13\f\16\17\"\"GHQQ\3\2\63;\3\2\62;\4"+
		"\2GGgg\4\2--//\4\2C\\c|\5\2C\\aac|\6\2\62;C\\aac|\2\u009f\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\3\21\3\2\2\2\5\32\3\2\2\2\7+\3\2\2\2\t9\3\2\2\2\13b\3\2\2\2\r\u0081"+
		"\3\2\2\2\17\u0083\3\2\2\2\21\25\7%\2\2\22\24\n\2\2\2\23\22\3\2\2\2\24"+
		"\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30"+
		"\31\b\2\2\2\31\4\3\2\2\2\32\33\7$\2\2\33\34\7$\2\2\34\35\7$\2\2\35!\3"+
		"\2\2\2\36 \13\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\"\3\2\2\2!\37\3\2\2\2\"$"+
		"\3\2\2\2#!\3\2\2\2$%\7$\2\2%&\7$\2\2&\'\7$\2\2\'(\3\2\2\2()\b\3\2\2)\6"+
		"\3\2\2\2*,\t\3\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/"+
		"\60\b\4\2\2\60\b\3\2\2\2\61:\7\62\2\2\62\66\t\4\2\2\63\65\t\5\2\2\64\63"+
		"\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\28\66\3\2\2"+
		"\29\61\3\2\2\29\62\3\2\2\2:\n\3\2\2\2;=\5\t\5\2<;\3\2\2\2<=\3\2\2\2=>"+
		"\3\2\2\2>@\7\60\2\2?A\t\5\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2"+
		"Cc\3\2\2\2DE\5\t\5\2EF\7\60\2\2Fc\3\2\2\2GH\5\t\5\2HJ\t\6\2\2IK\t\7\2"+
		"\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\t\5\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2"+
		"\2OP\3\2\2\2Pc\3\2\2\2QR\5\t\5\2RV\7\60\2\2SU\t\5\2\2TS\3\2\2\2UX\3\2"+
		"\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2Y[\t\6\2\2Z\\\t\7\2\2[Z\3"+
		"\2\2\2[\\\3\2\2\2\\^\3\2\2\2]_\t\5\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`"+
		"a\3\2\2\2ac\3\2\2\2b<\3\2\2\2bD\3\2\2\2bG\3\2\2\2bQ\3\2\2\2c\f\3\2\2\2"+
		"de\7)\2\2ef\t\b\2\2f\u0082\7)\2\2gh\7)\2\2hi\7\60\2\2i\u0082\7)\2\2jk"+
		"\7)\2\2kl\7^\2\2lm\5\t\5\2mn\5\t\5\2no\5\t\5\2op\7)\2\2p\u0082\3\2\2\2"+
		"qr\7)\2\2rs\7^\2\2st\7p\2\2tu\3\2\2\2u\u0082\7)\2\2vw\7)\2\2wx\7^\2\2"+
		"xy\7v\2\2yz\3\2\2\2z\u0082\7)\2\2{|\7)\2\2|}\7/\2\2}\u0082\7)\2\2~\177"+
		"\7)\2\2\177\u0080\7\u0080\2\2\u0080\u0082\7)\2\2\u0081d\3\2\2\2\u0081"+
		"g\3\2\2\2\u0081j\3\2\2\2\u0081q\3\2\2\2\u0081v\3\2\2\2\u0081{\3\2\2\2"+
		"\u0081~\3\2\2\2\u0082\16\3\2\2\2\u0083\u0087\t\t\2\2\u0084\u0086\t\n\2"+
		"\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\20\3\2\2\2\u0089\u0087\3\2\2\2\22\2\25!-\669<BJOV[`b\u0081"+
		"\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}