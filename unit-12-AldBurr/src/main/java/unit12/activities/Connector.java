package unit12.activities;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connector 
{
    public static void main(String[] args) throws UnknownHostException, IOException 
    {
        Socket sock = new Socket("www.google.com", 80);
        Socket sock2 = new Socket("www.npr.org", 443);
        Socket sock3 = new Socket("swc-123.rit.edu", 33075);
        sock.close();
        sock2.close();
        sock3.close();
    }
}
