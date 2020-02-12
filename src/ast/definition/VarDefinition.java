package ast.definition;

import ast.main.AbstractASTNode;
import ast.statement.Statement;
import ast.type.Type;

public class VarDefinition extends AbstractASTNode implements Definition, Statement {

    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column);
        this.name=name;
        this.type=type;
    }

    private String name;
    private Type type;

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    private int offset;

    public int getOffset(){
        return offset;
    }
}