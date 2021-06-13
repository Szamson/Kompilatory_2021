// Generated from Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(GrammarParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(GrammarParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(GrammarParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(GrammarParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(GrammarParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bracket_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket_cond(GrammarParser.Bracket_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cond_help}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_help(GrammarParser.Cond_helpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(GrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(GrammarParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(GrammarParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GrammarParser.FunctionContext ctx);
}