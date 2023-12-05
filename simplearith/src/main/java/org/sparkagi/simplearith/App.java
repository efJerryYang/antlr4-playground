package org.sparkagi.simplearith;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

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

        // Print the parse tree (for debugging)
        System.out.println(tree.toStringTree(parser));
    }
}
