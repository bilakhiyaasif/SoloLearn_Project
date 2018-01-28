

import java.util.*;
import java.io.*;
class Program{
    public static void main(String []argh)
    { 
   
       

        Scanner sc = new Scanner(System.in);
        String s="";
        long x=0;
        try{
                s=sc.nextLine();//any any num to check
                x=Long.parseLong(s);
                System.out.println(x+" can be fitted in:"); 
                if(x>=-128 && x<=127)
                System.out.println("* byte");
                if(x>=-32768&&x<=32767)
                System.out.println("* short");
                if(x>=Math.pow(-2,31)&&x<=(Math.pow(2,31)-1))
                System.out.println("* int");
                if(x>=Math.pow(-2,63)&&x<=(Math.pow(2,63)-1))
                System.out.println("* long");
                 
                
     
            }
        catch(Exception e)
            {
                System.out.println(s+" can't be fitted anywhere.");
            }
                       System.out.printf("\n__________________________________________");
System.out.printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    System.out.printf("------------------------------------------");//

    }
}
