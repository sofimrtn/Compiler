package ast.type;

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


}