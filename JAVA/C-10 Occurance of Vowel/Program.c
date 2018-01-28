import java.io.*;
import java.util.*;
 
public class Program {
public static void main(String args[]) throws Exception
{
    int a=0,e=0,i=0,o=0,u=0;
    String S="";
    Scanner sc=new Scanner(System.in);
    S=sc.nextLine();
    System.out.println("String:\t"+S);
    for(int i1=0;i1<S.length();i1++)
    { 
     
        switch(S.charAt(i1)) 
        {
        case 'a':
            a++;
            break;
        case 'e': 
            e++;
            break; 
        case 'i':
            i++;
            break;
        case 'o':
            o++;
            break;
        case 'u':
            u++;
            break;
            
        case 'A':
            a++;
            break;
        case 'E':
            e++;
            break;
        case 'I':
            i++;
            break;
        case 'O':
            o++;
            break;
        case 'U':
            u++;
            break;
            
        }
        
    }
    System.out.println("\tNum of (A+a):"+a+"\n\tNum of (E+e):"+e+"\n\tNum of (I+i):"+i+"\n\tNum of (O+o):"+o+"\n\tNum of (U+u):"+u);
    
           System.out.printf("\n__________________________________________");
System.out.printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    System.out.printf("------------------------------------------");
    
}
}
