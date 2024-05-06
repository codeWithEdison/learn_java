package javaFile;
import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
       File myfile = new File("hello.txt");
       if(myfile.delete()){
           System.out.println("file deleted sucessfully  " +myfile.getName() );
       } else {
           System.out.println(" fail to delete file ");
       }
    }
}
