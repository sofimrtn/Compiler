package ast.expression;

import visitor.Visitor;

public class FieldAccess extends AbstractExpression{

    private Expression expression;
    private String name;

    public FieldAccess(int line, int column, Expression expression, String name) {
        super(line, column);
        this.expression=expression;
        this.name=name;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }
}