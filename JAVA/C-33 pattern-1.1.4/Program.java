
import java.util.Scanner;
/*
pattern:
 

# enter any integer value;


****
***
**
*

*/


public class Program {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        //int k=sc.nextInt();
        int t=0;
        int j=2;
        for(int i=1;i<n;i++)
        {
            t=j;
            for(;j<=n;)
            {
                System.out.print("*");
                j++;
            }
            j=t+1;
            System.out.print("\n");
        }

    }

}
