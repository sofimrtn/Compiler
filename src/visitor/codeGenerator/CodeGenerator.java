package visitor.codeGenerator;


import ast.definition.VarDefinition;
import ast.expression.Arithmetic;
import ast.expression.Cast;
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
        write.println("OUT" + suffix);
        write.flush();
    }

    public void load(String suffix){
        write.println("LOAD" + suffix);
        write.flush();
    }

    public void store(String suffix){
        write.println("STORE" + suffix);
        write.flush();
    }

    public void in(String suffix){
        write.println("IN" + suffix);
        write.flush();
    }

    public void halt(){
        write.println("HALT");
        write.flush();
    }

    public void call(String function){
        write.println("CALL " + function);
        write.flush();
    }

    public void enter(int number){
        write.println("ENTER " + number);
        write.flush();
    }

    public void label(String name){
        write.println(name + ":");
        write.flush();
    }

    public void pusha(int offset) {
        write.println("PUSHA " + offset);
        write.flush();
    }

    public void pushBP() {
        write.println("PUSHA BP");
        write.flush();
    }

    public void push(int offset) {
        write.println("PUSHI " + offset);
        write.flush();
    }

    public void push( double value ) {
        write.println( "PUSHF " + value );
        write.flush();
    }

    public void push( char value ) {
        write.println( "PUSHB " + (int) value );
        write.flush();
    }

    public void add(String suffix) {
        write.println("ADD" + suffix);
        write.flush();
    }

    public void mul(String suffix) {
        write.println("MUL" + suffix);
        write.flush();
    }

    public void not() {
        write.println( "NOT" );
        write.flush();
    }

    public void ret(int type, int locals, int params){
        write.println("RET "+ type + ", "+locals+", "+params);
        write.flush();
    }

    public void declareVars(VarDefinition v){
        write.println("' * " + v.getType() + " " + v.getName() + " ( offset " + v.getOffset() + ")");
        write.flush();
    }

    public void commentParams(){
        write.println("' * PARAMETERS");
        write.flush();
    }

    public void commentLocalVars(){
        write.println("' * LOCAL VARIABLES");
        write.flush();
    }

    public void lineBreak() {
        write.println();
        write.flush();
    }

    public void arithmetic(Arithmetic arithmetic) {
        switch (arithmetic.getOperator()){
            case "+":
                write.println("ADD" + arithmetic.getType().suffix());
                write.flush();
                break;
            case "-":
                write.println("SUB" + arithmetic.getType().suffix());
                write.flush();
                break;
            case "*":
                write.println("MUL" + arithmetic.getType().suffix());
                write.flush();
                break;
            case "/":
                write.println("DIV" + arithmetic.getType().suffix());
                write.flush();
                break;
            case "%":
                write.println("MOD" + arithmetic.getType().suffix());
                write.flush();
                break;
        }
    }

    public void comparison(Comparison comparison) {
        switch (comparison.getOperator()){
            case ">":
                write.println("GT" + comparison.getType().suffix());
                write.flush();
                break;
            case "<":
                write.println("LT" + comparison.getType().suffix());
                write.flush();
                break;
            case ">=":
                write.println("GE" + comparison.getType().suffix());
                write.flush();
                break;
            case "<=":
                write.println("LE" + comparison.getType().suffix());
                write.flush();
                break;
            case "==":
                write.println("EQ" + comparison.getType().suffix());
                write.flush();
                break;
            case "!=":
                write.println("NE" + comparison.getType().suffix());
                write.flush();
                break;
        }
    }

    public void logical(LogicOperator logicOperator) {
        switch (logicOperator.getOperator()){
            case "&&":
                write.println("AND");
                write.flush();
                break;
            case "||":
                write.println("OR");
                write.flush();
                break;
        }
    }

    public void cast(Type type, Type castType) {
        if (type instanceof CharType && castType instanceof IntType) {
            write.println( "B2I" );
            write.flush();
        }

        if (type instanceof IntType && castType instanceof DoubleType) {
            write.println( "I2F" );
            write.flush();
        }

        if (type instanceof DoubleType && castType instanceof IntType) {
            write.println( "F2I" );
            write.flush();
        }

        if (type instanceof IntType && castType instanceof CharType) {
            write.println( "I2B" );
            write.flush();
        }

        if (type instanceof CharType && castType instanceof DoubleType) {
            write.println( "B2I" );
            write.println( "I2F" );
            write.flush();
        }

        if (type instanceof DoubleType && castType instanceof CharType) {
            write.println( "F2I" );
            write.println( "I2B" );
            write.flush();
        }
    }
}
