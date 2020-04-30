package visitor.codeGenerator;

import ast.Program;
import ast.definition.Definition;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.FuncInvocation;
import ast.statement.*;
import ast.type.FuncType;
import ast.type.VoidType;

public class ExecuteCGVisitor extends AbstractCGVisitor {

    private ValueCGVisitor value;
    private AddressCGVisitor address;

    private String input;

    public ExecuteCGVisitor(CodeGenerator cg){
        super(cg);
    }

    public ExecuteCGVisitor(String input, String output){
        this (new CodeGenerator(input,output));
        this.value = new ValueCGVisitor(cg);
        this.address = new AddressCGVisitor(cg,value);
        value.setAddressVisitor(address);
        this.input=input;
    }

    @Override
    public Object visit(Program program, Object param) {

        cg.printFileName(input);
        cg.lineBreak();

        for (Definition d : program.getDefinitions()) {
            if (d instanceof VarDefinition) {
                d.accept( this, param );
            }
        }
        cg.lineBreak();
        cg.initialComment();

        cg.call("main"); //call main
        cg.halt(); //halt
        cg.lineBreak();

        for (Definition d : program.getDefinitions()) {
            if (!(d instanceof VarDefinition)) {
                d.accept( this, param );
            }
        }
        return null;
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object param) {
        cg.declareVars(varDefinition);
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param) {
        cg.printLine(funcDefinition.getLine());
        cg.lineBreak();
        FuncType type =(FuncType) funcDefinition.getType(); //tipo de retorno

        //{nombre}:
        cg.label(funcDefinition.getName());

        //comentarios variables
        cg.commentParams();
        for(VarDefinition v : type.getVariables()){
            cg.declareVars(v);
        }
        cg.commentLocalVars();
        for(Statement s : funcDefinition.getStatements()){
            if(s instanceof VarDefinition){
                cg.declareVars((VarDefinition) s);
            }
        }
        //enter{tamLocales}
        cg.enter(funcDefinition.getSizeLocals());

        //execute[[sentencia_i]]
        for(Statement s : funcDefinition.getStatements()){
            if(!(s instanceof VarDefinition)){
                s.accept(this, funcDefinition);
                //cg.lineBreak();
            }
        }

        if(type.getType() instanceof VoidType){
            //  RET 0,{tamLocales},{tamParams}
            cg.ret(0,funcDefinition.getSizeLocals(), ((FuncType) type).getSizeParams());
        }
        return null;
    }

    @Override
    public Object visit(FuncInvocation funcInvocation, Object param) {
        cg.header(funcInvocation.getLine(), funcInvocation.toString());
        //value[[(Expression)statement]()
        funcInvocation.accept(value, param);
        if(!(funcInvocation.getType() instanceof VoidType)){
            //pop<(Expression)statement.getType.suffix>
            cg.pop(funcInvocation.getType().suffix());
        }
        return null;
    }

    @Override
    public Object visit(Assignment assignment, Object param) {
        cg.header(assignment.getLine(), assignment.toString());
        //address[[assignment.getLeft()]]
        assignment.getLeft().accept(address, param);
        //value[[assignment.getRight()]]
        assignment.getRight().accept(value, param);
        //<store>assignment.getLeft().getType().suffix()
        cg.store(assignment.getLeft().getType().suffix());
        return null;
    }

    @Override
    public Object visit(IfElse ifElse, Object param) {
        cg.header(ifElse.getLine(), ifElse.toString());

        cg.lineBreak();
        cg.printLine(ifElse.getLine());

        // n=cg.getLabel(2)
        int label = cg.generateLabels(2);
        //valor[[expresion]]
        ifElse.getCondition().accept(value,this);
        //jz <label>n
        cg.jz(label);

        cg.commentIf();
        for(Statement s:ifElse.getIfStatements()){
            //execute[[s]]
            s.accept(this,param);
        }
        //jmp<label>n+1
        cg.jmp(label+1);
        //<label>n<:>
        cg.writeLabel(label);

        cg.commentElse();

        if(ifElse.getElseStatements() != null){
            for(Statement s : ifElse.getElseStatements()){
                //execute[[s1]]()
                s.accept(this,param);
            }
        }
        //<label>n+1<:>
        cg.writeLabel(label + 1);
        return null;
    }

    @Override
    public Object visit(Input input, Object param) {
        cg.header(input.getLine(), input.toString());
        //address[[input.getExpression()]]
        input.getExpression().accept(address, param);
        //<in>input.getExpression().getType().suffix()
        cg.in(input.getExpression().getType().suffix());
        //<store>input.getExpression().getType().suffix()
        cg.store(input.getExpression().getType().suffix());
        return null;
    }

    @Override
    public Object visit(Print print, Object param) {
        cg.header(print.getLine(), print.toString());
        //valor[[ret.getExpression()]]
        print.getExpression().accept(value,param);
        //<out>ret.getExpression().getType().suffix()
        cg.out(print.getExpression().getType().suffix());
        return null;
    }

    @Override
    public Object visit(Return ret, Object param) {
        cg.header(ret.getLine(), ret.toString());
        if(ret.getExpression()!=null){
            //valor[[ret.getExpression()]]
           ret.getExpression().accept(value,this);
        }
        FuncDefinition func = (FuncDefinition) param; //la definicion se pasa por parametro
        // RET{},{},{}
        cg.ret(((FuncType) func.getType()).numberOfBytes(),func.getSizeLocals() ,
                ((FuncType) func.getType()).getSizeParams());
        return null;
    }

    @Override
    public Object visit(While wh, Object param) {
        cg.header(wh.getLine(), wh.toString());

        cg.lineBreak();
        cg.printLine(wh.getLine());

        int label = cg.generateLabels(2);
        //<While>n<:>
        cg.writeLabel(label);
        //Value[[expresion]]
        wh.getCondition().accept(value,this);
        // Jz <fuerawhile>n
        cg.jz(label + 1);

        cg.commentWhile();
        for(Statement s:wh.getStatements()){
            //Execute[[statements_i]]
            s.accept(this,param);
        }
        //Jmp <While>n
        cg.jmp(label);
        //<fuerawhile>n <:>
        cg.writeLabel(label+1);

        return null;
    }
}
