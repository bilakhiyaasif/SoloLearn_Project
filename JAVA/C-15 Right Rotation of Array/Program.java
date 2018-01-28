
 
import java.util.*;
import java.text.*;
 
public class Program {
    public static int[] rightrotate(int a[],int n,int k,int co)
    {
        int X[]=new int[n];
        int t=a[(a.length-1)];
        for(int i=a.length-1;i>0;i--)
        {
            X[i]=a[i-1];     
        }    
        X[0]=t; 
         System.out.println("-------------------");   
        System.out.println("Right Rotation-"+co+":");
        for(int i=0;i<n;i++)
        {
        System.out.print(X[i]+" ");
        }
         System.out.print("\n");   
        System.out.println("-------------------");   
        return X;
    }
    static long f1(long s,long e)
    {
        return e-s;
    }
    public static void main(String[] args) 
    {
    
   // start here
        long start=System.currentTimeMillis();
        Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
       // int d=sc.nextInt();
        int n=5;//num of array element
        int d=5;//right rotate array to d time
        int A[]=new int[n];//array declaration
        int B[]=new int[n];//array declaration
       // int y=0;
       // if(n>=1&&n<=Math.pow(10.0, 5.0)&&d>=1&&d<=n)
        {
       // for(int i=0;i<n;i++)
        {
          //  y=sc.nextInt();
          //  if(y>=1&&y<=Math.pow(10.0, 6.0))
            {
                //A[i]=y;
                A[0]=1;
                A[1]=2;
                A[2]=3;
                A[3]=4;
                A[4]=5;
            }
          //  else
            {
                
            }
        }
        System.out.println("-------------------");    
        System.out.println("Array Size:"+n);
        System.out.println("Right Rotation:"+d);
        System.out.println("Initial Array Data:");
        int co=0;
         for(int j=0;j<n;j++)
        {
            System.out.print(A[j]+" ");
        }
         System.out.println("\n-------------------");   
        for(int i=1;i<=d;i++)
        {
        co++;    
        B=rightrotate(A,n,d,co);
        A=B;
        }
       // System.out.println(Math.pow(10, 6));
        for(int j=0;j<n;j++)
        {
           // System.out.print(B[j]+" ");
        }
        }
        long end=System.currentTimeMillis();
      
     
   
   
   //end here
   
   
     
        System.out.println("\nRunning-Time:"+f1(start,end)+" Milisecond");
        
        System.out.print("\n@thanks to view my code\nit is dynamic also but for testing i have comment that part and use static version for understanding and clearity");
        
        System.out.printf("\n__________________________________________");
System.out.printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    System.out.printf("------------------------------------------");
    }
}
//thanks for view my code//
//it is dynamic also but for testing i have comment that part and use static version for understanding and clearity


