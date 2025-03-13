package unit07.gvt;

public class Trollzord extends Troll
{
    public Trollzord(double currenthp, int MaxHP)
    {
        super(currenthp, "Trollzord", MaxHP);
    }
    @Override
    public Attack attack()
    {
        int[] hits = {25};
        return new Attack("Flame War", hits, DamageType.Magical);
    }
    @Override
    public void takeDamage(Attack attack)
    {
        double adjustment = 1.0;
        DamageType type = attack.getDamageType();
        if(type == DamageType.Holy)
        {
            adjustment = 1.25;
        }
        int[] hits = attack.getHits();
        for(int x = 0;  x < hits.length; x++)
        {
            MaxHP -= (hits[x] * adjustment);
        }
    }
}
