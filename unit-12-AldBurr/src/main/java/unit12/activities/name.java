package unit12.activities;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class name 
{
    public static void main(String[] args) throws UnknownHostException, IOException 
    {
        Socket sock = new Socket("129.21.102.213", 12345);
        OutputStream out = sock.getOutputStream();
        PrintWriter printer = new PrintWriter(out);
        printer.println("Alden");
        printer.flush();
        sock.close();
    }
}
