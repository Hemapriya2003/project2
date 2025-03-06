package src;

public interface ExprVisitor<R> {
    /*
     * Part 2: Implement the visitor pattern for expressions
     */
    R visit(PlusExpr plusExpr);
    R visit(MinusExpr minusExpr);
    R visit(TimesExpr timesExpr);
    R visit(DivExpr divExpr);
    R visit(FloatExpr floatExpr);
}
