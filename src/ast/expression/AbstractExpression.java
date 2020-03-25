package ast.expression;

import ast.main.AbstractASTNode;
import ast.type.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression{

    private boolean lValue = false;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public void setLValue( boolean lValue ) {
        this.lValue = lValue;
    }

    @Override
    public boolean getLValue() {
        return this.lValue;
    }

    public Type type;

    @Override
    public Type getType(){
        return type;
    }

    public void setType(Type type){
        this.type=type;
    }
}