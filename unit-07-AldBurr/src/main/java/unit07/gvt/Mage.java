package unit07.gvt;

public class Mage extends Goat
{
    public Mage(String name)
    {
        super(100, name, 100);
    }
    @Override
    public String toString()
    {
        return "A Mage named " + name + " with " + currentHP + "/" + MaxHP + " hit points";
    }
    @Override
    public Attack attack()
    {
        int[] hits = {9, 9, 9, 9};
        return new Attack("Magic Missiles", hits, DamageType.Magical);
    }
    @Override
    public void takeDamage(Attack attack)
    {
        double adjustment = 1.0;
        DamageType type = attack.getDamageType();
        if(type == DamageType.Magical)
        {
            adjustment = .75;
        }
        else if (type == DamageType.Physical)
        {
            adjustment = 1.25;
        }
        int[] hits = attack.getHits();
        for(int x = 0;  x < hits.length; x++)
        {
            currentHP -= (hits[x] * adjustment);
        }
    }
    public static void main(String[] args) {
        Mage mage1 = new Mage("Samwise Gamgee");
        System.out.println(mage1.toString());
        Attack samsAttack = mage1.attack();
        mage1.takeDamage(samsAttack);
        System.out.println(mage1.toString());
    }
}
