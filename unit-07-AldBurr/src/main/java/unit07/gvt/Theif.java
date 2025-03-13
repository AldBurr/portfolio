package unit07.gvt;
import java.util.Random;
public class Theif extends Goat 
{
    public Theif(String name)
    {
        super(125, name, 125);
    }
    @Override
    public String toString()
    {
        return("A Theif named " + name + " With " + currentHP + "/" + MaxHP);
    }
    @Override
    public Attack attack()
    {
        Random r = new Random();
        int[] hits = new int[r.nextInt(3)];
        for(int x = 0; x < hits.length; x++)
        {
            hits[x] = r.nextInt(10, 21);
        }
        return new Attack("Stabbity-Stab", hits, DamageType.Physical);
    }
    @Override
    public void takeDamage(Attack attack)
    {
        double adjustment = 1.0;
        DamageType type = attack.getDamageType();
        if(type == DamageType.Poison)
        {
            adjustment = .25;
        }
        int[] hits = attack.getHits();
        for(int x = 0;  x < hits.length; x++)
        {
            currentHP -= (hits[x] * adjustment);
        }
    }
}
