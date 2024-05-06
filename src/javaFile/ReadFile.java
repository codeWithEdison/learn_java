package javaFile;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.File;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myfile = new File("hello.txt");
            if(myfile.createNewFile()){
                System.out.println("fille created succesfully" + myfile.getName());
            } else
            {
                System.out.println("file alredy exist");
            }
        } catch (IOException e){
            System.out.println("error in creating file");
            e.printStackTrace();
        }
    }
}
