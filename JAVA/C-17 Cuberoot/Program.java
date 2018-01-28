 

/*
sample input
27
output
3 
*/

public class Program
{
    public static void main(String[] args) {
        
        
        int n=125;

        int j=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if((i*i*i)==n)
            {
                System.out.println("cuberoot of "+n+" is :"+i);
            }
            
            
        }
        }
        
    }
}
