package ast.type;

import ast.type.AbstractType;

public class ErrorType extends AbstractType {

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString(){
        return "Error in line " + getLine() + " and column " + getColumn() + ": " + getMessage();
    }
}