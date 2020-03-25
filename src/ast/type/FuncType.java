package ast.type;

import ast.definition.VarDefinition;
import ast.expression.Expression;
import visitor.Visitor;

import java.util.List;

public class FuncType extends AbstractType{

    private Type type; //ReturnType relationship
    private List<VarDefinition> variables;

    public FuncType(int line, int column, Type type, List<VarDefinition> variables) {
        super(line, column);
        this.type=type;
        this.variables=variables;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<VarDefinition> getVariables() {
        return variables;
    }

    public void setVariables(List<VarDefinition> variables) {
        this.variables = variables;
    }

    @Override
    public Type parenthesis(List<Expression> expressions){
        //TODO
        //se puede hacer uso del promotes.
        //recorrer ambas listas sincronizadamente si todos promotesTo -->> return type, sino, null.
        return null;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }
}