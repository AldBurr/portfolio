package unit07.gvt;

public class Fighter extends Goat{
    String name;
    public Fighter(String name)
    {
        super(150, name, 150);
    }
    public String toString()
    {
        return "A Fighter named " + name + " with " + currentHP + "/" + MaxHP + " hit points";
    }
    @Override
    public Attack attack()
    {
        int[] hits = {25};
        return new Attack("Cleave", hits, DamageType.Physical);
    }
    @Override
    public void takeDamage(Attack attack)
    {
        double adjustment = 1.0;
        DamageType type = attack.getDamageType();
        if(type == DamageType.Magical)
        {
            adjustment = 1.25;
        }
        else if (type == DamageType.Physical)
        {
            adjustment = .75;
        }
        int[] hits = attack.getHits();
        for(int x = 0;  x < hits.length; x++)
        {
            currentHP -= (hits[x] * adjustment);
        }
    }

}
