import java.util.Scanner;

 
public class Program
{
      
    
        public static long fact(long num) {
        
            if (num == 1) {
                return 1;
            } 
            return num * fact(num - 1);
        }
        public static void main(String[] args)
        { 
            Scanner sc=new Scanner(System.in);
            try{
            long f=sc.nextLong();
            //enter your num here
            System.out.println("Factorial of "+f+":"+fact(f));
          } 
          catch(NumberFormatException ne)  
          {
              System.out.println("Enter Number Please.....");
          }
          catch(Exception e) 
            {
                System.out.println("Enter valid number as input.....");
            }
            
            
            
            
            
            
            
            
            
        System.out.printf("\n__________________________________________");
System.out.printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    System.out.printf("------------------------------------------");
    
        }
    
    
}
