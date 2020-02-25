// Generated from C:/Users/msame/IdeaProjects/Compiler/src/parser\Pmm.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#varDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinition(PmmParser.VarDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#oneVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneVariable(PmmParser.OneVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#multipleVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleVariables(PmmParser.MultipleVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#recordField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordField(PmmParser.RecordFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funcDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefinition(PmmParser.FuncDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBody(PmmParser.FuncBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(PmmParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#mainDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDefinition(PmmParser.MainDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funcInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncInvocation(PmmParser.FuncInvocationContext ctx);
}