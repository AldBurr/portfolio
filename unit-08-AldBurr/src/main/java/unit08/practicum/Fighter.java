package unit08.practicum;

public class Fighter implements Person
{
    int MAXHP = 100;
    int CurrentHP;
    String name;
    double damageresist;
    DamageTypes damageres;
    DamageTypes damagedeal;
    int attacks;
    int damage;
    public Fighter(int attacks, int damage, String name, double damageresist, DamageTypes damageres, DamageTypes deal)
    {
        this.attacks = attacks;
        this.damage = damage;
        this.CurrentHP = MAXHP;
        this.name = name;
        this.damageresist = damageresist;
        this.damageres = damageres;
        this.damagedeal = deal;
    }
    @Override
    public Attack attack()
    {
        int Damage = 35;
        int numAttacks = 1;
        Attack attack = new Attack(Damage, numAttacks, damagedeal);
        return attack;
    }
    @Override
    public void takeDamage(Attack attack)
    {
        int[] numAttacks = attack.getNumAttacks(); 
        double adjust = 1.0;
        for(int x = 0; x < numAttacks.length; x++)
        {
            if(attack.getType() == damageres)
            {
                adjust = (damageresist)/100;
            }
            else
            {
                adjust += (damageresist)/100;
            }
            CurrentHP -= (attack.getDamage() * adjust);
        }
    }
    @Override
    public String toString()
    {
        return "Fighter " + name + " with " + CurrentHP + "/" + MAXHP; 
    }
    @Override
    public boolean isConscious()
    {
        if(CurrentHP > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}