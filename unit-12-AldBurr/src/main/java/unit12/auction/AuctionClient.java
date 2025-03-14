package unit12.auction;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import unit12.Duplexer.Duplexer;

public class AuctionClient implements AuctionProtocol {
    private Duplexer duplexer;
    private Scanner userIn;
    private boolean auctionEnd;

    public AuctionClient(Socket socket) throws IOException {
        this.duplexer = new Duplexer(socket);
        this.userIn = new Scanner(System.in);
        auctionEnd = false;
        task();
    }

    public void task() throws IOException {
        System.out.println("Enter your name: ");
        String name = userIn.nextLine();
        duplexer.send(name);
        System.out.println(duplexer.read());

        while (!auctionEnd) {
            System.out.println("Enter your bid:");
            try {
                int bid = Integer.parseInt(userIn.nextLine());
                duplexer.send(BID + ":" + bid);
                String msg = duplexer.read();
                System.out.println(msg);
                if (msg.startsWith(END)) {
                    auctionEnd = true;
                }
            } catch (NumberFormatException ime) {
                // System.out.println("Ignore");
            }

        }
        duplexer.close();
    }

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 54322);
        new AuctionClient(socket);
    }
}
