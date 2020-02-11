package ast.expression;

import ast.type.Type;

public class Cast extends AbstractExpression{

    private Type type;
    private Expression expression;


    public Cast(int line, int column, Type type, Expression expr) {
        super(line, column);
        this.type=type;
        this.expression=expr;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}