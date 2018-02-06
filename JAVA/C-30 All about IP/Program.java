//package com.ex1;
import java.net.*;
public class Program {



    public static void main(String[] args) throws UnknownHostException {

        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("------------------------------------------");

        System.out.println("All about IP:");
        System.out.println("------------------------------------------");
        System.out.println("Host Address:\n" + ip);

        System.out.println("Name:\n" + ip.getHostName());
        System.out.println("IP-Address:" + ip.getHostAddress());


        ip = InetAddress.getByName("www.google.com");
        System.out.println("------------------------------------------");
        System.out.println("Google:\n" + ip);
        System.out.println("Name:\n" + ip.getHostName());
        System.out.println("IP-Address:\n" + ip.getHostAddress());
        System.out.println("------------------------------------------");
        InetAddress ip1[] = InetAddress.getAllByName("www.yahoo.com");
        System.out.println("------------------------------------------");
        System.out.println("Yahoo all IP Address:");
        for (int i = 0; i < ip1.length; i++) {
            System.out.println(ip1[i]);
        }
        System.out.println("------------------------------------------");

        ip = InetAddress.getByName("www.bing.com");

        System.out.println("------------------------------------------");
        System.out.println("Name:" + ip.getHostName());
        System.out.println("IP-Address:" + ip.getHostAddress());
        System.out.println("------------------------------------------");

        fun();


    }







    public static void fun() {
        System.out.printf("\n__________________________________________");
        System.out.printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
        System.out.printf("------------------------------------------");
        //
        //Thanks for view my code    //
    }



}
