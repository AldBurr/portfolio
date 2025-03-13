package unit07.thegame;
import java.util.Scanner;
public class Human implements Player
{
    Hand hand;
    public Human(Hand hand)
    {
        this.hand = hand;
    }
    @Override
    public Moves nextMove()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter p or d");
        String move = scan.nextLine();
        scan.close();
        if(move.equals("p"))
        {
            return Moves.PASS;
        }
        else
        {
            return Moves.DISCARD;
        }
    }
    @Override
    public Moves discardMove()
    {
        return Moves.DISCARD;
    }
    @Override
    public boolean deal(int Card)
    {
        if(hand.deal(Card))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public boolean handIsFull()
    {
        if(hand.isFull())
        {
            return true;
        }
        return false;
    }
    @Override
    public boolean handIsEmpty()
    {
        if(hand.isEmpty())
        {
            return true;
        }
        return false;
    }
    @Override
    public boolean confirmGameOver()
    {
        if(DiscardPile.amountdiscarded() < 2)
        {
            return true;
        }
        return false;
    }
}
