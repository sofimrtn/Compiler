package visitor.codeGenerator;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter write;

    public CodeGenerator(String output) {
        try{
            this.write = new PrintWriter(new File(output));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void out(String suffix){
        write.println("OUT" + suffix);
        write.flush();
    }

    public void load(String suffix){
        write.println("LOAD" + suffix);
        write.flush();
    }

    public void store(String suffix){
        write.println("STORE" + suffix);
        write.flush();
    }

    public void in(String suffix){
        write.println("IN" + suffix);
        write.flush();
    }

    public void halt(){
        write.println("HALT");
        write.flush();
    }

    public void call(String function){
        write.println("CALL" + function);
        write.flush();
    }

    public void enter(int number){
        write.println("ENTER " + number);
        write.flush();
    }

    public void label(String name){
        write.println("{" + name + "}:");
        write.flush();
    }
}
