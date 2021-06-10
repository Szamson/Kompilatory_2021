// Generated from Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(GrammarParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(GrammarParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(GrammarParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(GrammarParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(GrammarParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(GrammarParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bracket_cond}.
	 * @param ctx the parse tree
	 */
	void enterBracket_cond(GrammarParser.Bracket_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bracket_cond}.
	 * @param ctx the parse tree
	 */
	void exitBracket_cond(GrammarParser.Bracket_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cond_help}.
	 * @param ctx the parse tree
	 */
	void enterCond_help(GrammarParser.Cond_helpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cond_help}.
	 * @param ctx the parse tree
	 */
	void exitCond_help(GrammarParser.Cond_helpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(GrammarParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(GrammarParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(GrammarParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(GrammarParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GrammarParser.FunctionContext ctx);
}