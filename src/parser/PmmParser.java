// Generated from C:/Users/msame/IdeaProjects/Compiler/src/parser\Pmm.g4 by ANTLR 4.8
package parser;

    import ast.*;
    import ast.expression.*;
    import ast.type.*;
    import ast.definition.*;
    import ast.statement.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_expressions = 2, RULE_statement = 3, 
		RULE_whileBody = 4, RULE_ifBody = 5, RULE_elseSt = 6, RULE_body = 7, RULE_type = 8, 
		RULE_varDefinition = 9, RULE_oneVariable = 10, RULE_multipleVariables = 11, 
		RULE_fields = 12, RULE_funcDefinition = 13, RULE_funcBody = 14, RULE_params = 15, 
		RULE_mainDefinition = 16, RULE_funcInvocation = 17, RULE_arguments = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "expressions", "statement", "whileBody", "ifBody", 
			"elseSt", "body", "type", "varDefinition", "oneVariable", "multipleVariables", 
			"fields", "funcDefinition", "funcBody", "params", "mainDefinition", "funcInvocation", 
			"arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'['", "']'", "'.'", "'-'", "'!'", "'*'", 
			"'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", 
			"'||'", "','", "'='", "'while'", "':'", "'if'", "'else'", "'{'", "'}'", 
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

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public VarDefinitionContext varDefinition;
		public FuncDefinitionContext funcDefinition;
		public MainDefinitionContext mainDefinition;
		public MainDefinitionContext mainDefinition() {
			return getRuleContext(MainDefinitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<FuncDefinitionContext> funcDefinition() {
			return getRuleContexts(FuncDefinitionContext.class);
		}
		public FuncDefinitionContext funcDefinition(int i) {
			return getRuleContext(FuncDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			List<Definition> definitions = new ArrayList<Definition>();
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(46);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(39);
						((ProgramContext)_localctx).varDefinition = varDefinition();
						definitions.addAll(((ProgramContext)_localctx).varDefinition.ast);
						setState(41);
						match(T__0);
						}
						break;
					case DEF:
						{
						setState(43);
						((ProgramContext)_localctx).funcDefinition = funcDefinition();
						definitions.add(((ProgramContext)_localctx).funcDefinition.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(51);
			((ProgramContext)_localctx).mainDefinition = mainDefinition();
			definitions.add(((ProgramContext)_localctx).mainDefinition.ast);((ProgramContext)_localctx).ast =  new Program(0,0,definitions);
			setState(53);
			match(EOF);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public ExpressionContext exp;
		public ExpressionContext expression;
		public Token par;
		public TypeContext type;
		public Token operator;
		public FuncInvocationContext funcInvocation;
		public Token INT_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token REAL_CONSTANT;
		public Token ID;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuncInvocationContext funcInvocation() {
			return getRuleContext(FuncInvocationContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(56);
				match(T__1);
				setState(57);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(58);
				match(T__2);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 2:
				{
				setState(61);
				((ExpressionContext)_localctx).par = match(T__1);
				setState(62);
				((ExpressionContext)_localctx).type = type();
				setState(63);
				match(T__2);
				setState(64);
				((ExpressionContext)_localctx).expression = expression(12);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).par.getLine(), ((ExpressionContext)_localctx).par.getCharPositionInLine()+1, ((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).expression.ast);
				}
				break;
			case 3:
				{
				setState(67);
				((ExpressionContext)_localctx).operator = match(T__6);
				setState(68);
				((ExpressionContext)_localctx).expression = expression(11);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).operator.getLine(),((ExpressionContext)_localctx).operator.getCharPositionInLine()+1,((ExpressionContext)_localctx).expression.ast);
				}
				break;
			case 4:
				{
				setState(71);
				((ExpressionContext)_localctx).operator = match(T__7);
				setState(72);
				((ExpressionContext)_localctx).expression = expression(10);
				((ExpressionContext)_localctx).ast =  new Negation(((ExpressionContext)_localctx).operator.getLine(),((ExpressionContext)_localctx).operator.getCharPositionInLine()+1,((ExpressionContext)_localctx).expression.ast);
				}
				break;
			case 5:
				{
				setState(75);
				((ExpressionContext)_localctx).funcInvocation = funcInvocation();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).funcInvocation.ast;
				}
				break;
			case 6:
				{
				setState(78);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 7:
				{
				setState(80);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 8:
				{
				setState(82);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(84);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(89);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(10);
						((ExpressionContext)_localctx).ast =  new Arithmetic((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).operator!=null?((ExpressionContext)_localctx).operator.getText():null), ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(94);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__11) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(9);
						((ExpressionContext)_localctx).ast =  new Arithmetic((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).operator!=null?((ExpressionContext)_localctx).operator.getText():null), ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(99);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(100);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(8);
						((ExpressionContext)_localctx).ast =  new Comparison((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).operator!=null?((ExpressionContext)_localctx).operator.getText():null), ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(103);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(104);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(105);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(7);
						((ExpressionContext)_localctx).ast =  new LogicOperator((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).operator!=null?((ExpressionContext)_localctx).operator.getText():null), ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(109);
						match(T__3);
						setState(110);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(111);
						match(T__4);
						((ExpressionContext)_localctx).ast =  new ArrayAccess((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp = _prevctx;
						_localctx.exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(115);
						match(T__5);
						setState(116);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess((((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getLine(),(((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).exp.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						}
						break;
					}
					} 
				}
				setState(122);
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

	public static class ExpressionsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((ExpressionsContext)_localctx).expression = expression(0);
			_localctx.ast.add(((ExpressionsContext)_localctx).expression.ast);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(125);
				match(T__20);
				setState(126);
				((ExpressionsContext)_localctx).expression = expression(0);
				_localctx.ast.add(((ExpressionsContext)_localctx).expression.ast);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public Token PRINT;
		public ExpressionsContext expressions;
		public Token INPUT;
		public Token RETURN;
		public ExpressionContext expression;
		public FuncInvocationContext funcInvocation;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token w;
		public WhileBodyContext whileBody;
		public Token i;
		public IfBodyContext f;
		public ElseStContext e;
		public TerminalNode PRINT() { return getToken(PmmParser.PRINT, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode INPUT() { return getToken(PmmParser.INPUT, 0); }
		public TerminalNode RETURN() { return getToken(PmmParser.RETURN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FuncInvocationContext funcInvocation() {
			return getRuleContext(FuncInvocationContext.class,0);
		}
		public WhileBodyContext whileBody() {
			return getRuleContext(WhileBodyContext.class,0);
		}
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public ElseStContext elseSt() {
			return getRuleContext(ElseStContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				((StatementContext)_localctx).PRINT = match(PRINT);
				setState(135);
				((StatementContext)_localctx).expressions = expressions();
				setState(136);
				match(T__0);
				for(Expression exp : ((StatementContext)_localctx).expressions.ast) {_localctx.ast.add(new Print(((StatementContext)_localctx).PRINT.getLine(), ((StatementContext)_localctx).PRINT.getCharPositionInLine()+1, exp));}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				((StatementContext)_localctx).INPUT = match(INPUT);
				setState(140);
				((StatementContext)_localctx).expressions = expressions();
				setState(141);
				match(T__0);
				for(Expression exp : ((StatementContext)_localctx).expressions.ast) {_localctx.ast.add(new Input(((StatementContext)_localctx).INPUT.getLine(), ((StatementContext)_localctx).INPUT.getCharPositionInLine()+1, exp));}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				((StatementContext)_localctx).RETURN = match(RETURN);
				setState(145);
				((StatementContext)_localctx).expression = expression(0);
				setState(146);
				match(T__0);
				_localctx.ast.add(new Return(((StatementContext)_localctx).RETURN.getLine(), ((StatementContext)_localctx).RETURN.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				((StatementContext)_localctx).funcInvocation = funcInvocation();
				setState(150);
				match(T__0);
				_localctx.ast.add((Statement)((StatementContext)_localctx).funcInvocation.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				((StatementContext)_localctx).e1 = expression(0);
				setState(154);
				match(T__21);
				setState(155);
				((StatementContext)_localctx).e2 = expression(0);
				setState(156);
				match(T__0);
				_localctx.ast.add(new Assignment((((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getLine(), (((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				((StatementContext)_localctx).w = match(T__22);
				setState(160);
				((StatementContext)_localctx).expression = expression(0);
				setState(161);
				match(T__23);
				setState(162);
				((StatementContext)_localctx).whileBody = whileBody();
				_localctx.ast.add(new While(((StatementContext)_localctx).w.getLine(), ((StatementContext)_localctx).w.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).whileBody.ast));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(165);
				((StatementContext)_localctx).i = match(T__24);
				setState(166);
				((StatementContext)_localctx).e1 = expression(0);
				setState(167);
				match(T__23);
				setState(168);
				((StatementContext)_localctx).f = ifBody();
				 IfElse ifSt = new IfElse(((StatementContext)_localctx).i.getLine(), ((StatementContext)_localctx).i.getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).f.ast, new ArrayList<Statement>());
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(170);
					((StatementContext)_localctx).e = elseSt();
					ifSt.setElseStatements(((StatementContext)_localctx).e.ast);
					}
					break;
				}
				_localctx.ast.add(ifSt);
				}
				break;
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

	public static class WhileBodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public BodyContext body;
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterWhileBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitWhileBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitWhileBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBodyContext whileBody() throws RecognitionException {
		WhileBodyContext _localctx = new WhileBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			((WhileBodyContext)_localctx).body = body();
			_localctx.ast.addAll(((WhileBodyContext)_localctx).body.ast);
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

	public static class IfBodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public BodyContext b;
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitIfBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			((IfBodyContext)_localctx).b = body();
			_localctx.ast.addAll(((IfBodyContext)_localctx).b.ast);
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

	public static class ElseStContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public BodyContext body;
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterElseSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitElseSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitElseSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStContext elseSt() throws RecognitionException {
		ElseStContext _localctx = new ElseStContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__25);
			setState(186);
			((ElseStContext)_localctx).body = body();
			_localctx.ast.addAll(((ElseStContext)_localctx).body.ast);
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

	public static class BodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext s1;
		public StatementContext s2;
		public StatementContext s3;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(189);
				((BodyContext)_localctx).s1 = statement();
				_localctx.ast.addAll(((BodyContext)_localctx).s1.ast);
				}
				break;
			case 2:
				{
				setState(192);
				match(T__26);
				setState(193);
				((BodyContext)_localctx).s2 = statement();
				_localctx.ast.addAll(((BodyContext)_localctx).s2.ast);
				setState(195);
				match(T__27);
				}
				break;
			case 3:
				{
				setState(197);
				match(T__26);
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(198);
					((BodyContext)_localctx).s3 = statement();
					_localctx.ast.addAll(((BodyContext)_localctx).s3.ast);
					}
					}
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__22) | (1L << T__24) | (1L << PRINT) | (1L << RETURN) | (1L << INPUT) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0) );
				setState(205);
				match(T__27);
				}
				break;
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

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Token par;
		public Token size;
		public TypeContext type;
		public Token STRUCT;
		public FieldsContext fields;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode STRUCT() { return getToken(PmmParser.STRUCT, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(T__28);
				((TypeContext)_localctx).ast =  new IntType();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(T__29);
				((TypeContext)_localctx).ast =  new CharType();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(T__30);
				((TypeContext)_localctx).ast =  new DoubleType();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(T__31);
				((TypeContext)_localctx).ast =  new VoidType();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(217);
				((TypeContext)_localctx).par = match(T__3);
				setState(218);
				((TypeContext)_localctx).size = match(INT_CONSTANT);
				setState(219);
				match(T__4);
				}
				setState(221);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast =  new Array(((TypeContext)_localctx).par.getLine(), ((TypeContext)_localctx).par.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((TypeContext)_localctx).size!=null?((TypeContext)_localctx).size.getText():null)), ((TypeContext)_localctx).type.ast);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				((TypeContext)_localctx).STRUCT = match(STRUCT);
				setState(225);
				match(T__26);
				setState(226);
				((TypeContext)_localctx).fields = fields();
				setState(227);
				match(T__27);
				((TypeContext)_localctx).ast =  new Record(((TypeContext)_localctx).STRUCT.getLine(), ((TypeContext)_localctx).STRUCT.getCharPositionInLine()+1, ((TypeContext)_localctx).fields.ast);
				}
				break;
			case T__0:
			case T__2:
			case T__20:
			case T__26:
				enterOuterAlt(_localctx, 7);
				{
				((TypeContext)_localctx).ast =  new VoidType();
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

	public static class VarDefinitionContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public OneVariableContext oneVariable;
		public MultipleVariablesContext multipleVariables;
		public OneVariableContext oneVariable() {
			return getRuleContext(OneVariableContext.class,0);
		}
		public MultipleVariablesContext multipleVariables() {
			return getRuleContext(MultipleVariablesContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterVarDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitVarDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDefinition);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				((VarDefinitionContext)_localctx).oneVariable = oneVariable();
				_localctx.ast.add(((VarDefinitionContext)_localctx).oneVariable.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				((VarDefinitionContext)_localctx).multipleVariables = multipleVariables();
				_localctx.ast.addAll(((VarDefinitionContext)_localctx).multipleVariables.ast);
				}
				break;
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

	public static class OneVariableContext extends ParserRuleContext {
		public VarDefinition ast;
		public Token ID;
		public TypeContext type;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OneVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterOneVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitOneVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitOneVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneVariableContext oneVariable() throws RecognitionException {
		OneVariableContext _localctx = new OneVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_oneVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			((OneVariableContext)_localctx).ID = match(ID);
			setState(242);
			match(T__23);
			setState(243);
			((OneVariableContext)_localctx).type = type();
			((OneVariableContext)_localctx).ast =  new VarDefinition(((OneVariableContext)_localctx).ID.getLine(),((OneVariableContext)_localctx).ID.getCharPositionInLine()+1, ((OneVariableContext)_localctx).type.ast, (((OneVariableContext)_localctx).ID!=null?((OneVariableContext)_localctx).ID.getText():null));
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

	public static class MultipleVariablesContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public Token id1;
		public Token id2;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public MultipleVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterMultipleVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitMultipleVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMultipleVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleVariablesContext multipleVariables() throws RecognitionException {
		MultipleVariablesContext _localctx = new MultipleVariablesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multipleVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			((MultipleVariablesContext)_localctx).id1 = match(ID);
			_localctx.ast.add(new VarDefinition(((MultipleVariablesContext)_localctx).id1.getLine(), ((MultipleVariablesContext)_localctx).id1.getCharPositionInLine()+1, null, (((MultipleVariablesContext)_localctx).id1!=null?((MultipleVariablesContext)_localctx).id1.getText():null)));
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				match(T__20);
				setState(249);
				((MultipleVariablesContext)_localctx).id2 = match(ID);
				if((((MultipleVariablesContext)_localctx).id1!=null?((MultipleVariablesContext)_localctx).id1.getText():null).equals((((MultipleVariablesContext)_localctx).id2!=null?((MultipleVariablesContext)_localctx).id2.getText():null))){new ErrorType(((MultipleVariablesContext)_localctx).id2.getLine(), ((MultipleVariablesContext)_localctx).id2.getCharPositionInLine()+1, "Duplicate variable error: " + (((MultipleVariablesContext)_localctx).id2!=null?((MultipleVariablesContext)_localctx).id2.getText():null));}else{_localctx.ast.add(new VarDefinition(((MultipleVariablesContext)_localctx).id2.getLine(), ((MultipleVariablesContext)_localctx).id2.getCharPositionInLine()+1, null, (((MultipleVariablesContext)_localctx).id2!=null?((MultipleVariablesContext)_localctx).id2.getText():null)));}
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__20 );
			setState(255);
			match(T__23);
			setState(256);
			((MultipleVariablesContext)_localctx).type = type();
			for(VarDefinition var : _localctx.ast){var.setType(((MultipleVariablesContext)_localctx).type.ast);}
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

	public static class FieldsContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList<>();
		public VarDefinitionContext varDef;
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(259);
				((FieldsContext)_localctx).varDef = varDefinition();
				for(VarDefinition def : ((FieldsContext)_localctx).varDef.ast) {if(_localctx.ast.contains(new RecordField(def.getLine(), def.getColumn(), def.getName(), def.getType()))) {new ErrorType(def.getLine(), def.getColumn(), "Duplicate field error: " + def.getName());} else {_localctx.ast.add(new RecordField(def.getLine(), def.getColumn(), def.getName(), def.getType()));}}
				setState(261);
				match(T__0);
				}
				}
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class FuncDefinitionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public Token DEF;
		public Token ID;
		public ParamsContext params;
		public TypeContext t;
		public FuncBodyContext funcBody;
		public TerminalNode DEF() { return getToken(PmmParser.DEF, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterFuncDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitFuncDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuncDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((FuncDefinitionContext)_localctx).DEF = match(DEF);
			setState(268);
			((FuncDefinitionContext)_localctx).ID = match(ID);
			setState(269);
			((FuncDefinitionContext)_localctx).params = params();
			setState(270);
			match(T__23);
			setState(271);
			((FuncDefinitionContext)_localctx).t = type();
			setState(272);
			match(T__26);
			setState(273);
			((FuncDefinitionContext)_localctx).funcBody = funcBody();
			setState(274);
			match(T__27);
			((FuncDefinitionContext)_localctx).ast =  new FuncDefinition(((FuncDefinitionContext)_localctx).DEF.getLine(), ((FuncDefinitionContext)_localctx).DEF.getCharPositionInLine()+1,new FuncType((((FuncDefinitionContext)_localctx).t!=null?(((FuncDefinitionContext)_localctx).t.start):null).getLine(), (((FuncDefinitionContext)_localctx).t!=null?(((FuncDefinitionContext)_localctx).t.start):null).getCharPositionInLine()+1, ((FuncDefinitionContext)_localctx).t.ast, ((FuncDefinitionContext)_localctx).params.ast), (((FuncDefinitionContext)_localctx).ID!=null?((FuncDefinitionContext)_localctx).ID.getText():null), ((FuncDefinitionContext)_localctx).funcBody.ast );
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

	public static class FuncBodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public VarDefinitionContext varDefinition;
		public StatementContext statement;
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitFuncBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuncBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					((FuncBodyContext)_localctx).varDefinition = varDefinition();
					_localctx.ast.addAll(((FuncBodyContext)_localctx).varDefinition.ast);
					setState(279);
					match(T__0);
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__22) | (1L << T__24) | (1L << PRINT) | (1L << RETURN) | (1L << INPUT) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(286);
				((FuncBodyContext)_localctx).statement = statement();
				_localctx.ast.addAll(((FuncBodyContext)_localctx).statement.ast);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public OneVariableContext v1;
		public OneVariableContext v2;
		public List<OneVariableContext> oneVariable() {
			return getRuleContexts(OneVariableContext.class);
		}
		public OneVariableContext oneVariable(int i) {
			return getRuleContext(OneVariableContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_params);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(T__1);
				setState(295);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(T__1);
				setState(297);
				((ParamsContext)_localctx).v1 = oneVariable();
				_localctx.ast.add(((ParamsContext)_localctx).v1.ast);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(299);
					match(T__20);
					setState(300);
					((ParamsContext)_localctx).v2 = oneVariable();
					_localctx.ast.add(((ParamsContext)_localctx).v2.ast);
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(308);
				match(T__2);
				}
				break;
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

	public static class MainDefinitionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public Token DEF;
		public Token MAIN;
		public FuncBodyContext funcBody;
		public TerminalNode DEF() { return getToken(PmmParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(PmmParser.MAIN, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public MainDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterMainDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitMainDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMainDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDefinitionContext mainDefinition() throws RecognitionException {
		MainDefinitionContext _localctx = new MainDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mainDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((MainDefinitionContext)_localctx).DEF = match(DEF);
			setState(313);
			((MainDefinitionContext)_localctx).MAIN = match(MAIN);
			setState(314);
			match(T__1);
			setState(315);
			match(T__2);
			setState(316);
			match(T__23);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(317);
				match(T__31);
				}
			}

			setState(320);
			match(T__26);
			setState(321);
			((MainDefinitionContext)_localctx).funcBody = funcBody();
			setState(322);
			match(T__27);
			((MainDefinitionContext)_localctx).ast =  new FuncDefinition(((MainDefinitionContext)_localctx).DEF.getLine(),((MainDefinitionContext)_localctx).DEF.getCharPositionInLine()+1,new FuncType(((MainDefinitionContext)_localctx).DEF.getLine(), ((MainDefinitionContext)_localctx).DEF.getCharPositionInLine()+1,VoidType.getInstance(),new ArrayList<VarDefinition>()),(((MainDefinitionContext)_localctx).MAIN!=null?((MainDefinitionContext)_localctx).MAIN.getText():null), ((MainDefinitionContext)_localctx).funcBody.ast);
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

	public static class FuncInvocationContext extends ParserRuleContext {
		public FuncInvocation ast;
		public Token ID;
		public ArgumentsContext arguments;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FuncInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterFuncInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitFuncInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuncInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncInvocationContext funcInvocation() throws RecognitionException {
		FuncInvocationContext _localctx = new FuncInvocationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			((FuncInvocationContext)_localctx).ID = match(ID);
			setState(326);
			((FuncInvocationContext)_localctx).arguments = arguments();
			((FuncInvocationContext)_localctx).ast =  new FuncInvocation(((FuncInvocationContext)_localctx).ID.getLine(), ((FuncInvocationContext)_localctx).ID.getCharPositionInLine()+1, ((FuncInvocationContext)_localctx).arguments.ast, new Variable(((FuncInvocationContext)_localctx).ID.getLine(),((FuncInvocationContext)_localctx).ID.getCharPositionInLine()+1, (((FuncInvocationContext)_localctx).ID!=null?((FuncInvocationContext)_localctx).ID.getText():null)));
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionsContext expressions;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arguments);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(T__1);
				setState(330);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(T__1);
				setState(332);
				((ArgumentsContext)_localctx).expressions = expressions();
				_localctx.ast.addAll(((ArgumentsContext)_localctx).expressions.ast);
				setState(334);
				match(T__2);
				}
				break;
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
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0155\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\61\n\2\f\2\16"+
		"\2\64\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3Y\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\7\3y\n\3\f\3\16\3|\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0084\n\4\f\4\16"+
		"\4\u0087\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b0\n\5\3\5\3\5\5\5\u00b4\n\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\6\t\u00cc\n\t\r\t\16\t\u00cd\3\t\3\t\5\t\u00d2\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00ea\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f2"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\6\r\u00fe\n\r\r\r\16\r\u00ff"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\6\16\u010a\n\16\r\16\16\16\u010b"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\7\20\u011c\n\20\f\20\16\20\u011f\13\20\3\20\3\20\3\20\7\20\u0124\n\20"+
		"\f\20\16\20\u0127\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7"+
		"\21\u0132\n\21\f\21\16\21\u0135\13\21\3\21\3\21\5\21\u0139\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u0141\n\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0153\n\24\3\24"+
		"\2\3\4\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\6\3\2\13\r\4\2"+
		"\t\t\16\16\3\2\17\24\3\2\25\26\2\u016b\2(\3\2\2\2\4X\3\2\2\2\6}\3\2\2"+
		"\2\b\u00b3\3\2\2\2\n\u00b5\3\2\2\2\f\u00b8\3\2\2\2\16\u00bb\3\2\2\2\20"+
		"\u00d1\3\2\2\2\22\u00e9\3\2\2\2\24\u00f1\3\2\2\2\26\u00f3\3\2\2\2\30\u00f8"+
		"\3\2\2\2\32\u0109\3\2\2\2\34\u010d\3\2\2\2\36\u011d\3\2\2\2 \u0138\3\2"+
		"\2\2\"\u013a\3\2\2\2$\u0147\3\2\2\2&\u0152\3\2\2\2(\62\b\2\1\2)*\5\24"+
		"\13\2*+\b\2\1\2+,\7\3\2\2,\61\3\2\2\2-.\5\34\17\2./\b\2\1\2/\61\3\2\2"+
		"\2\60)\3\2\2\2\60-\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63"+
		"\65\3\2\2\2\64\62\3\2\2\2\65\66\5\"\22\2\66\67\b\2\1\2\678\7\2\2\38\3"+
		"\3\2\2\29:\b\3\1\2:;\7\4\2\2;<\5\4\3\2<=\7\5\2\2=>\b\3\1\2>Y\3\2\2\2?"+
		"@\7\4\2\2@A\5\22\n\2AB\7\5\2\2BC\5\4\3\16CD\b\3\1\2DY\3\2\2\2EF\7\t\2"+
		"\2FG\5\4\3\rGH\b\3\1\2HY\3\2\2\2IJ\7\n\2\2JK\5\4\3\fKL\b\3\1\2LY\3\2\2"+
		"\2MN\5$\23\2NO\b\3\1\2OY\3\2\2\2PQ\7,\2\2QY\b\3\1\2RS\7.\2\2SY\b\3\1\2"+
		"TU\7-\2\2UY\b\3\1\2VW\7/\2\2WY\b\3\1\2X9\3\2\2\2X?\3\2\2\2XE\3\2\2\2X"+
		"I\3\2\2\2XM\3\2\2\2XP\3\2\2\2XR\3\2\2\2XT\3\2\2\2XV\3\2\2\2Yz\3\2\2\2"+
		"Z[\f\13\2\2[\\\t\2\2\2\\]\5\4\3\f]^\b\3\1\2^y\3\2\2\2_`\f\n\2\2`a\t\3"+
		"\2\2ab\5\4\3\13bc\b\3\1\2cy\3\2\2\2de\f\t\2\2ef\t\4\2\2fg\5\4\3\ngh\b"+
		"\3\1\2hy\3\2\2\2ij\f\b\2\2jk\t\5\2\2kl\5\4\3\tlm\b\3\1\2my\3\2\2\2no\f"+
		"\20\2\2op\7\6\2\2pq\5\4\3\2qr\7\7\2\2rs\b\3\1\2sy\3\2\2\2tu\f\17\2\2u"+
		"v\7\b\2\2vw\7/\2\2wy\b\3\1\2xZ\3\2\2\2x_\3\2\2\2xd\3\2\2\2xi\3\2\2\2x"+
		"n\3\2\2\2xt\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\5\3\2\2\2|z\3\2\2\2"+
		"}~\5\4\3\2~\u0085\b\4\1\2\177\u0080\7\27\2\2\u0080\u0081\5\4\3\2\u0081"+
		"\u0082\b\4\1\2\u0082\u0084\3\2\2\2\u0083\177\3\2\2\2\u0084\u0087\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\7\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u0089\7#\2\2\u0089\u008a\5\6\4\2\u008a\u008b\7\3\2\2\u008b"+
		"\u008c\b\5\1\2\u008c\u00b4\3\2\2\2\u008d\u008e\7%\2\2\u008e\u008f\5\6"+
		"\4\2\u008f\u0090\7\3\2\2\u0090\u0091\b\5\1\2\u0091\u00b4\3\2\2\2\u0092"+
		"\u0093\7$\2\2\u0093\u0094\5\4\3\2\u0094\u0095\7\3\2\2\u0095\u0096\b\5"+
		"\1\2\u0096\u00b4\3\2\2\2\u0097\u0098\5$\23\2\u0098\u0099\7\3\2\2\u0099"+
		"\u009a\b\5\1\2\u009a\u00b4\3\2\2\2\u009b\u009c\5\4\3\2\u009c\u009d\7\30"+
		"\2\2\u009d\u009e\5\4\3\2\u009e\u009f\7\3\2\2\u009f\u00a0\b\5\1\2\u00a0"+
		"\u00b4\3\2\2\2\u00a1\u00a2\7\31\2\2\u00a2\u00a3\5\4\3\2\u00a3\u00a4\7"+
		"\32\2\2\u00a4\u00a5\5\n\6\2\u00a5\u00a6\b\5\1\2\u00a6\u00b4\3\2\2\2\u00a7"+
		"\u00a8\7\33\2\2\u00a8\u00a9\5\4\3\2\u00a9\u00aa\7\32\2\2\u00aa\u00ab\5"+
		"\f\7\2\u00ab\u00af\b\5\1\2\u00ac\u00ad\5\16\b\2\u00ad\u00ae\b\5\1\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\b\5\1\2\u00b2\u00b4\3\2\2\2\u00b3\u0088\3\2\2\2\u00b3"+
		"\u008d\3\2\2\2\u00b3\u0092\3\2\2\2\u00b3\u0097\3\2\2\2\u00b3\u009b\3\2"+
		"\2\2\u00b3\u00a1\3\2\2\2\u00b3\u00a7\3\2\2\2\u00b4\t\3\2\2\2\u00b5\u00b6"+
		"\5\20\t\2\u00b6\u00b7\b\6\1\2\u00b7\13\3\2\2\2\u00b8\u00b9\5\20\t\2\u00b9"+
		"\u00ba\b\7\1\2\u00ba\r\3\2\2\2\u00bb\u00bc\7\34\2\2\u00bc\u00bd\5\20\t"+
		"\2\u00bd\u00be\b\b\1\2\u00be\17\3\2\2\2\u00bf\u00c0\5\b\5\2\u00c0\u00c1"+
		"\b\t\1\2\u00c1\u00d2\3\2\2\2\u00c2\u00c3\7\35\2\2\u00c3\u00c4\5\b\5\2"+
		"\u00c4\u00c5\b\t\1\2\u00c5\u00c6\7\36\2\2\u00c6\u00d2\3\2\2\2\u00c7\u00cb"+
		"\7\35\2\2\u00c8\u00c9\5\b\5\2\u00c9\u00ca\b\t\1\2\u00ca\u00cc\3\2\2\2"+
		"\u00cb\u00c8\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\36\2\2\u00d0\u00d2\3\2\2\2"+
		"\u00d1\u00bf\3\2\2\2\u00d1\u00c2\3\2\2\2\u00d1\u00c7\3\2\2\2\u00d2\21"+
		"\3\2\2\2\u00d3\u00d4\7\37\2\2\u00d4\u00ea\b\n\1\2\u00d5\u00d6\7 \2\2\u00d6"+
		"\u00ea\b\n\1\2\u00d7\u00d8\7!\2\2\u00d8\u00ea\b\n\1\2\u00d9\u00da\7\""+
		"\2\2\u00da\u00ea\b\n\1\2\u00db\u00dc\7\6\2\2\u00dc\u00dd\7,\2\2\u00dd"+
		"\u00de\7\7\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\5\22\n\2\u00e0\u00e1\b"+
		"\n\1\2\u00e1\u00ea\3\2\2\2\u00e2\u00e3\7\'\2\2\u00e3\u00e4\7\35\2\2\u00e4"+
		"\u00e5\5\32\16\2\u00e5\u00e6\7\36\2\2\u00e6\u00e7\b\n\1\2\u00e7\u00ea"+
		"\3\2\2\2\u00e8\u00ea\b\n\1\2\u00e9\u00d3\3\2\2\2\u00e9\u00d5\3\2\2\2\u00e9"+
		"\u00d7\3\2\2\2\u00e9\u00d9\3\2\2\2\u00e9\u00db\3\2\2\2\u00e9\u00e2\3\2"+
		"\2\2\u00e9\u00e8\3\2\2\2\u00ea\23\3\2\2\2\u00eb\u00ec\5\26\f\2\u00ec\u00ed"+
		"\b\13\1\2\u00ed\u00f2\3\2\2\2\u00ee\u00ef\5\30\r\2\u00ef\u00f0\b\13\1"+
		"\2\u00f0\u00f2\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\25"+
		"\3\2\2\2\u00f3\u00f4\7/\2\2\u00f4\u00f5\7\32\2\2\u00f5\u00f6\5\22\n\2"+
		"\u00f6\u00f7\b\f\1\2\u00f7\27\3\2\2\2\u00f8\u00f9\7/\2\2\u00f9\u00fd\b"+
		"\r\1\2\u00fa\u00fb\7\27\2\2\u00fb\u00fc\7/\2\2\u00fc\u00fe\b\r\1\2\u00fd"+
		"\u00fa\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\32\2\2\u0102\u0103\5\22\n\2\u0103"+
		"\u0104\b\r\1\2\u0104\31\3\2\2\2\u0105\u0106\5\24\13\2\u0106\u0107\b\16"+
		"\1\2\u0107\u0108\7\3\2\2\u0108\u010a\3\2\2\2\u0109\u0105\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\33\3\2\2"+
		"\2\u010d\u010e\7&\2\2\u010e\u010f\7/\2\2\u010f\u0110\5 \21\2\u0110\u0111"+
		"\7\32\2\2\u0111\u0112\5\22\n\2\u0112\u0113\7\35\2\2\u0113\u0114\5\36\20"+
		"\2\u0114\u0115\7\36\2\2\u0115\u0116\b\17\1\2\u0116\35\3\2\2\2\u0117\u0118"+
		"\5\24\13\2\u0118\u0119\b\20\1\2\u0119\u011a\7\3\2\2\u011a\u011c\3\2\2"+
		"\2\u011b\u0117\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u0125\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\5\b\5\2\u0121"+
		"\u0122\b\20\1\2\u0122\u0124\3\2\2\2\u0123\u0120\3\2\2\2\u0124\u0127\3"+
		"\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\37\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128\u0129\7\4\2\2\u0129\u0139\7\5\2\2\u012a\u012b\7\4"+
		"\2\2\u012b\u012c\5\26\f\2\u012c\u0133\b\21\1\2\u012d\u012e\7\27\2\2\u012e"+
		"\u012f\5\26\f\2\u012f\u0130\b\21\1\2\u0130\u0132\3\2\2\2\u0131\u012d\3"+
		"\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7\5\2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u0128\3\2\2\2\u0138\u012a\3\2\2\2\u0139!\3\2\2\2\u013a\u013b"+
		"\7&\2\2\u013b\u013c\7(\2\2\u013c\u013d\7\4\2\2\u013d\u013e\7\5\2\2\u013e"+
		"\u0140\7\32\2\2\u013f\u0141\7\"\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3"+
		"\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\35\2\2\u0143\u0144\5\36\20\2"+
		"\u0144\u0145\7\36\2\2\u0145\u0146\b\22\1\2\u0146#\3\2\2\2\u0147\u0148"+
		"\7/\2\2\u0148\u0149\5&\24\2\u0149\u014a\b\23\1\2\u014a%\3\2\2\2\u014b"+
		"\u014c\7\4\2\2\u014c\u0153\7\5\2\2\u014d\u014e\7\4\2\2\u014e\u014f\5\6"+
		"\4\2\u014f\u0150\b\24\1\2\u0150\u0151\7\5\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u014b\3\2\2\2\u0152\u014d\3\2\2\2\u0153\'\3\2\2\2\26\60\62Xxz\u0085\u00af"+
		"\u00b3\u00cd\u00d1\u00e9\u00f1\u00ff\u010b\u011d\u0125\u0133\u0138\u0140"+
		"\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}