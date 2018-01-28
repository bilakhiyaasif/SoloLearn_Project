
/*
All about 
URL
URLConnection
_       its method and all its interface in one                          _       program
_       please like share comment if you like 
_       thank you 
_       Asif Bilakhiya 
        
*/   
 
import java.net.*;
import java.util.*;
import java.io.*; 
      
     
class Program  
{
public static void main(String args[])throws Exception
{     

//Thanks for view my code
      
    //url1==any url that you like
    String url1="http://www.bing.com/"; 
         
    URL u1=new URL(url1);    
       System.out.println("__________________________________________");  
     System.out.println("------------------------------------------");
    System.out.println("URL-Detail:");
    System.out.println("------------------------------------------");
     System.out.println("1.Protocol:"+u1.getProtocol());
    System.out.println("2.Port:"+u1.getPort());
    System.out.println("3.Host:"+u1.getHost());
    System.out.println("4.File:"+u1.getFile());
    System.out.println("5.Ext:"+u1.toExternalForm());
    //System.out.println("__________________________________________");
    
    
    
    URLConnection cn=u1.openConnection();
    
    

    //get date
    long d=cn.getDate();
    if(d==0)
    {
        System.out.println("6.No Date Information");
    }
    else
    {
        System.out.println("6.Date:"+new Date(d));
    }
    
    
    
    
    
    
    
    //get Content type
    
    System.out.println("7.Content-type:"+cn.getContentType());
    
    
    
    //get expiration date
     
    d=cn.getExpiration();
    if(d==0)
    {
        System.out.println("8.No Expiration information");
    }
    else
    {
        System.out.println("8.Expiration Date:"+new Date(d));
    }
     
    
    
    //get last-modified date
    
    d=cn.getLastModified();
    if(d==0)
    {
        System.out.println("9.No Modified Date information");
    }
    else
    {
        System.out.println("9.Modified on:"+new Date(d));
    }
    
    
    
    
    //get content length
    
    int l=cn.getContentLength();
    if(l==-1)
    {
        System.out.println("10.Content Length unAvailable");
    }
    else
    {
        System.out.println("10.Content Length:"+l);
    }    
        System.out.println("__________________________________________");
    
     
    System.out.println("__________________________________________");
    System.out.println("------------------------------------------");
    System.out.println("URL-Content:");
    System.out.println("------------------------------------------");
    //get content
    if(l!=0)
    {
        InputStream input=cn.getInputStream();
        int i=l;
        int c;
        int t=0;
        while((c=input.read())!=-1)
        {
            System.out.print((char)c);
            t++;
            if(t==500)
            {
            System.out.println("..............continue");
                break;
            }
        }
    }
    
    System.out.println("\n________________________________________");
    
          System.out.printf("\n__________________________________________");
System.out.printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
    System.out.printf("------------------------------------------");
    //
//Thanks for view my code    //
}
}
