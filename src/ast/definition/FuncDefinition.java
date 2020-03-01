package ast.definition;

import ast.main.AbstractASTNode;
import ast.statement.Statement;
import ast.type.Type;

import java.util.List;

public class FuncDefinition extends AbstractASTNode implements Definition {

    private List<Statement> statements;

    public FuncDefinition(int line, int col, Type type, String name, List<Statement> statements){
        super(line,col);
        this.name=name;
        this.type=type;
        this.statements=statements;
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

    public void setStatements(List<Statement> list){
        this.statements=statements;
    }
    public List<Statement> getSentencias() {
        return statements;
    }
}