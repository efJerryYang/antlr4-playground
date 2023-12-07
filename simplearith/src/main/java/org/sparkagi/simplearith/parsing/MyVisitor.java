package org.sparkagi.simplearith.parsing;

import org.sparkagi.simplearith.generated.SimpleArithBaseVisitor;
import org.sparkagi.simplearith.generated.SimpleArithParser;

public class MyVisitor extends SimpleArithBaseVisitor<Void>{
    @Override
    public Void visitExpr(SimpleArithParser.ExprContext ctx) {
        System.out.println("Visiting expr: " + ctx.getText());
        return super.visitExpr(ctx);
    }
    
}
