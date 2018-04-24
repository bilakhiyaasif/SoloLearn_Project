/*
Reverse Array Element without using any another Array.

©Asif Bilakhiya
please like,comment
*/

import java.util.Scanner;
public class Program{

  public static void main(String[] args) {
  
  /*
  for dynamic input use this
  Scanner sc=new Scanner(System.in);
  int N=sc.nextInt();
  int a[]=new int[N];
  for(int i=0;i<N;i++)
  {
      a[i]=sc.nextInt();
  }
  
  */
  
  
  int a[]={0,1,2,3,4,5,6,7,8};
  //comment this if you use dynamic input
  System.out.println("before Reverse: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }      
        
        
        int x=0;
        
        x=a.length-1;
        int t=0;
        for(int i=0;i<a.length/2;i++)
        {
        t=a[i];
        a[i]=a[x];
        a[x]=t;
        x--;
        }
        System.out.println("\n\nAfter Reverse: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
   
  }
}
