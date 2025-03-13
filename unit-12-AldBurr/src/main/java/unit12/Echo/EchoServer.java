package unit12.Echo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer 
{
    public static void main(String[] args) throws IOException 
    {
        ServerSocket server = new ServerSocket(54321);
        Socket sock = server.accept();
        Scanner in = new Scanner(sock.getInputStream());
        in.close();
        server.close();
        sock.close();
    }
}
