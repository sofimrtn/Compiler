package ast.type;

import visitor.Visitor;

public class IntType extends AbstractType{

    public IntType() {
        super(0,0);
    }

    //Singleton pattern
    private static IntType instance;

    public static IntType getInstance(){
        if (instance == null)
            instance = new IntType();
        return instance;
    }

    @Override
    public boolean isLogical(){
        return true;
    }

    @Override
    public Type arithmetic(Type type){
        if(type instanceof ErrorType || type instanceof IntType){
            return type;
        }
        return null;
    }

    @Override
    public Type arithmetic(){
        return this;
    }

    @Override
    public boolean isBuiltInType(){
        return true;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }

}