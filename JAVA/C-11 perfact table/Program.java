import java.io.*;
import java.util.*;
public class Program {
    public static void main(String[] args) throws Exception
    {
       int N;
       Scanner sc=new Scanner(System.in);
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       //br.readLine();
       N=Integer.parseInt(br.readLine());
       int i=0;
       int result=0;
      // System.out.println(N);
      if(N>=2&&N<=20)  
      {
          for(i=1;i<=10;i++)
          {
            result=N*i;
            System.out.println(N+"\tx\t"+i+"\t=\t"+result);            
          }
      }
      else
      {
          System.out.println("1 to 20 only");
      }          
      
      
    } 
}
