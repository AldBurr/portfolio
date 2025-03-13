package unit13.practicum;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * A helper class that makes sending and receiving text-based messages using
 * TCP/IP easier.
 * 
 * @author GCCIS Faculty
 */
public class Duplexer {
    private Socket socket;
    private Scanner scanner;
    private PrintWriter writer;
    private boolean debug;

    /**
     * Makes a new duplexer with the specified socket. Debugging is disabled by
     * default.
     * 
     * @param socket The socket that the duplexer will use to communicate over
     * a TCP/IP connection.
     * 
     * @throws IOException If there is a problem configuring the duplexer.
     */
    public Duplexer(Socket socket) throws IOException {
        this(socket, false);
    }

    /**
     * Makes a new duplexer with the specified socket and debug setting. If 
     * debug is enabled, every message sent or received will be logged.
     * 
     * @param socket The socket that the duplexer will use to communicate over
     * a TCP/IP connection.
     * @param debug Determines whether or not debugging is enabled.
     * 
     * @throws IOException If there is a problem configuring the duplexer.
     */
    public Duplexer(Socket socket, boolean debug) throws IOException {
        this.socket = socket;
        scanner = new Scanner(socket.getInputStream());
        writer = new PrintWriter(socket.getOutputStream());
        this.debug = debug;
    }

    /**
     * Sets the debug setting to the specified value; if true, all messages 
     * that are sent or received will be logged.
     * 
     * @param debug The debug setting.
     */
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    /**
     * Sends the specified message to the other end of the connection. The
     * message will be terminated with a newline (e.g. '\n').
     * 
     * @param message The message to send.
     */
    public void send(String message) {
        if(debug) {
            System.out.println(">> " + message);
        }
        writer.println(message);
        writer.flush();
    }

    /**
     * Reads a message from the other end of the connection and returns it.
     * 
     * @return The message that has been read.
     */
    public String receive() {
        String message = scanner.nextLine();
        if(debug) {
            System.out.println("<< " + message);
        }
        return message;
    }

    /**
     * Closes the duplexer and all of its resources.
     */
    public void close() {
        try {
            socket.close();
            scanner.close();
            writer.close();
        } catch(IOException ioe) {
            if(debug) {
                ioe.printStackTrace();
            }
        }
    }

}
