package unit07.gvt;

public abstract class Goat
{
    int MaxHP = 100;
    int currentHP;
    String name;
    public Goat(int currentHP, String name, int MaxHP)
    {
        this.currentHP = currentHP;
        this.name = name;
        this.MaxHP = MaxHP;
    }
    public String toString()
    {
        return "A mage named " + name + " with " + currentHP + "/" + MaxHP + " hit points";
    }
    public abstract Attack attack();
    public abstract void takeDamage(Attack attack);
    public boolean isConscious()
    {
        if(currentHP == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public void heal(int hp)
    {
        if(hp < (MaxHP/currentHP))
        {
            currentHP += hp;
        }
        else{
            System.out.println("Cannot heal that much");
        }
    }
}
