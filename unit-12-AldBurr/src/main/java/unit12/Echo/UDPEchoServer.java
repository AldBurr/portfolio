package unit12.Echo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPEchoServer 
{
    public static void main(String[] args) throws IOException 
    {
        DatagramSocket sock = new DatagramSocket(54321);
        byte[] buffer = new byte[1024];
        DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);

        sock.receive(incoming);
        String message = new String(incoming.getData(), 0, incoming.getLength());
        System.out.println(message);

        sock.close();
        
    }
}
