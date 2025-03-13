package unit12.Duplexer;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import unit12.guessing.GamePlayer;
import unit12.guessing.GuessingGame;

public class NetworkGuessingGame 
{
    public static void main(String[] args) throws UnknownHostException, IOException 
    {
        Socket server = new Socket("localhost", 1234);
        GuessingGame game =  new GuessingGameProxy(server);
        GamePlayer player = new GamePlayer(game);
        player.playTheGame();
    }
}
