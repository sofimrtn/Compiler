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
    public int numberOfBytes() {
        return 2;
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
    public Type comparison( Type type ) {
        if (type instanceof ErrorType || type instanceof IntType) {
            return type;
        }
        return null;
    }

    @Override
    public Type logic( Type type ) {
        if (type instanceof ErrorType || type instanceof IntType) {
            return type;
        }
        return null;
    }

    @Override
    public Type logic(){
        return this;
    }

    @Override
    public Type canBeCastTo(Type type){
        if(type instanceof ErrorType){
            return type;
        }
        if(type instanceof IntType || type instanceof DoubleType || type instanceof CharType){
            return this;
        }
        return null;
    }

    @Override
    public Type promotesTo(Type type){
        if (type instanceof ErrorType) {
            return type;
        }
        if(type instanceof IntType || type instanceof DoubleType ){
            return this;
        }
        return null;
    }

    @Override
    public boolean isBuiltInType(){
        return true;
    }

    @Override
    public String suffix(){
        return "i";
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
        IntType other = (IntType) obj;
        if (instance == null) {
            if (other.instance != null)
                return false;
        } else if (!instance.equals(other.instance))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "IntType";
    }

}