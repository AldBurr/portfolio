package unit12.Duplexer;

import java.io.IOException;

import unit12.guessing.GamePlayer;
import unit12.guessing.GuessingGame;

public class LocalGuessingGame 
{
    public static void main(String[] args) throws IOException 
    {
        GuessingGame game = new GuessingGameProxy(null);
        GamePlayer player = new GamePlayer(game);
        player.playTheGame();
    }
}
