package unit07.thegame;

public interface Player 
{
    public Moves nextMove();
    public Moves discardMove();
    public boolean deal(int Cards);
    public boolean handIsFull();
    public boolean handIsEmpty();
    public boolean confirmGameOver();
}
