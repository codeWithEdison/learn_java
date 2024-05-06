package javaFile;
import java.io.File; // import file class
import java.io.IOException;

public class FileDemo {
     public static void main(String[] args) {
        try {
            File myfile =  new File("hello.txt");
            if(myfile.createNewFile()){
                System.out.println("file created sucessfull" + myfile.getName());
            } else {
                System.out.println("file alredy exist!");
            }
        } catch (IOException e){
            System.out.println("an error accured in ");
            e.printStackTrace();
        }
    }
}
