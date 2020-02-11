package ast.expression;

public class ArrayAccess extends AbstractExpression{

    private Expression right;
    private Expression left;

    public ArrayAccess(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left=left;
        this.right=right;
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
}