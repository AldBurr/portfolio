package unit07.thegame;

public abstract class DiscardPile extends Deck
{
    public int[] discardpile =  new int[cards.length];
    int cardplacelocation = 0;
    public int getTop()
    {
        discardpile[cardplacelocation] = top;
        cardplacelocation ++;
        return top;
    }
    public abstract boolean discard(int Card);
    public int amountdiscarded()
    {
        int nums = 0;
        for(int x = 0; x < discardpile.length; x++)
        {
            if(discardpile[x] != 0)
            {
                nums++;
            }
        }
        return nums;
    }
}
