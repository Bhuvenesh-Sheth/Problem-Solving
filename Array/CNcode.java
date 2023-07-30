import java.util.*;
import java.net.*;

public class CNcode
{
    public static void main(String[] args)
    {
        String host=new String();
        String ip=new String();
        Scanner ch=new Scanner(System.in);
        System.out.println("\n 1.Host to IP: \n 2.IP to Host:");
        System.out.println("\n Enter the choice");
        int choice=ch.nextInt();
        if(choice==1)
        {
            try
            {
                System.out.println("\nEnter the host");
                host=ch.next();
                InetAddress address=InetAddress.getByName(host);
                System.out.println("Host Name" +address.getHostName());
                System.out.println("IP:" +address.getHostAddress());
                System.out.println("Host and IP address" +address.toString());
               
            }
            catch(UnknownHostException e)
            {
                System.out.println("Unknown Host");
            }
        }
        else
        {
            try
            {
                System.out.println("\nEnter the IP Address");
                ip=ch.next();
                InetAddress address=InetAddress.getByName(ip);
                System.out.println("Host Name" +address.getHostName());
                System.out.println("IP:" +address.getHostAddress());
                System.out.println("Host and IP address" +address.toString());
               
            }
            catch(UnknownHostException e)
            {
               System.out.println("Unknown Host");
            }
        }
        ch.close();
    }
}