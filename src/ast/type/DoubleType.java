package ast.type;

import visitor.Visitor;

public class DoubleType extends AbstractType{

    public DoubleType() {
        super(0, 0);
    }

    //Singleton pattern
    private static DoubleType instance = new DoubleType();

    public static DoubleType getInstance(){
        return instance;
    }

    @Override
    public Type arithmetic(Type type){
        if(type instanceof ErrorType || type instanceof DoubleType){
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