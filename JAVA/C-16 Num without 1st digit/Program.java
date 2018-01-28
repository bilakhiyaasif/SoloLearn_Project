/**
 * 
 */


/* 
Sample input:

458

output:

Input: 458  
Without 1st Digit: 58


*/ 

 


import java.util.Scanner;

/**
 * @author Bilakhiya
 *
 */
public class d1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);    
     int n=sc.nextInt();;//your number
     int t=n;
     int rem=0;
     String s="";
     int f=0;
     int t1;
     
     while(t!=0)
     {
        t1=t;
        t1=t1/10;
        if(t1==0)
        {
        }
        else
        {
            rem=t%10;
            s=rem+s;    
        }
         t=t/10;
        
     }
     System.out.println("Input:\n"+n);
     System.out.println("Without 1st Digit:\n"+s);
     
     
      
     
     
     
      System.out.printf("\n__________________________________________");
System.out.printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    System.out.printf("------------------------------------------");
    //
//Thanks for view my code    //
    }

}
