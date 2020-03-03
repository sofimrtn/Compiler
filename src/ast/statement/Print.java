package ast.statement;

import ast.expression.*;

public class Print extends AbstractStatement{

    private Expression expression;

    public Print(int line, int column, Expression expression) {
        super(line, column);
        this.expression=expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}