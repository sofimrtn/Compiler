package ast.expression;

public class Variable extends AbstractExpression{

    private String name;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}