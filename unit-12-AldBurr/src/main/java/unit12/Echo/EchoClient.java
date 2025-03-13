package unit12.Echo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient 
{
    public static void main(String[] args) throws UnknownHostException, IOException 
    {  
        Socket sock = new Socket("localhost", 54321);
        PrintWriter printer = new PrintWriter(sock.getOutputStream());

        String message = "Is anybody";
        System.out.println("Sending" + message);
        printer.println(message);
        printer.flush();
        sock.close();
        printer.close();
    }
}
