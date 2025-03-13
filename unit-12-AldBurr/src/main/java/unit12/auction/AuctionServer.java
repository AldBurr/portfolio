package unit12.auction;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class AuctionServer 
{
    public int port;
    public int bidPeriod;
    Socket sock;
    public AuctionServer(int port, int bidPeriod) throws UnknownHostException, IOException
    {
        this.port = port;
        this.bidPeriod = bidPeriod;
        sock = new Socket("localhost", port);
    }
    public void startTimer() throws InterruptedException, IOException
    {
        Thread.sleep(bidPeriod * 1000);
        sock.close();
        sock.getInputStream();
        handleClient(null);
    }
    public void handleClient(String clientName)
    {
        
    }
    public static void main(String[] args) {
        
    }
}
