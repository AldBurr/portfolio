package unit12.Duplexer;

import java.io.IOException;
import java.net.Socket;

import unit12.guessing.GuessResult;
import unit12.guessing.GuessingGame;

public class GuessingGameProxy extends Duplexer implements GuessingGame
{
    GuessingGame game;
    public GuessingGameProxy(Socket client) throws IOException
    {
        super(client);
    }
    @Override
    public void restart()
    {
        send("RESTART");
        String response = read();
        if(!response.equals("RESTARTED"))
        {
            System.out.println("Serever did not restart");
        }
    }
    @Override
    public GuessResult guess(int num)
    {
        send("GUESS " + num);
        String response = read();
        return GuessResult.valueOf(response);
    }
    @Override
    public void quit()
    {
        send("QUIT");
        read();
        try{
            close();
        }
        catch(IOException ioe){}
    }
}
