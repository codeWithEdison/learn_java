package javanetworking;
import java.io.*;
import java.net.*;

public class Server{
    public static void main(String args[]){
        try{
            ServerSocket ss=new ServerSocket(7520);
            System.out.println("Server Stated!");
            Socket soc=ss.accept();
            BufferedReader b=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int a=Integer.parseInt(b.readLine());
            int bb=Integer.parseInt(b.readLine());
            PrintStream p=new PrintStream(soc.getOutputStream());
            int c;
            if(a<20 && bb<20){
                c=a+bb;
                p.println(c);
            }
            else{
                c=a*bb;
                p.println(c);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}