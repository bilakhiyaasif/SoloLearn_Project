
/*
sample input
5
1 2 3 4 5
 
output
5 4 3 2 1
*/
import java.io.*;
import java.util.*; 
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Program { 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();//length of array
        if(n>=1&&n<=1000)
        {
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
           // arr[arr_i] = in.nextInt();
           int t1=in.nextInt();
           if(t1>=1&&t1<=10000)
           {
               arr[arr_i]=t1;//element of array
           }
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        }
    }
}
