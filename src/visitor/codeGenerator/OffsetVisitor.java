package visitor.codeGenerator;

import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.statement.Statement;
import ast.type.FuncType;
import ast.type.Record;
import ast.type.RecordField;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor {

    int bytesGlobals; //globales

    int bytesLocal; //locales

    @Override
    public Object visit(VarDefinition var, Object param){
        var.getType().accept(this,param);
        if(var.getScope()==0){//global: sumatorio variables anteriores
            var.setOffset(bytesGlobals);
            bytesGlobals += var.getType().numberOfBytes();
        }
        else{ //variable local: - sumatorio variables anteriores (y si misma)
            bytesLocal -= var.getType().numberOfBytes();
            var.setOffset(bytesLocal);
        }
        //System.out.println("Variable: " + var.getName() + ", offset: " + var.getOffset());
        return null;
    }

    @Override
    public Object visit(FuncType functionType, Object param ) {
        int offset=4;
        for (int i = functionType.getVariables().size() - 1; i >= 0; i--) { //parametros: 4 + tam argumentos a la dcha (sin si mismo)
            functionType.getVariables().get(i).setOffset(offset);
            offset+= functionType.getVariables().get(i).getType().numberOfBytes();
            //System.out.println("Param: " + functionType.getVariables().get(i).getName() + ", offset: " + functionType.getVariables().get(i).getOffset());
        }
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param){
        super.visit(funcDefinition,param);
        this.bytesLocal = 0;
        return null;
    }

    @Override
    public Object visit(Record record, Object param){
        int offset = 0;
        for(RecordField r : record.getFields()){// sumatorio de los campos anteriores.
            r.setOffset(offset);
            offset += r.getType().numberOfBytes();
        }
        return null;
    }
}
