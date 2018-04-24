/*
Input: 
a bcd e fghijk
Output:
abcdefghijk

Challenge Link:
https://www.sololearn.com/learn/4455/?ref=app
Asif Bilakhiya
*/
 

import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String data=sc.nextLine();
        String data1="";
        for(int i=0;i<data.length();i++)
        {
            if(!(data.charAt(i)==' '))
            {
                data1=data1+data.charAt(i);
            }
        }
        System.out.println(data1);
    }
}
