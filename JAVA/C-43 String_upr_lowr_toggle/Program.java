import java.util.Scanner;
/*
input:Any String
out:
upper char converted to lower
lower char converted to upper
toggle
*/
public class Program
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String data=sc.nextLine();
         System.out.println("Original String:\t\t"+data);
        
        String out="";
        String temp="";
        for(int i=0;i<data.length();i++)
        {
            if(data.charAt(i)>='a'&&data.charAt(i)<='z')
            {
                temp=data.charAt(i)+"";
                out+=temp.toUpperCase();
                
            }
            else if(data.charAt(i)>='A'&&data.charAt(i)<='Z')
            {
                temp=data.charAt(i)+"";
                out+=temp.toLowerCase();
                
            }
            else
            {
                out+=data.charAt(i);
            }
        }
        System.out.println("Toggle String is:\t\t"+out);
    }
}
