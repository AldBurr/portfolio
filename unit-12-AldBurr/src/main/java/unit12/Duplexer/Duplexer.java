package unit12.Duplexer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Duplexer 
    {
    private Socket client;
    private Scanner in;
    private PrintWriter out;
    public Duplexer(Socket client) throws IOException
    {
        this.client = client;
        in = new Scanner(client.getInputStream());
        out = new PrintWriter(client.getOutputStream());
    }
    public void close() throws IOException
    {
        client.close();
        in.close();
        out.close();
    }
    public void send(String message)
    {
        out.println(message);
        out.flush();
    }
    public String read()
    {
        return in.nextLine();
    }
}
