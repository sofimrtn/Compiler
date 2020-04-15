package ast.type;

import ast.errorHandler.ErrorHandler;
import ast.main.ASTNode;
import ast.type.AbstractType;
import visitor.Visitor;

public class ErrorType extends AbstractType {

    private String message;
    private ASTNode node;

    public ErrorType(ASTNode node, String message){
        super(node.getLine(), node.getColumn());
        this.node=node;
        this.message=message;
        ErrorHandler.getInstance().addError(this);
    }

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message=message;
        ErrorHandler.getInstance().addError(this);
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

    public ASTNode getNode() {
        return node;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }
}