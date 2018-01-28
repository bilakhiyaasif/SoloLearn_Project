
 
/*
input any String as Number addition or multipli or div or minus 

ex:
 
a+b....ex:2+3
a*b....ex:2*3
a-b....ex:2-3
a/b....ex:2/3

Thanks to View My Code 
Like Please.....
 
*/  
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
public class Program {
/*
*. @Bilakhiya Asif
*/
    static int solve(String opr) {
    
        String a[]=opr.split("");
        int i=0;
        int j=0;
        int num1[];
        String aaa[]=new String[100];
        int flage=0;
        String x1="";
        String x2="";
        String plus="+";
        String mns="-";
        String sign="";
        
        
        for(i=0;i<a.length;i++) 
        {
            
            
            if(    (    !(a[i].equals(plus))    &&    !(a[i].equals(mns)) &&!(a[i].equals("*")) &&!(a[i].equals("/"))  )  && flage==0    )
            {
                x1=x1+a[i];
            }
            
            if(    (    !(a[i].equals(plus))    ||    !(a[i].equals(mns)) &&(a[i].equals("*")) &&(a[i].equals("/")) )  && flage==1    )
            {
                x2=x2+a[i];
            }
   if((a[i].equals("/"))||a[i].equals("*")||a[i].equals(plus) || a[i].equals(mns))
            {
                sign=a[i];
                flage=1;
            }  
        }
        int x=Integer.parseInt(x1);
        int y=Integer.parseInt(x2);
        int ans=0;
        //if(x>=0 && y<=9  )
        {
            if(sign.equals("+"))
            {
                ans=x+y;
            }
            if(sign.equals("-"))
            {
                ans=x-y;
            }
             if(sign.equals("*"))
            {
                ans=x*y;
            }
            if(sign.equals("/"))
            {
            try{
            
                ans=x/y;
                }
             catch(ArithmeticException e)
             {
             System.out.println("Divide by Zero is not possible.....");
                 e.printStackTrace();
             }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }  
        }
        
        }
        return ans;
        }
 
 
    public static void main(String[] args) {
         long s=System.currentTimeMillis();
        Scanner in = new Scanner(System.in);
        String opr = in.next();
       
        int result = solve(opr);
        System.out.print("Processing.....\n\n\t");
        System.out.println(opr+" : "+result);
        long e1=System.currentTimeMillis();
        System.out.println("\nRunning-Time:"+(e1-s)+"ms");
        in.close(); System.out.printf("\n__________________________________________");
System.out.printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    System.out.printf("------------------------------------------");
        
    }
}
