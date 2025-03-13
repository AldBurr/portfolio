package unit12.Duplexer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import unit12.guessing.GuessResult;
import unit12.guessing.GuessingGame;
import unit12.guessing.GuessingGameImpl;

public class GuessingGameServer extends Duplexer
{
    GuessingGame game;
    public GuessingGameServer(Socket client) throws IOException
    {
        super(client);
        game = new GuessingGameImpl();
    }
    public void run()
    {
        String request = "";
        while(!request.equals("QUIT"))
        {
            request = read();
            System.out.println("RECV: " + request);

            String[] tokens = request.split(" ");
            String response = "";
            switch (tokens[0]) 
            {
                case "QUIT":
                    game.quit();
                    response = "GAME_OVER";
                break;
                case "RESTART":
                    game.restart();
                    response = "RESTARTED";
                break;
                case "GUESS":
                    GuessResult res = game.guess(Integer.parseInt(tokens[1]));
                    response = res.toString();
                break;
                default:
                    response = "ERROR: Unknown Command" +  request;
            }
            System.out.println("SEND: " +  response);
            send(response);
        }
        try
        {
            close();
        }
        catch(IOException ioe){}
    }
    public static void main(String[] args) throws IOException
    {
        ServerSocket server = new ServerSocket(12345);
        try
        {
            while(true)
            {
                System.out.println("Waiting");
                Socket client = server.accept();
                @SuppressWarnings('Unused')
                GuessingGameServer gameServer = new GuessingGameServer(client);
                System.out.println("Starting the game");
            }
        }
        catch(IOException e){}
    }
}
