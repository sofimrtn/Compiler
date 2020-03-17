package ast.expression;

import visitor.Visitor;

public class Negation extends AbstractExpression{

    private Expression expression;

    public Negation(int line, int column, Expression expression) {
        super(line, column);
        this.expression=expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }
}