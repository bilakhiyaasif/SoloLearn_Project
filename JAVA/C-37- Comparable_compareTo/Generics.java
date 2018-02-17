/**
 * 
 */
//package com.ex1;

/**
 * @author Bilakhiya
 *
 */
  
 /*
 All About Comparable interface and its compareTo methods in java.
 Thank you for check my code
 
 */
public class Generics implements Comparable {

    /**
     * @param args
     */
    int a=0;
      public static <T extends Comparable <T>> T findMax(T a,T b)
      {
        int n=a.compareTo(b);
        if(n<0)
        {
          return b;
        }
        else
        {
          return a;
        }
      }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(findMax(4,5));
        System.out.println(findMax(5,5));
        System.out.println(findMax(5,5));
        System.out.println(findMax(4.0,5.0));
        //System.out.println(findMax(4,5.009));
        System.out.println(findMax(4.19898,5.9));
        System.out.println(findMax('a','b'));
        System.out.println(findMax('b','a'));
        System.out.println(findMax("hello","ok"));
        Generics l1=new Generics();
        Generics l2=new Generics();
        l1.a=5;
        l2.a=10;
        System.out.println("for_object:"+findMax(l1.a,l2.a));
fnc();
    }
    @Override
    public int compareTo(Object arg0) {
        // TODO Auto-generated method stub
        
        return 0;
    }
        public static void fnc()
{
            System.out.print("\n__________________________________________");
System.out.print("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    System.out.print("------------------------------------------");
    
    
}

}
