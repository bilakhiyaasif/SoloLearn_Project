
//like share comment
//thank you
//
   

import java.util.Scanner;
public class Program
{   
    public static void fnc()
{  
              System.out.print("\n__________________________________________");
System.out.print("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    System.out.print("------------------------------------------");
    
    
}
    public static void main(String[] args) {
         
         boolean b1=false;
        Scanner sc=new Scanner(System.in);
        int size=24;
    //   size=sc.nextInt();//any size that you like
        char x1='A';int t5=0;
        System.out.print("\nHappy New Year!!\n\n");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<i;j++)
            {
            
            if(i==j+1)
            {
          
            System.out.print("!");
            } 
            
            
            else if(j==0)
            {
        
            
                  System.out.print("| ");
            
            
            }
            
            else if(i==size-1)
            {
                  System.out.print("_ ");
            }
            else if(i==size-2)
            {
                System.out.print("- ");
            }
            else if(i==j*i)
            {
               System.out.print("! ") ;
               t5++;
            }
            else{
            
                 
                System.out.print(x1+":");
                 
                 if(x1>='Z')
                 {
                     x1='A';
                   //  b1=true;
                 } 
                 else
                 {
                 x1++;
                 }
                  
                  
             }
             
            }
            System.out.println();
        }
        
       fnc();

        
    }
    
}
