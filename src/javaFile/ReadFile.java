package javaFile;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myfile = new File("hello.txt");
            Scanner myReader =  new Scanner(myfile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (FileNotFoundException e){
            System.out.println("error accurred");
            e.printStackTrace();
        }
    }
}
