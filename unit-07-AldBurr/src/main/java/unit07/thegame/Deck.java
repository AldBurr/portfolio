package unit07.thegame;
import java.util.Random;
public class Deck 
{
    public int[] cards;
    public int top;
    public int topLocation;
    public Deck()
    {
        int location = 0;
        for(int cardVal = 2; cardVal <= 99; cardVal++)
        {
            cards[location] = cardVal;
            location++;
        }
        topLocation = 0;
        top = cards[0];
    }
    public int drawCard()
    {
        if(topLocation < cards.length)
        {
            topLocation ++;
            return(top);
        }
        else
        {
            return -1;
        }
    }
    public void shuffle()
    {
        Random r = new Random();
        for(int x = 0; x < cards.length; x++)
        {
            int hold = cards[x];
            int randchoice = r.nextInt(x);
            cards[x] = cards[randchoice];
            cards[randchoice] = hold;
        }
    }
}
