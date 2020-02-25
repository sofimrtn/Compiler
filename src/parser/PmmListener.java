// Generated from C:/Users/msame/IdeaProjects/Compiler/src/parser\Pmm.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PmmParser}.
 */
public interface PmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PmmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PmmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PmmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PmmParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PmmParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(PmmParser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(PmmParser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#oneVariable}.
	 * @param ctx the parse tree
	 */
	void enterOneVariable(PmmParser.OneVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#oneVariable}.
	 * @param ctx the parse tree
	 */
	void exitOneVariable(PmmParser.OneVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#multipleVariables}.
	 * @param ctx the parse tree
	 */
	void enterMultipleVariables(PmmParser.MultipleVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#multipleVariables}.
	 * @param ctx the parse tree
	 */
	void exitMultipleVariables(PmmParser.MultipleVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#recordField}.
	 * @param ctx the parse tree
	 */
	void enterRecordField(PmmParser.RecordFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#recordField}.
	 * @param ctx the parse tree
	 */
	void exitRecordField(PmmParser.RecordFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#funcDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefinition(PmmParser.FuncDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#funcDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefinition(PmmParser.FuncDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(PmmParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(PmmParser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(PmmParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(PmmParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#mainDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMainDefinition(PmmParser.MainDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#mainDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMainDefinition(PmmParser.MainDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#funcInvocation}.
	 * @param ctx the parse tree
	 */
	void enterFuncInvocation(PmmParser.FuncInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#funcInvocation}.
	 * @param ctx the parse tree
	 */
	void exitFuncInvocation(PmmParser.FuncInvocationContext ctx);
}