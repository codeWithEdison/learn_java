package javanetworking;
import java.util.*;
import java.io.*;
import java.net.*;

public class Client{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int N1=sc.nextInt();
        System.out.println("Enter Second Number:");
        int N2=sc.nextInt();
        try{
            Socket s=new Socket("localhost",7520);
            PrintStream ps=new PrintStream(s.getOutputStream());
            System.out.println("Sending Number 1:");
            ps.println(N1);
            System.out.println("Sending Number 2:");
            ps.println(N2);
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            int result=Integer.parseInt(br.readLine());
            System.out.println("Result:"+result);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
