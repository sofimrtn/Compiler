package ast.definition;

import ast.main.AbstractASTNode;
import ast.statement.Statement;
import ast.type.Type;
import visitor.Visitor;

import java.util.List;

public class FuncDefinition extends AbstractASTNode implements Definition {

    private List<Statement> statements;

    private int scope = 0;

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

    @Override
    public int getScope() {
        return scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope=scope;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }

    public List<Statement> getStatements() {
        return statements;
    }
}