package ast.expression;

import ast.definition.Definition;
import visitor.Visitor;

public class Variable extends AbstractExpression{

    private String name;

    private Definition definition;

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

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    public Definition getDefinition() {
        return definition;
    }
}