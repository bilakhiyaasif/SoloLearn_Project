 

/*
sample input
25
output
5
*/ 

public class Program
{
    public static void main(String[] args) {
        
        
        int n=64;//your num

        int j=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if((i*i)==n)
            {
                System.out.println("square root of "+n+" is :"+i);
            }
            
             
        }
        }
        
    }
}
