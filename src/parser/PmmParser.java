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
		RULE_whileBody = 4, RULE_ifBody = 5, RULE_elseBody = 6, RULE_body = 7, 
		RULE_type = 8, RULE_varDefinition = 9, RULE_oneVariable = 10, RULE_multipleVariables = 11, 
		RULE_fields = 12, RULE_funcDefinition = 13, RULE_funcBody = 14, RULE_params = 15, 
		RULE_mainDefinition = 16, RULE_funcInvocation = 17, RULE_arguments = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "expressions", "statement", "whileBody", "ifBody", 
			"elseBody", "body", "type", "varDefinition", "oneVariable", "multipleVariables", 
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			List<Definition> definitions = new ArrayList<Definition>();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(39);
				((ProgramContext)_localctx).varDefinition = varDefinition();
				definitions.addAll(((ProgramContext)_localctx).varDefinition.ast);
				setState(41);
				match(T__0);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					((ProgramContext)_localctx).funcDefinition = funcDefinition();
					definitions.add(((ProgramContext)_localctx).funcDefinition.ast);
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(56);
			((ProgramContext)_localctx).mainDefinition = mainDefinition();
			definitions.add(((ProgramContext)_localctx).mainDefinition.ast);((ProgramContext)_localctx).ast =  new Program(0,0,definitions);
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
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(60);
				match(T__1);
				setState(61);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(62);
				match(T__2);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 2:
				{
				setState(65);
				((ExpressionContext)_localctx).par = match(T__1);
				setState(66);
				((ExpressionContext)_localctx).type = type();
				setState(67);
				match(T__2);
				setState(68);
				((ExpressionContext)_localctx).expression = expression(12);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).par.getLine(), ((ExpressionContext)_localctx).par.getCharPositionInLine()+1, ((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).expression.ast);
				}
				break;
			case 3:
				{
				setState(71);
				((ExpressionContext)_localctx).operator = match(T__6);
				setState(72);
				((ExpressionContext)_localctx).expression = expression(11);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).operator.getLine(),((ExpressionContext)_localctx).operator.getCharPositionInLine()+1,((ExpressionContext)_localctx).expression.ast);
				}
				break;
			case 4:
				{
				setState(75);
				((ExpressionContext)_localctx).operator = match(T__7);
				setState(76);
				((ExpressionContext)_localctx).expression = expression(10);
				((ExpressionContext)_localctx).ast =  new Negation(((ExpressionContext)_localctx).operator.getLine(),((ExpressionContext)_localctx).operator.getCharPositionInLine()+1,((ExpressionContext)_localctx).expression.ast);
				}
				break;
			case 5:
				{
				setState(79);
				((ExpressionContext)_localctx).funcInvocation = funcInvocation();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).funcInvocation.ast;
				}
				break;
			case 6:
				{
				setState(82);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 7:
				{
				setState(84);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 8:
				{
				setState(86);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(88);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(93);
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
						setState(94);
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
						setState(97);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(98);
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
						setState(99);
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
						setState(102);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(103);
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
						setState(104);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(8);
						((ExpressionContext)_localctx).ast =  new Arithmetic((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).operator!=null?((ExpressionContext)_localctx).operator.getText():null), ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(108);
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
						setState(109);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(7);
						((ExpressionContext)_localctx).ast =  new Arithmetic((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).operator!=null?((ExpressionContext)_localctx).operator.getText():null), ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(113);
						match(T__3);
						setState(114);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(115);
						match(T__4);
						((ExpressionContext)_localctx).ast =  new ArrayAccess((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(119);
						match(T__5);
						setState(120);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess((((ExpressionContext)_localctx).expression!=null?(((ExpressionContext)_localctx).expression.start):null).getLine(),(((ExpressionContext)_localctx).expression!=null?(((ExpressionContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).expression.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						}
						break;
					}
					} 
				}
				setState(126);
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
			setState(127);
			((ExpressionsContext)_localctx).expression = expression(0);
			_localctx.ast.add(((ExpressionsContext)_localctx).expression.ast);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(129);
				match(T__20);
				setState(130);
				((ExpressionsContext)_localctx).expression = expression(0);
				_localctx.ast.add(((ExpressionsContext)_localctx).expression.ast);
				}
				}
				setState(137);
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
		public ExpressionContext expression;
		public Token RETURN;
		public FuncInvocationContext funcInvocation;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token w;
		public WhileBodyContext whileBody;
		public Token i;
		public IfBodyContext ifBody;
		public ElseBodyContext elseBody;
		public TerminalNode PRINT() { return getToken(PmmParser.PRINT, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode INPUT() { return getToken(PmmParser.INPUT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(PmmParser.RETURN, 0); }
		public FuncInvocationContext funcInvocation() {
			return getRuleContext(FuncInvocationContext.class,0);
		}
		public WhileBodyContext whileBody() {
			return getRuleContext(WhileBodyContext.class,0);
		}
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public ElseBodyContext elseBody() {
			return getRuleContext(ElseBodyContext.class,0);
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
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				((StatementContext)_localctx).PRINT = match(PRINT);
				setState(139);
				((StatementContext)_localctx).expressions = expressions();
				setState(140);
				match(T__0);
				_localctx.ast.add(new Print(((StatementContext)_localctx).PRINT.getLine(), ((StatementContext)_localctx).PRINT.getCharPositionInLine()+1, ((StatementContext)_localctx).expressions.ast));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				((StatementContext)_localctx).INPUT = match(INPUT);
				setState(144);
				((StatementContext)_localctx).expression = expression(0);
				setState(145);
				match(T__0);
				_localctx.ast.add(new Input(((StatementContext)_localctx).INPUT.getLine(), ((StatementContext)_localctx).INPUT.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				((StatementContext)_localctx).RETURN = match(RETURN);
				setState(149);
				((StatementContext)_localctx).expression = expression(0);
				setState(150);
				match(T__0);
				_localctx.ast.add(new Return(((StatementContext)_localctx).RETURN.getLine(), ((StatementContext)_localctx).RETURN.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				((StatementContext)_localctx).funcInvocation = funcInvocation();
				setState(154);
				match(T__0);
				_localctx.ast.add((Statement)((StatementContext)_localctx).funcInvocation.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				((StatementContext)_localctx).e1 = expression(0);
				setState(158);
				match(T__21);
				setState(159);
				((StatementContext)_localctx).e2 = expression(0);
				setState(160);
				match(T__0);
				_localctx.ast.add(new Assignment((((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getLine(), (((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				((StatementContext)_localctx).w = match(T__22);
				setState(164);
				((StatementContext)_localctx).expression = expression(0);
				setState(165);
				match(T__23);
				setState(166);
				((StatementContext)_localctx).whileBody = whileBody();
				_localctx.ast.add(new While(((StatementContext)_localctx).w.getLine(), ((StatementContext)_localctx).w.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).whileBody.ast));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				((StatementContext)_localctx).i = match(T__24);
				setState(170);
				((StatementContext)_localctx).expression = expression(0);
				setState(171);
				match(T__23);
				setState(172);
				((StatementContext)_localctx).ifBody = ifBody();
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(173);
					((StatementContext)_localctx).elseBody = elseBody();
					}
					break;
				}
				_localctx.ast.add(new IfElse(((StatementContext)_localctx).i.getLine(), ((StatementContext)_localctx).i.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).ifBody.ast, ((StatementContext)_localctx).elseBody.ast));
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
			setState(180);
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
		public BodyContext body;
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
			setState(183);
			((IfBodyContext)_localctx).body = body();
			_localctx.ast.addAll(((IfBodyContext)_localctx).body.ast);
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

	public static class ElseBodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public BodyContext body;
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterElseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitElseBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitElseBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBodyContext elseBody() throws RecognitionException {
		ElseBodyContext _localctx = new ElseBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__25);
			setState(187);
			((ElseBodyContext)_localctx).body = body();
			_localctx.ast.addAll(((ElseBodyContext)_localctx).body.ast);
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
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(190);
				((BodyContext)_localctx).s1 = statement();
				_localctx.ast.addAll(((BodyContext)_localctx).s1.ast);
				}
				break;
			case 2:
				{
				setState(193);
				match(T__26);
				setState(194);
				((BodyContext)_localctx).s2 = statement();
				_localctx.ast.addAll(((BodyContext)_localctx).s2.ast);
				setState(196);
				match(T__27);
				}
				break;
			case 3:
				{
				setState(198);
				match(T__26);
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(199);
					((BodyContext)_localctx).s3 = statement();
					_localctx.ast.addAll(((BodyContext)_localctx).s3.ast);
					}
					}
					setState(204); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__22) | (1L << T__24) | (1L << PRINT) | (1L << RETURN) | (1L << INPUT) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0) );
				setState(206);
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
		public Token INT_CONSTANT;
		public TypeContext type;
		public Token STRUCT;
		public FieldsContext fields;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(PmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(PmmParser.INT_CONSTANT, i);
		}
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
			int _alt;
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(T__28);
				((TypeContext)_localctx).ast =  new IntType();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__29);
				((TypeContext)_localctx).ast =  new CharType();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(T__30);
				((TypeContext)_localctx).ast =  new DoubleType();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(T__31);
				((TypeContext)_localctx).ast =  new VoidType();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(221); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(218);
						((TypeContext)_localctx).par = match(T__3);
						setState(219);
						((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
						setState(220);
						match(T__4);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(223); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(225);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast =  new Array(((TypeContext)_localctx).par.getLine(), ((TypeContext)_localctx).par.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)), ((TypeContext)_localctx).type.ast);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				((TypeContext)_localctx).STRUCT = match(STRUCT);
				setState(229);
				match(T__26);
				setState(230);
				((TypeContext)_localctx).fields = fields();
				setState(231);
				match(T__27);
				((TypeContext)_localctx).ast =  new Record(((TypeContext)_localctx).STRUCT.getLine(), ((TypeContext)_localctx).STRUCT.getCharPositionInLine()+1, ((TypeContext)_localctx).fields.ast);
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				((VarDefinitionContext)_localctx).oneVariable = oneVariable();
				_localctx.ast.add(((VarDefinitionContext)_localctx).oneVariable.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
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
			setState(244);
			((OneVariableContext)_localctx).ID = match(ID);
			setState(245);
			match(T__23);
			setState(246);
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
		public Token ID;
		public TypeContext type;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(249);
			((MultipleVariablesContext)_localctx).ID = match(ID);
			_localctx.ast.add(new VarDefinition(((MultipleVariablesContext)_localctx).ID.getLine(), ((MultipleVariablesContext)_localctx).ID.getCharPositionInLine()+1, null, (((MultipleVariablesContext)_localctx).ID!=null?((MultipleVariablesContext)_localctx).ID.getText():null)));
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251);
				match(T__20);
				setState(252);
				((MultipleVariablesContext)_localctx).ID = match(ID);
				_localctx.ast.add(new VarDefinition(((MultipleVariablesContext)_localctx).ID.getLine(), ((MultipleVariablesContext)_localctx).ID.getCharPositionInLine()+1, null, (((MultipleVariablesContext)_localctx).ID!=null?((MultipleVariablesContext)_localctx).ID.getText():null)));
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__20 );
			setState(258);
			match(T__23);
			setState(259);
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
		public VarDefinitionContext varDefinition;
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
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(262);
				((FieldsContext)_localctx).varDefinition = varDefinition();
				for(VarDefinition var: ((FieldsContext)_localctx).varDefinition.ast) {_localctx.ast.add(new RecordField(var.getLine(), var.getColumn(),var.getName(),var.getType()));}
				setState(264);
				match(T__0);
				}
				}
				setState(268); 
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
		public TypeContext type;
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			((FuncDefinitionContext)_localctx).DEF = match(DEF);
			setState(271);
			((FuncDefinitionContext)_localctx).ID = match(ID);
			setState(272);
			((FuncDefinitionContext)_localctx).params = params();
			((FuncDefinitionContext)_localctx).ast =  new FuncDefinition(((FuncDefinitionContext)_localctx).DEF.getLine(), ((FuncDefinitionContext)_localctx).DEF.getCharPositionInLine()+1,new FuncType(((FuncDefinitionContext)_localctx).ID.getLine(),((FuncDefinitionContext)_localctx).ID.getCharPositionInLine()+1,null,((FuncDefinitionContext)_localctx).params.ast),(((FuncDefinitionContext)_localctx).ID!=null?((FuncDefinitionContext)_localctx).ID.getText():null),null);
			setState(274);
			match(T__23);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << STRUCT))) != 0)) {
				{
				setState(275);
				((FuncDefinitionContext)_localctx).type = type();
				((FuncType)_localctx.ast.getType()).setType(((FuncDefinitionContext)_localctx).type.ast);
				}
			}

			setState(280);
			match(T__26);
			setState(281);
			((FuncDefinitionContext)_localctx).funcBody = funcBody();
			_localctx.ast.setStatements(((FuncDefinitionContext)_localctx).funcBody.ast);
			setState(283);
			match(T__27);
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
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(285);
					((FuncBodyContext)_localctx).varDefinition = varDefinition();
					_localctx.ast.addAll(((FuncBodyContext)_localctx).varDefinition.ast);
					setState(287);
					match(T__0);
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__22) | (1L << T__24) | (1L << PRINT) | (1L << RETURN) | (1L << INPUT) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(294);
				((FuncBodyContext)_localctx).statement = statement();
				_localctx.ast.addAll(((FuncBodyContext)_localctx).statement.ast);
				}
				}
				setState(301);
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
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(T__1);
				setState(303);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(T__1);
				setState(305);
				((ParamsContext)_localctx).v1 = oneVariable();
				_localctx.ast.add(((ParamsContext)_localctx).v1.ast);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(307);
					match(T__20);
					setState(308);
					((ParamsContext)_localctx).v2 = oneVariable();
					_localctx.ast.add(((ParamsContext)_localctx).v2.ast);
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(316);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			((MainDefinitionContext)_localctx).DEF = match(DEF);
			setState(321);
			((MainDefinitionContext)_localctx).MAIN = match(MAIN);
			setState(322);
			match(T__1);
			setState(323);
			match(T__2);
			setState(324);
			match(T__23);
			setState(325);
			match(T__26);
			setState(326);
			((MainDefinitionContext)_localctx).funcBody = funcBody();
			setState(327);
			match(T__27);
			((MainDefinitionContext)_localctx).ast =  new FuncDefinition(((MainDefinitionContext)_localctx).DEF.getLine(),((MainDefinitionContext)_localctx).DEF.getCharPositionInLine()+1,new FuncType(((MainDefinitionContext)_localctx).DEF.getLine(), ((MainDefinitionContext)_localctx).DEF.getCharPositionInLine()+1,VoidType.getInstance(),null),(((MainDefinitionContext)_localctx).MAIN!=null?((MainDefinitionContext)_localctx).MAIN.getText():null), ((MainDefinitionContext)_localctx).funcBody.ast);
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
			setState(330);
			((FuncInvocationContext)_localctx).ID = match(ID);
			setState(331);
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
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(T__1);
				setState(335);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(T__1);
				setState(337);
				((ArgumentsContext)_localctx).expressions = expressions();
				_localctx.ast.addAll(((ArgumentsContext)_localctx).expressions.ast);
				setState(339);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u015a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3\2"+
		"\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3]\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4\u0088\n\4\f\4\16\4\u008b\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b1\n\5\3\5\3\5\5\5\u00b5"+
		"\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\6\t\u00cd\n\t\r\t\16\t\u00ce\3\t\3\t\5\t\u00d3"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00e0\n\n\r\n\16"+
		"\n\u00e1\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ed\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00f5\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\6\r\u0101\n\r\r\r\16\r\u0102\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\6\16\u010d\n\16\r\16\16\16\u010e\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u0119\n\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20"+
		"\u0124\n\20\f\20\16\20\u0127\13\20\3\20\3\20\3\20\7\20\u012c\n\20\f\20"+
		"\16\20\u012f\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u013a"+
		"\n\21\f\21\16\21\u013d\13\21\3\21\3\21\5\21\u0141\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0158\n\24\3\24\2\3\4\25\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&\2\6\3\2\13\r\4\2\t\t\16\16\3\2\17\24\3\2\25\26"+
		"\2\u0170\2(\3\2\2\2\4\\\3\2\2\2\6\u0081\3\2\2\2\b\u00b4\3\2\2\2\n\u00b6"+
		"\3\2\2\2\f\u00b9\3\2\2\2\16\u00bc\3\2\2\2\20\u00d2\3\2\2\2\22\u00ec\3"+
		"\2\2\2\24\u00f4\3\2\2\2\26\u00f6\3\2\2\2\30\u00fb\3\2\2\2\32\u010c\3\2"+
		"\2\2\34\u0110\3\2\2\2\36\u0125\3\2\2\2 \u0140\3\2\2\2\"\u0142\3\2\2\2"+
		"$\u014c\3\2\2\2&\u0157\3\2\2\2(/\b\2\1\2)*\5\24\13\2*+\b\2\1\2+,\7\3\2"+
		"\2,.\3\2\2\2-)\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\67\3\2\2\2"+
		"\61/\3\2\2\2\62\63\5\34\17\2\63\64\b\2\1\2\64\66\3\2\2\2\65\62\3\2\2\2"+
		"\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\5\"\22"+
		"\2;<\b\2\1\2<\3\3\2\2\2=>\b\3\1\2>?\7\4\2\2?@\5\4\3\2@A\7\5\2\2AB\b\3"+
		"\1\2B]\3\2\2\2CD\7\4\2\2DE\5\22\n\2EF\7\5\2\2FG\5\4\3\16GH\b\3\1\2H]\3"+
		"\2\2\2IJ\7\t\2\2JK\5\4\3\rKL\b\3\1\2L]\3\2\2\2MN\7\n\2\2NO\5\4\3\fOP\b"+
		"\3\1\2P]\3\2\2\2QR\5$\23\2RS\b\3\1\2S]\3\2\2\2TU\7,\2\2U]\b\3\1\2VW\7"+
		".\2\2W]\b\3\1\2XY\7-\2\2Y]\b\3\1\2Z[\7/\2\2[]\b\3\1\2\\=\3\2\2\2\\C\3"+
		"\2\2\2\\I\3\2\2\2\\M\3\2\2\2\\Q\3\2\2\2\\T\3\2\2\2\\V\3\2\2\2\\X\3\2\2"+
		"\2\\Z\3\2\2\2]~\3\2\2\2^_\f\13\2\2_`\t\2\2\2`a\5\4\3\fab\b\3\1\2b}\3\2"+
		"\2\2cd\f\n\2\2de\t\3\2\2ef\5\4\3\13fg\b\3\1\2g}\3\2\2\2hi\f\t\2\2ij\t"+
		"\4\2\2jk\5\4\3\nkl\b\3\1\2l}\3\2\2\2mn\f\b\2\2no\t\5\2\2op\5\4\3\tpq\b"+
		"\3\1\2q}\3\2\2\2rs\f\20\2\2st\7\6\2\2tu\5\4\3\2uv\7\7\2\2vw\b\3\1\2w}"+
		"\3\2\2\2xy\f\17\2\2yz\7\b\2\2z{\7/\2\2{}\b\3\1\2|^\3\2\2\2|c\3\2\2\2|"+
		"h\3\2\2\2|m\3\2\2\2|r\3\2\2\2|x\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\5\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5\4\3\2\u0082\u0089"+
		"\b\4\1\2\u0083\u0084\7\27\2\2\u0084\u0085\5\4\3\2\u0085\u0086\b\4\1\2"+
		"\u0086\u0088\3\2\2\2\u0087\u0083\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\7\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\7#\2\2\u008d\u008e\5\6\4\2\u008e\u008f\7\3\2\2\u008f\u0090\b\5"+
		"\1\2\u0090\u00b5\3\2\2\2\u0091\u0092\7%\2\2\u0092\u0093\5\4\3\2\u0093"+
		"\u0094\7\3\2\2\u0094\u0095\b\5\1\2\u0095\u00b5\3\2\2\2\u0096\u0097\7$"+
		"\2\2\u0097\u0098\5\4\3\2\u0098\u0099\7\3\2\2\u0099\u009a\b\5\1\2\u009a"+
		"\u00b5\3\2\2\2\u009b\u009c\5$\23\2\u009c\u009d\7\3\2\2\u009d\u009e\b\5"+
		"\1\2\u009e\u00b5\3\2\2\2\u009f\u00a0\5\4\3\2\u00a0\u00a1\7\30\2\2\u00a1"+
		"\u00a2\5\4\3\2\u00a2\u00a3\7\3\2\2\u00a3\u00a4\b\5\1\2\u00a4\u00b5\3\2"+
		"\2\2\u00a5\u00a6\7\31\2\2\u00a6\u00a7\5\4\3\2\u00a7\u00a8\7\32\2\2\u00a8"+
		"\u00a9\5\n\6\2\u00a9\u00aa\b\5\1\2\u00aa\u00b5\3\2\2\2\u00ab\u00ac\7\33"+
		"\2\2\u00ac\u00ad\5\4\3\2\u00ad\u00ae\7\32\2\2\u00ae\u00b0\5\f\7\2\u00af"+
		"\u00b1\5\16\b\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2\u00b3\b\5\1\2\u00b3\u00b5\3\2\2\2\u00b4\u008c\3\2\2\2\u00b4"+
		"\u0091\3\2\2\2\u00b4\u0096\3\2\2\2\u00b4\u009b\3\2\2\2\u00b4\u009f\3\2"+
		"\2\2\u00b4\u00a5\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b5\t\3\2\2\2\u00b6\u00b7"+
		"\5\20\t\2\u00b7\u00b8\b\6\1\2\u00b8\13\3\2\2\2\u00b9\u00ba\5\20\t\2\u00ba"+
		"\u00bb\b\7\1\2\u00bb\r\3\2\2\2\u00bc\u00bd\7\34\2\2\u00bd\u00be\5\20\t"+
		"\2\u00be\u00bf\b\b\1\2\u00bf\17\3\2\2\2\u00c0\u00c1\5\b\5\2\u00c1\u00c2"+
		"\b\t\1\2\u00c2\u00d3\3\2\2\2\u00c3\u00c4\7\35\2\2\u00c4\u00c5\5\b\5\2"+
		"\u00c5\u00c6\b\t\1\2\u00c6\u00c7\7\36\2\2\u00c7\u00d3\3\2\2\2\u00c8\u00cc"+
		"\7\35\2\2\u00c9\u00ca\5\b\5\2\u00ca\u00cb\b\t\1\2\u00cb\u00cd\3\2\2\2"+
		"\u00cc\u00c9\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\36\2\2\u00d1\u00d3\3\2\2\2"+
		"\u00d2\u00c0\3\2\2\2\u00d2\u00c3\3\2\2\2\u00d2\u00c8\3\2\2\2\u00d3\21"+
		"\3\2\2\2\u00d4\u00d5\7\37\2\2\u00d5\u00ed\b\n\1\2\u00d6\u00d7\7 \2\2\u00d7"+
		"\u00ed\b\n\1\2\u00d8\u00d9\7!\2\2\u00d9\u00ed\b\n\1\2\u00da\u00db\7\""+
		"\2\2\u00db\u00ed\b\n\1\2\u00dc\u00dd\7\6\2\2\u00dd\u00de\7,\2\2\u00de"+
		"\u00e0\7\7\2\2\u00df\u00dc\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5\22\n\2\u00e4"+
		"\u00e5\b\n\1\2\u00e5\u00ed\3\2\2\2\u00e6\u00e7\7\'\2\2\u00e7\u00e8\7\35"+
		"\2\2\u00e8\u00e9\5\32\16\2\u00e9\u00ea\7\36\2\2\u00ea\u00eb\b\n\1\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00d4\3\2\2\2\u00ec\u00d6\3\2\2\2\u00ec\u00d8\3\2"+
		"\2\2\u00ec\u00da\3\2\2\2\u00ec\u00df\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ed"+
		"\23\3\2\2\2\u00ee\u00ef\5\26\f\2\u00ef\u00f0\b\13\1\2\u00f0\u00f5\3\2"+
		"\2\2\u00f1\u00f2\5\30\r\2\u00f2\u00f3\b\13\1\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00ee\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\25\3\2\2\2\u00f6\u00f7\7/\2\2"+
		"\u00f7\u00f8\7\32\2\2\u00f8\u00f9\5\22\n\2\u00f9\u00fa\b\f\1\2\u00fa\27"+
		"\3\2\2\2\u00fb\u00fc\7/\2\2\u00fc\u0100\b\r\1\2\u00fd\u00fe\7\27\2\2\u00fe"+
		"\u00ff\7/\2\2\u00ff\u0101\b\r\1\2\u0100\u00fd\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\7\32\2\2\u0105\u0106\5\22\n\2\u0106\u0107\b\r\1\2\u0107\31\3\2"+
		"\2\2\u0108\u0109\5\24\13\2\u0109\u010a\b\16\1\2\u010a\u010b\7\3\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u0108\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\33\3\2\2\2\u0110\u0111\7&\2\2\u0111\u0112"+
		"\7/\2\2\u0112\u0113\5 \21\2\u0113\u0114\b\17\1\2\u0114\u0118\7\32\2\2"+
		"\u0115\u0116\5\22\n\2\u0116\u0117\b\17\1\2\u0117\u0119\3\2\2\2\u0118\u0115"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\35\2\2"+
		"\u011b\u011c\5\36\20\2\u011c\u011d\b\17\1\2\u011d\u011e\7\36\2\2\u011e"+
		"\35\3\2\2\2\u011f\u0120\5\24\13\2\u0120\u0121\b\20\1\2\u0121\u0122\7\3"+
		"\2\2\u0122\u0124\3\2\2\2\u0123\u011f\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012d\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0128\u0129\5\b\5\2\u0129\u012a\b\20\1\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0128\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\37\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\4\2\2\u0131\u0141"+
		"\7\5\2\2\u0132\u0133\7\4\2\2\u0133\u0134\5\26\f\2\u0134\u013b\b\21\1\2"+
		"\u0135\u0136\7\27\2\2\u0136\u0137\5\26\f\2\u0137\u0138\b\21\1\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0135\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u013f\7\5\2\2\u013f\u0141\3\2\2\2\u0140\u0130\3\2\2\2\u0140\u0132\3\2"+
		"\2\2\u0141!\3\2\2\2\u0142\u0143\7&\2\2\u0143\u0144\7(\2\2\u0144\u0145"+
		"\7\4\2\2\u0145\u0146\7\5\2\2\u0146\u0147\7\32\2\2\u0147\u0148\7\35\2\2"+
		"\u0148\u0149\5\36\20\2\u0149\u014a\7\36\2\2\u014a\u014b\b\22\1\2\u014b"+
		"#\3\2\2\2\u014c\u014d\7/\2\2\u014d\u014e\5&\24\2\u014e\u014f\b\23\1\2"+
		"\u014f%\3\2\2\2\u0150\u0151\7\4\2\2\u0151\u0158\7\5\2\2\u0152\u0153\7"+
		"\4\2\2\u0153\u0154\5\6\4\2\u0154\u0155\b\24\1\2\u0155\u0156\7\5\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0150\3\2\2\2\u0157\u0152\3\2\2\2\u0158\'\3\2\2\2"+
		"\27/\67\\|~\u0089\u00b0\u00b4\u00ce\u00d2\u00e1\u00ec\u00f4\u0102\u010e"+
		"\u0118\u0125\u012d\u013b\u0140\u0157";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}