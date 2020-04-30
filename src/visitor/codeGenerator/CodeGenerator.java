package visitor.codeGenerator;

import ast.definition.VarDefinition;
import ast.expression.Arithmetic;
import ast.expression.Comparison;
import ast.expression.LogicOperator;
import ast.type.CharType;
import ast.type.DoubleType;
import ast.type.IntType;
import ast.type.Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter write;

    public CodeGenerator(String input,String output) {
        try{
            this.write = new PrintWriter(new File(output));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void out(String suffix){
        write.println("\tOUT" + suffix);
        write.flush();
    }

    public void load(String suffix){
        write.println("\tLOAD" + suffix);
        write.flush();
    }

    public void store(String suffix){
        write.println("\tSTORE" + suffix);
        write.flush();
    }

    public void in(String suffix){
        write.println("\tIN" + suffix);
        write.flush();
    }

    public void halt(){
        write.println("HALT");
        write.flush();
    }

    public void call(String function){
        if(function.equals("main")){
            write.println("CALL " + function);
            write.flush();
        }else{
            write.println("\tCALL " + function);
            write.flush();
        }
    }

    public void enter(int number){
        write.println("\tENTER " + number);
        write.flush();
    }

    public void label(String name){
        write.println(name + ":");
        write.flush();
    }

    public void pusha(int offset) {
        write.println("\tPUSHA " + offset);
        write.flush();
    }

    public void pushBP() {
        write.println("\tPUSH BP");
        write.flush();
    }

    public void push(int offset) {
        write.println("\tPUSHI " + offset);
        write.flush();
    }

    public void push( double value ) {
        write.println("\tPUSHF " + value );
        write.flush();
    }

    public void push( char value ) {
        write.println( "\tPUSHB " + (int) value );
        write.flush();
    }

    public void add(String suffix) {
        write.println("\tADD" + suffix);
        write.flush();
    }

    public void mul(String suffix) {
        write.println("\tMUL" + suffix);
        write.flush();
    }

    public void not() {
        write.println( "\tNOT" );
        write.flush();
    }

    public void ret(int type, int locals, int params){
        write.println("\tRET "+ type + ", "+locals+", "+params);
        write.flush();
    }

    public void declareVars(VarDefinition v){
        write.println("\t' * " + v.getType() + " " + v.getName() + " ( offset " + v.getOffset() + ")");
        write.flush();
    }

    public void commentParams(){
        write.println("\t' * PARAMETERS");
        write.flush();
    }

    public void commentLocalVars(){
        write.println("\t' * LOCAL VARIABLES");
        write.flush();
    }

    public void lineBreak() {
        write.println();
        write.flush();
    }

    public void arithmetic(Arithmetic arithmetic) {
        switch (arithmetic.getOperator()){
            case "+":
                write.println("\tADD" + arithmetic.getType().suffix());
                write.flush();
                break;
            case "-":
                write.println("\tSUB" + arithmetic.getType().suffix());
                write.flush();
                break;
            case "*":
                write.println("\tMUL" + arithmetic.getType().suffix());
                write.flush();
                break;
            case "/":
                write.println("\tDIV" + arithmetic.getType().suffix());
                write.flush();
                break;
            case "%":
                write.println("\tMOD" + arithmetic.getType().suffix());
                write.flush();
                break;
        }
    }

    public void comparison(Comparison comparison) {
        switch (comparison.getOperator()){
            case ">":
                write.println("\tGT" + comparison.getType().suffix());
                write.flush();
                break;
            case "<":
                write.println("\tLT" + comparison.getType().suffix());
                write.flush();
                break;
            case ">=":
                write.println("\tGE" + comparison.getType().suffix());
                write.flush();
                break;
            case "<=":
                write.println("\tLE" + comparison.getType().suffix());
                write.flush();
                break;
            case "==":
                write.println("\tEQ" + comparison.getType().suffix());
                write.flush();
                break;
            case "!=":
                write.println("\tNE" + comparison.getType().suffix());
                write.flush();
                break;
        }
    }

    public void logical(LogicOperator logicOperator) {
        switch (logicOperator.getOperator()){
            case "&&":
                write.println("\tAND");
                write.flush();
                break;
            case "||":
                write.println("\tOR");
                write.flush();
                break;
        }
    }

    public void cast(Type type, Type castType) {
        if (type instanceof CharType && castType instanceof IntType) {
            write.println( "\tB2I" );
            write.flush();
        }

        if (type instanceof IntType && castType instanceof DoubleType) {
            write.println( "\tI2F" );
            write.flush();
        }

        if (type instanceof DoubleType && castType instanceof IntType) {
            write.println( "\tF2I" );
            write.flush();
        }

        if (type instanceof IntType && castType instanceof CharType) {
            write.println( "\tI2B" );
            write.flush();
        }

        if (type instanceof CharType && castType instanceof DoubleType) {
            write.println( "\tB2I" );
            write.println( "\tI2F" );
            write.flush();
        }

        if (type instanceof DoubleType && castType instanceof CharType) {
            write.println( "\tF2I" );
            write.println( "\tI2B" );
            write.flush();
        }
    }

    public void pop(String suffix) {
        write.println("\tPOP"+suffix);
        write.flush();
    }

    private int labels;

    public int generateLabels(int number){
        int actual = labels;
        labels += number;
        return actual;
    }

    public void writeLabel(int n) {
        write.println("Label" + n + ":");
        write.flush();
    }

    public void jz(int i) {
        write.println("\tJZ Label" + i);
        write.flush();
    }

    public void jnz(int i) {
        write.println("\tJNZ Label" + i);
        write.flush();
    }

    public void jmp(int i) {
        write.println("\tJMP Label" + i);
        write.flush();
    }

    public void printLine(int line){
        write.println("#line "+ line);
        write.flush();
    }

    public void printName(String name){
        write.println("\t' *"+ name + ": ");
        write.flush();
    }

    public void printFileName(String input){
        write.println("#source \"" + input + "\"");
        write.flush();
    }

    public void initialComment(){
        write.println("' * Invocation to the main function");
        write.flush();
    }

    public void commentIf() {
        write.println("\t' * if body");
        write.flush();
    }

    public void commentWhile() {
        write.println("\t' * while body");
        write.flush();
    }

    public void commentElse() {
        write.println("\t' * else body");
        write.flush();
    }

    public void header(int line, String name){
        lineBreak();
        printLine(line);
        printName(name);
    }
}
