package ast.expression;

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
}