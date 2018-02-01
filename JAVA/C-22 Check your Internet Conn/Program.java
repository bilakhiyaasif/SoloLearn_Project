import java.util.*;
import java.net.*;
import java.io.*;
public class Program
{
    public static void main(String[] args)throws Exception {
        
         
        
         
    String url1="http://www.bing.com/"; 
    try
    {
        
    URL u1=new URL(url1);  
    URLConnection cn=u1.openConnection();
    System.out.println("Internet Availability:");
    cn.connect();
    
    
    System.out.println("__________________________________________");  
    System.out.println("------------------------------------------");
     System.out.println("Welcome.....");
    System.out.println("You are Connected To Internet.....");
    System.out.println("------------------------------------------");
    
    }
    catch(Exception e)
    {
         System.out.println("Sorry.....\nYou are offline!");
       System.out.println("You are Not Connected To Internet.....");
        System.out.println("Please Enable your Network Switch.....");
    }
    //System.out.println("__________________________________________");
    
    
       //thank you for view my code
       
       
       
           System.out.printf("\n__________________________________________");
System.out.printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    System.out.printf("------------------------------------------");
   
    
    }
}
