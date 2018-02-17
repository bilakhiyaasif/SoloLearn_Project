

/*
input: 
any number
enter num that is <=22(for proper output because of phone display size and all that)
    ^
   ^ ^
  ^ ^ ^
 ^ ^ ^ ^
^ ^ ^ ^ ^
 
*/ 
import java.util.Scanner;
public class Program {
    public static void fnc()
{  
              System.out.print("\n__________________________________________");
System.out.print("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    System.out.print("------------------------------------------");
    }
    
    static void p1(int n) {
      
        int t=(n-1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            
                if(j>=t)
                {
                    System.out.print("^ ");
                    
                }
                
                
                else
                {
                    System.out.print(" ");
                }
                
                
                
            }
            t--;
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        p1(n);
        fnc();
        in.close();
    }
    

    
    
    
}
