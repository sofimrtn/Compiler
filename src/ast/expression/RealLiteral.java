package ast.expression;

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
}