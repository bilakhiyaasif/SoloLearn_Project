
/*
enter any number
*/



import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long ans=(n*(n+1)/2);
        System.out.println("1.Sum of the natural numbers from 1 to "+n+"\n:"+ans);
        
        ans= ((n)*(n+1)*(2*n+1))/6;
        System.out.println("2.Sum of the square of the first "+n+" natural numbers\n:"+ans);
        
        
    
    }
}
