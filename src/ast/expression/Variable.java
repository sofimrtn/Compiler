package ast.expression;

import visitor.Visitor;

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

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }
}