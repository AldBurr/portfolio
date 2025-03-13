package unit07.thegame;

public class Hand 
{
    private int[] hand;
    private int last;
    public Hand(int capacity)
    {
        hand = new int[capacity];
    }
    public boolean deal(int Card)
    {
        for(int x = 0; x < hand.length; x++)
        {
            if(hand[x] == 0)
            {
                hand[x] = Card;
                return true;
            }
        }
        return false;
    }
    public boolean isFull()
    {
        for(int x = 0; x < hand.length; x++)
        {
            if(hand[x] == 0)
            {
                return false;
            }
        }
        return true;
    }
    public boolean isEmpty()
    {
        for(int x = 0; x < hand.length; x++)
        {
            if(hand[x] != 0)
            {
                return false;
            }
        }
        return true;
    }
    public void remove(int Card)
    {
        for(int x = 0; x < hand.length; x++)
        {
            if(hand[x] == Card)
            {
                hand[x] = 0;
            }
        }
    }
    @Override
    public String toString()
    {
        String ReturnString = "";
        ReturnString += "Your hand is ";
        for(int x = 0; x < hand.length; x++)
        {
            ReturnString += (hand[x] + " ");
        }
        return ReturnString;
    }
}
