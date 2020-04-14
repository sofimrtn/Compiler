package ast.expression;

import visitor.Visitor;

public class IntLiteral extends AbstractExpression{

    private int value;

    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }

}