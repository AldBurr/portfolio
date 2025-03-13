package unit13.practicum;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class SumServer 
{
    private Socket client;
    private int port;
    public int sum;
    public SumServer(Socket client, int port) throws UnknownHostException, IOException
    {
        this.client = new Socket("localhost", port);
        this.port = port;
        sum = 0;
    }
    public int handle(SumClient clients) throws IOException
    {
        ServerSocket socket = new ServerSocket(port);
        client.getOutputStream();
        socket.accept();
        while(!clients.equals(0))
        {
            sum += client.getOutputStream();
        }
        socket.close();
        client.close();
        return sum;
    }
    public static void main(String[] args) throws IOException 
    {
        ServerSocket socket = new ServerSocket(1234);
        Socket sock = new Socket("localhost", 1234);
        SumServer server = new SumServer(sock, 1234);
        SumClient client = new SumClient(1234);
        socket.accept();
        server.handle(client);
        sock.getOutputStream();
        sock.close();
        socket.close();
    }
}
