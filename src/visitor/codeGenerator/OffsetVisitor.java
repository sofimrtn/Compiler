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

    int bytesParam = 4; //parametros


    @Override
    public Object visit(VarDefinition var, Object param){
        var.getType().accept(this,param);
        if(var.getScope()==0){//global: sumatorio variables anteriores
            var.setOffset(bytesGlobals);
            bytesGlobals += var.getType().getSize();
        }
        else{ //variable local: - sumatorio variables anteriores (y si misma)
            if((boolean)param){
                var.setOffset( bytesParam );
                bytesParam += var.getType().getSize();
            } else{
                bytesLocal -= var.getType().getSize();
                var.setOffset(bytesLocal);
            }
        }
        System.out.println("Variable: " + var.getName() + ", offset: " + var.getOffset());
        return null;
    }

    @Override
    public Object visit(FuncType functionType, Object param ) {
        functionType.getType().accept( this, param );
        for (int i = functionType.getVariables().size() - 1; i >= 0; i--) { //parametros: 4 + tam argumentos a la dcha (sin si mismo)
            functionType.getVariables().get(i).accept(this,true);
        }
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param){
        funcDefinition.getType().accept(this, param);
        for(Statement s : funcDefinition.getStatements()) {
            s.accept(this, false);
        }
        this.bytesLocal = 0;
        this.bytesParam = 4;
        return null;
    }

    @Override
    public Object visit(Record record, Object param){
        int offset = 0;
        for(RecordField r : record.getFields()){// sumatorio de los campos anteriores.
            r.accept(this,param);
            r.setOffset(offset);
            offset += r.getType().getSize();
        }
        return null;
    }
}
