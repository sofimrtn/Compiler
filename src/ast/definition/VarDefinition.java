package ast.definition;

import ast.main.AbstractASTNode;
import ast.statement.Statement;
import ast.type.Type;
import visitor.Visitor;

public class VarDefinition extends AbstractASTNode implements Definition, Statement {

    private int scope = 0;

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

    @Override
    public int getScope() {
        return scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope=scope;
    }

    private int offset;

    public int getOffset(){
        return offset;
    }

    public void setOffset(int offset){
        this.offset = offset;
    }

    public void setType(Type type){
        this.type=type;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }

    @Override
    public String toString() {
        return "VarDefinition{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals( Object other ) {
        if (other == null)
            return false;
        if (!( other instanceof VarDefinition ))
            return false;
        VarDefinition variable = (VarDefinition) other;
        return ( this.getName().equals( variable.getName() )
                && this.getScope() == variable.getScope() );
    }
}