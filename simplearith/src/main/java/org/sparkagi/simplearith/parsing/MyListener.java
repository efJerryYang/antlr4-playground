package org.sparkagi.simplearith.parsing;

import org.antlr.v4.runtime.tree.*;
import org.sparkagi.simplearith.generated.SimpleArithBaseListener;
import org.sparkagi.simplearith.generated.SimpleArithParser;

public class MyListener extends SimpleArithBaseListener {

    @Override
    public void enterExpr(SimpleArithParser.ExprContext ctx) {
        System.out.println("Entering expr: " + ctx.getText());
        // for (ParseTree child : ctx.children) {
        //     if (child instanceof TerminalNode) {
        //         // This is a terminal node like a number or operator
        //         System.out.println("Terminal node: " + child.getText());
        //     } else {
        //         // This is a non-terminal node
        //         System.out.println("Non-terminal node: " + child.getText());
        //     }
        // }
    }

    @Override
    public void exitExpr(SimpleArithParser.ExprContext ctx) {
        // System.out.println("Exiting expr: " + ctx.getText());
    }

}