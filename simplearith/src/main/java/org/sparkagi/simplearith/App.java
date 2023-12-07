package org.sparkagi.simplearith;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.sparkagi.simplearith.generated.SimpleArithBaseListener;
import org.sparkagi.simplearith.generated.SimpleArithLexer;
import org.sparkagi.simplearith.generated.SimpleArithParser;

/**
 * MyListener
 */
class MyListener extends SimpleArithBaseListener {

    @Override
    public void enterExpr(SimpleArithParser.ExprContext ctx) {
        System.out.println("Entering expr: " + ctx.getText());
        for (ParseTree child : ctx.children) {
            if (child instanceof TerminalNode) {
                // This is a terminal node like a number or operator
                System.out.println("Terminal node: " + child.getText());
            } else {
                // This is a non-terminal node
                System.out.println("Non-terminal node: " + child.getText());
            }
        }
    }

    @Override
    public void exitExpr(SimpleArithParser.ExprContext ctx) {
        System.out.println("Exiting expr: " + ctx.getText());
    }

}

public class App {
    public static void main(String[] args) {
        String input = "1+2*3/5"; // Replace with your input
        CharStream charStream = CharStreams.fromString(input);

        // Instantiate the lexer
        SimpleArithLexer lexer = new SimpleArithLexer(charStream);

        // Token stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Instantiate the parser
        SimpleArithParser parser = new SimpleArithParser(tokens);

        // Assuming 'expr' is the starting rule of your grammar
        ParseTree tree = parser.expr(); // Replace 'expr' with your grammar's starting rule

        MyListener listener = new MyListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

        // Print the parse tree (for debugging)
        System.out.println(tree.toStringTree(parser));
    }
}
