package unit12.Echo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoClient 
{
    public static void main(String[] args) throws IOException 
    { 
        DatagramSocket sock = new DatagramSocket();
        String message = "One more time";
        DatagramPacket outgoing = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getByName("localhost"), 54321);
        System.out.println("Sedning " + message);
        sock.send(outgoing);
        byte[] buffer = new byte[1024];
        DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
        sock.receive(incoming);
        sock.close();
    }
}
