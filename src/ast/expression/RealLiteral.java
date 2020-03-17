package ast.expression;

import visitor.Visitor;

public class RealLiteral extends AbstractExpression{

    private double value;

    public RealLiteral(int line, int column, double value) {
        super(line, column);
        this.value=value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }
}