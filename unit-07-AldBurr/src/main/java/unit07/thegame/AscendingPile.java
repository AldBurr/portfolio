package unit07.thegame;

public class AscendingPile extends Deck 
{
    public boolean discard(int Card)
    {
        for(int x = 0; x < deck1.length; x++)
        {
            if(deck1[x] == Card)
            {
                return true;
            }
        }
        return false; 
    }
}
