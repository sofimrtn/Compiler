package ast.type;

public class IntType extends AbstractType{

    private IntType() {
        super(0,0);
    }

    //Singleton pattern
    private static IntType instance = new IntType();

    public static IntType getInstance(){
        return instance;
    }


}