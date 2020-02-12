package ast.expression;

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
}