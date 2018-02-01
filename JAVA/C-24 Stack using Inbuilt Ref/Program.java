//stack using java inbuilt library and reference
//thanks for view this code
//please like
import java.util.Stack;
public class Program
{ 
    public static void main(String[] args) {
     
     long s=System.currentTimeMillis();
       
         Stack<String> stack=new Stack<>();
       
   
         System.out.printf("\n_________________________________________________\n");
         System.out.println("Stack using Inbuilt Ref");
         System.out.printf("-------------------------------------------------\n");
              //push
        stack.push("1->hello");
        stack.push("2->hi");
        System.out.println("Size of stack:" + stack.size());
        System.out.println("peek at stack:" + stack.peek());
        //pop
        System.out.println("pop on stack:" + stack.pop());
        System.out.println("peek at stack:" + stack.peek());
        System.out.println("Size of stack:" + stack.size());
        System.out.println("pop on stack:" + stack.pop());
        System.out.println("Size of stack:" + stack.size());
        System.out.printf("-------------------------------------------------\n");
        
        
        
         System.out.printf("\n__________________________________________");
System.out.printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
            System.out.printf("------------------------------------------\n");
        
         
    System.out.println("\n\nRunning Time:"+((System.currentTimeMillis())-s)+" Ms");     
    }
}
