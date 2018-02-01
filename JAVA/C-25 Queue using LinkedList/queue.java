
import java.util.LinkedList;

/**
 * 
 * @author Bilakhiya
 */
public class queue {

   LinkedList q;

    public queue() {
        q=new LinkedList();
    }
   public boolean isEmpty() 
   {
       return q.isEmpty();
   }
   public int size()
   {
       return (int)q.size();
   }
   public void enqueue(int a)
   {
       q.addLast(a);
       
   }
   public int dequeue()
   {
       return (int)q.remove(0);
   }
   public int peek()
   {
       return (int)q.get(0);
       
   }
   
    public static void main(String[] args) {
        // TODO code application logic here
   long s=System.currentTimeMillis();
        System.out.printf("\n__________________________________________\n");
        System.out.println("Queue With Java using LinkedList");
         System.out.printf("------------------------------------------\n");
        queue q1=new queue();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        
        System.out.println("First:"+q1.dequeue());
       System.out.println("Peek at Second:"+q1.peek());
       
        System.out.println("Second:"+q1.dequeue());
        System.out.println("Third:"+q1.dequeue());
        System.out.println("Fourth:"+q1.dequeue());
        System.out.println("Fifth:"+q1.dequeue());
                   System.out.printf("------------------------------------------\n");
       
    
         System.out.printf("\n__________________________________________");
System.out.printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    System.out.printf("------------------------------------------");
       
       
    System.out.println("\n\nRunning Time:"+((System.currentTimeMillis())-s)+" Ms");     
       
    }
    
}
