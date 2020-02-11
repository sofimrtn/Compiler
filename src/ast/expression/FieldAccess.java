package ast.expression;

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
}