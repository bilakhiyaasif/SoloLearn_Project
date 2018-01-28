
//package linklist;
  
import java.util.LinkedList; 
 class Node {
    Node next;
    int data;
    
    //Methods
    
    //Constructor
    
    public Node(int NewData)
    {
      data=NewData;
      next=null;
    }
    public Node(int newData,Node NewNext)
    {
        data=newData;
        next=NewNext;
        
    }
    
    //getters and setters
    
  public int getData()
  {
      return data;
  }
  public Node getNext()
  {
      return next;
      
  }
  public void setData(int newData)
  {
      data=newData;
  }
  public void setNext(Node newNode)
  {
      next=newNode;
  }
 
}

public class Linklist {
   Node head;
   int count;
   public Linklist()
   {
       head=null;
       count=0;
   }
   public Linklist(Node newNode)
   {
       head=newNode;
       count=1;
   }
   
   //constructor
   //methods
   //add
   public void add(int newData)
   {
       Node temp=new Node(newData);
       Node current=head;
       while(current.getNext()!=null)
       {
           current=current.getNext();
       }
       current.setNext(temp);
       count++;
       
   }
   public int get(int index)
   {
       if(index<=0)
       {
           return -1;
       }
       Node current=head;
       for(int i=1;i<index;i++)
       {
            
           current=current.getNext();
           System.out.print(current.getData()+" ");
        //   return current.getData();
       
       }
       return current.getData();
   }
   //get
   
   //size
   public int size()
   {
       return count;
   }
   //isemty
   public boolean isempty()
   {
       return head==null;
   }
   //remove
   public void remove()
   {
       Node current=head;
       while(current.getNext().getNext()!=null)
       {
           current=current.getNext();
       }
       current.setNext(null);
       count--;
       
   }
    public static void main(String[] args) {
    
       Node n1=new Node(5);
       Linklist l3=new Linklist(n1);
      
       
       l3.add(3);
       l3.add(90);
       l3.add(100);
       System.out.println("Dynamic singly LinkedList\n\n");
       System.out.println("Size of LinkedList: "+l3.size());
       System.out.println("LinkedList IsEmpty: "+l3.isempty());
       System.out.println("LinkedList Data:");
       
       System.out.println(l3.get(4));
               
       
       //thank you for view my code
       
       
       
           System.out.printf("\n__________________________________________");
System.out.printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    System.out.printf("------------------------------------------");
       
       
       
    }
    
}
