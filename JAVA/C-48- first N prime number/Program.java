//prime num upto n
/* 
input: 
any number
output:
print first N prime number
*/
import java.util.Scanner;
class Program
{
public static void developer_asif()
    {
     System.out.printf("__________________________________________");
System.out.printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    System.out.printf("------------------------------------------");//
    }
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
   int  x=2;
   int c=0;
   int t=0;
   int limit=sc.nextInt();
   System.out.println("First "+limit+" Prime Number:");
   while(t!=limit)
   {
   for(int i=2;i<x;i++)
   {
     if(x%i==0)
     {
       c++;
       break;
     }
   }
   if(c==0)
    {
    System.out.print((t+1)+"\t->:\t"+x+"\n");
    t++;
    }
    c=0;
    x++;
  }
  
  developer_asif();
 }
}
