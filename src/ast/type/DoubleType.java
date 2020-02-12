package ast.type;

public class DoubleType extends AbstractType{

    public DoubleType() {
        super(0, 0);
    }

    //Singleton pattern
    private static DoubleType instance = new DoubleType();

    public static DoubleType getInstance(){
        return instance;
    }
}