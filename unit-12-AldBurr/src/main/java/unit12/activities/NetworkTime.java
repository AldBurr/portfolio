package unit12.activities;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NetworkTime 
{
    public static void main(String[] args) throws UnknownHostException, IOException 
    {
        Scanner scan = new Scanner(System.in);
        Socket sock = new Socket("time.nist.gov", 13);
        while(scan.hasNext())
        {
            String message = scan.next();
            System.err.println(message + " ");
        }
        scan.close();
        sock.close();
        System.out.println();
    }
}
