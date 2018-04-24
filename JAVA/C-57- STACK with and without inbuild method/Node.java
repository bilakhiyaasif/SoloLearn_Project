/*
STACK data structure
-All Method
-oop based
-dynamic approach
-easily understand
-stack with inbuilt interface method
-stack without inbuilt method

@Asif Bilakhiya
please Like,Comment
*/



//stack using user defined class and method
import java.util.Stack;
public class Node
{
   Node top,next;
   int data;
   public Node()
   {
       
   }
   public Node(int data)  
   {
       this.data=data;
   }
   
   public void push(int data)
   {
     Node n1=new Node(data);
     n1.next=top;
     top=n1;
     
   }
   public int peek()
   {
       return top.data;
   }
   public int pop()
   {
   if(top==null)
   {
       return -1;
   }
      int data=top.data;
      top=top.next;
      return data;
   }
   public boolean isempty()
   {
       return top==null;
   }
public static void main(String args[])
{
Node n1=new Node();
int i=1;

System.out.println("--------------------------------------");
    System.out.println("stack data structure using dynamic approach with class and object & user defined method\n");

System.out.println("Stack is empty: "+n1.isempty()+"\n");
//return true if stack is empty


while(i<=10)
{
  n1.push(i);//insert data into stack in LIFO manner
  i++; 
  System.out.println("Stack push: "+n1.peek());
}


System.out.println("\nStack peek opr: "+n1.peek());
//return the top element from stack

System.out.println("Stack is empty: "+n1.isempty()+"\n");
//return true if stack is empty

int data=0;
while((data=n1.pop())!=-1)
{
    System.out.println("Stack pop: "+data);
}

System.out.println("Stack is empty: "+n1.isempty()+"\n");
//return true if stack is empty


System.out.println("--------------------------------------\n\n");



//stack using inbuilt java library

System.out.println("--------------------------------------");
    System.out.println("stack data structure using java inbuilt interface method");
        Stack s1=new Stack();
        System.out.println("is stack empty: "+s1.isEmpty());
     //  System.out.println(s1);
        i=0;
        while(i<=10)
        {
        s1.push(i);
        System.out.println("stack push: "+i);
        System.out.println(s1+"\n");
        i++; 
        }
        System.out.println("\nis stack empty: "+s1.isEmpty());
        System.out.println("\nTop of stack is: "+s1.peek());
        
        
        while(!(s1.isEmpty()))
        {
            System.out.println("Stack pop: "+s1.pop());
            System.out.println(s1+"\n");
        }
        
        System.out.println("is stack empty: "+s1.isEmpty());
        System.out.println("--------------------------------------");

System.out.println("\n\n\t\t\t\t\tThank you!!\n\t\t\t\t\tAsif Bilakhiya");

}
}
