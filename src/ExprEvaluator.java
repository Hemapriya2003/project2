package src;

public class ExprEvaluator implements ExprVisitor<Float> {
    /*
     * Part 2: implement the visitor pattern for expressions
     */
    @Override
    public Float visit(PlusExpr plusExpr) {
        return plusExpr.getE1().accept(this) + plusExpr.getE2().accept(this);
    }

    @Override
    public Float visit(MinusExpr minusExpr) {
        return minusExpr.getE1().accept(this) - minusExpr.getE2().accept(this);
    }

    @Override
    public Float visit(TimesExpr timesExpr) {
        return timesExpr.getE1().accept(this) * timesExpr.getE2().accept(this);
    }

    @Override
    public Float visit(DivExpr divExpr) {
        return divExpr.getE1().accept(this) / divExpr.getE2().accept(this);
    }

    @Override
    public Float visit(FloatExpr floatExpr) {
        return floatExpr.literal;
    }
}
