package unit07.gvt;
import java.util.Random;
public class Cleric extends Goat
{
    public Cleric(String name)
    {
        super(125, name, 125);
    }
    @Override
    public String toString()
    {
        return "A Cleric named " + name + " with " + currentHP + "/" + MaxHP + " hit points";
    }
    @Override
    public Attack attack()
    {
        Random r = new Random();
        int[] hits = {r.nextInt(15, 26)};
        return new Attack("Bell, Book, and Candle", hits, DamageType.Holy);
    }
    @Override
    public void takeDamage(Attack attack)
    {
        double adjustment = 1.0;
        DamageType type = attack.getDamageType();
        if(type == DamageType.Holy)
        {
            heal(31);
        }
        int[] hits = attack.getHits();
        for(int x = 0;  x < hits.length; x++)
        {
            currentHP -= (hits[x] * adjustment);
        }
    }
}
