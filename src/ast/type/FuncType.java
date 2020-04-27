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

    public int getSizeParams(){
        int size = 0;
        for(VarDefinition var:variables){
            size+=var.getOffset();
        }
        return size;
    }

    @Override
    public int numberOfBytes(){
        if(this.getType() instanceof ErrorType){
            throw new IllegalStateException();
        }
        return this.getType().numberOfBytes();
    }

    @Override
    public Type parenthesis(List<Expression> expressions){
        //se puede hacer uso del promotes.
        //recorrer ambas listas sincronizadamente si todos promotesTo -->> return type, sino, null.
        if(expressions.size() == variables.size()){ //si el numero es el mismo
            for(int i=0; i<expressions.size(); i++){
                if(expressions.get(i).getType().promotesTo(variables.get(i).getType()) == null){
                    return null;
                }
            }
            return type; //este se mueve aquí porque si haces el if al reves no funciona para voids.
        }
        return null;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }
}