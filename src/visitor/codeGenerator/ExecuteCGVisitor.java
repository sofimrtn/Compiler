package visitor.codeGenerator;

import ast.Program;
import ast.definition.Definition;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.FuncInvocation;
import ast.statement.*;

public class ExecuteCGVisitor extends AbstractCGVisitor {

    public ExecuteCGVisitor(CodeGenerator cg){
        super(cg);
    }
    public ExecuteCGVisitor(String output){
        this (new CodeGenerator(output));
    }

    @Override
    public Object visit(Program program, Object param) {

        cg.call("main"); //call main
        cg.halt(); //halt

        for (Definition d : program.getDefinitions()) {
            if (d instanceof VarDefinition) {
                d.accept( this, param );
            }
        }
        for (Definition d : program.getDefinitions()) {
            if (!(d instanceof VarDefinition)) {
                d.accept( this, param );
            }
        }
        return null;
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object param) {
        return super.visit(varDefinition, param);
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param) {
        //{nombre}:
        cg.label(funcDefinition.getName());
        //enter{tamLocales}
        cg.enter(funcDefinition.getType().numberOfBytes());
        //execute[[sentencia_i]]
        for(Statement s : funcDefinition.getStatements()){
            if(!(s instanceof VarDefinition)){
                s.accept(this, param);
            }
        }
        //if(funcDefinition.getType() instanceOf VoidType)
        //  RET 0,{tamLocales},{tamParams}
        return null;
    }

    @Override
    public Object visit(FuncInvocation funcInvocation, Object param) {
        //TODO proxima clase
        return null;
    }

    @Override
    public Object visit(Assignment assignment, Object param) {
        //address[[assignment.getLeft()]]
        //value[[assignment.getRight()]]
        //<store>assignment.getLeft().getType().suffix()
        cg.store(assignment.getLeft().getType().suffix());
        return null;
    }

    @Override
    public Object visit(IfElse ifElse, Object param) {
        //TODO proxima clase
        return null;
    }

    @Override
    public Object visit(Input input, Object param) {
        //address[[input.getExpression()]]
        //<in>input.getExpression().getType().suffix()
        cg.in(input.getExpression().getType().suffix());
        //<store>input.getExpression().getType().suffix()
        cg.store(input.getExpression().getType().suffix());
        return null;
    }

    @Override
    public Object visit(Print print, Object param) {
        //valor[[ret.getExpression()]]  -> print.getExpression().accept(ValueCGVisitor,param)?????
        //<out>ret.getExpression().getType().suffix()
        cg.out(print.getExpression().getType().suffix());
        return null;
    }

    @Override
    public Object visit(Return ret, Object param) {
        //if(ret.getExpression!=null)
        //  valor[[ret.getExpression()]]
        // RET{},{},{}
        return null;
    }

    @Override
    public Object visit(While wh, Object param) {
        //TODO proxima clase
        return null;
    }
}
