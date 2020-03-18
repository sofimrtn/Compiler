package ast.errorHandler;

import ast.type.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    //singleton
    private static ErrorHandler instance = new ErrorHandler();

    private List<ErrorType> errors = new ArrayList<ErrorType>();

    public static ErrorHandler getInstance(){
        return instance;
    }

    public boolean hasErrors(){
        return !errors.isEmpty(); //if the error list is not empty.
    }

    public void showErrors(PrintStream stream){
        for(ErrorType e:errors){
            stream.println(e.toString());
        }
    }

    public void addError(ErrorType error){
        this.errors.add(error);
    }

}
