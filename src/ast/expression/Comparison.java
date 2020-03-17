package ast.expression;

import visitor.Visitor;

public class Comparison extends AbstractExpression{

    private Expression right;
    private Expression left;
    private String operator;

    public Comparison(int line, int column, Expression left, String operator, Expression right) {
        super(line, column);
        this.right=right;
        this.operator=operator;
        this.left=left;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }
}