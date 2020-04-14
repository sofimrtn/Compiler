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
    public int getSize() {
        return 4;
    }

    @Override
    public Type arithmetic(Type type){
        if(type instanceof ErrorType){
            return type;
        }
        if(type instanceof DoubleType){
            return this;
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
    public Type comparison(Type type){
        if (type instanceof ErrorType || type instanceof DoubleType) {
            return type;
        }
        return null;
    }

    @Override
    public Type canBeCastTo(Type type){
        if(type instanceof ErrorType){
            return type;
        }
        if(type instanceof CharType || type instanceof IntType || type instanceof DoubleType){
            return this;
        }
        return null;
    }

    @Override
    public Type promotesTo(Type type){
        if (type instanceof ErrorType || type instanceof DoubleType) {
            return type;
        }
        return null;
    }

    @Override
    public <T, P> T accept(Visitor<T, P> visitor, P param) {
        return visitor.visit(this,param);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DoubleType other = (DoubleType) obj;
        if (instance == null) {
            if (other.instance != null)
                return false;
        } else if (!instance.equals(other.instance))
            return false;
        return true;
    }
}