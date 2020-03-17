package ast.expression;

import visitor.Visitor;

public class CharLiteral extends AbstractExpression{

    private char value;

    public CharLiteral(int line, int column, char value) {
        super(line, column);
        this.value=value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }
}