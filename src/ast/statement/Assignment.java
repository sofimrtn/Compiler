package ast.statement;

import ast.expression.*;

public class Assignment extends AbstractStatement{

    private Expression left;
    private Expression right;

    private boolean lValue = false;

    public Assignment(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left=left;
        this.right=right;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public boolean getLValue() {
        return lValue;
    }

    public void setLValue(boolean lValue) {
        this.lValue = lValue;
    }
}