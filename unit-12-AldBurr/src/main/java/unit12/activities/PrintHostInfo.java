package unit12.activities;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PrintHostInfo 
{
    public static void main(String[] args) throws UnknownHostException 
    {    
        InetAddress host = InetAddress.getLocalHost();
        String hostName = host.getHostName();
        String address = host.getHostAddress();
        System.out.println(hostName);
        System.out.println(address);
    }
}
