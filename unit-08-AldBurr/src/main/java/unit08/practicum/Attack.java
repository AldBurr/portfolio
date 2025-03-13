package unit08.practicum;

public class Attack 
{
    int[] numAttacks;
    int Damage;
    DamageTypes type;
    public Attack(int Damage, int numAttacks, DamageTypes type)
    {
        this.numAttacks = new int[numAttacks];
        this.Damage = Damage;
        this.type = type;
    }
    public int getDamage()
    {
        return Damage;
    }
    public int[] getNumAttacks()
    {
        return numAttacks;
    }
    public DamageTypes getType()
    {
        return type;
    }
}
