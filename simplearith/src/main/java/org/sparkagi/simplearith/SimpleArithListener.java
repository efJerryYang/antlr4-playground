package org.sparkagi.simplearith;

// Generated from grammars/SimpleArith.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleArithParser}.
 */
public interface SimpleArithListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleArithParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleArithParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleArithParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleArithParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleArithParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleArithParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleArithParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleArithParser.ExprContext ctx);
}