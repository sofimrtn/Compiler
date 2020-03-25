package visitor.semantic;

import ast.definition.Definition;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.Variable;
import ast.statement.Statement;
import ast.type.ErrorType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class VisitorIdentification extends AbstractVisitor<Object, Object> {

    SymbolTable table = new SymbolTable();

    @Override
    public Object visit(Variable variable, Object param) {
        Definition definition = table.find(variable.getName());
        if(definition == null){
            variable.setDefinition(new VarDefinition(variable.getLine(), variable.getColumn(),
                    new ErrorType(variable,"The variable " + variable.getName() + " has not been defined"),
                    variable.getName()));
        }else{
            variable.setDefinition(definition);
        }
        return null;
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object param){
        boolean added = table.insert(varDefinition);
        if(!added){
            new ErrorType(varDefinition, "Duplicate variable definition " + varDefinition.getName());
        }
        varDefinition.getType().accept(this,param);
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param) {
        boolean added = table.insert(funcDefinition);
        if(!added){
            new ErrorType(funcDefinition, "Duplicate function definition " + funcDefinition.getName());
        }
        table.set();
        funcDefinition.getType().accept(this,param);
        for(Statement st : funcDefinition.getStatements()){
            st.accept(this,param);
        }
        table.reset();

        return null;
    }
}
