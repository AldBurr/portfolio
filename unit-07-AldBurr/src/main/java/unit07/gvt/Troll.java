package unit07.gvt;

public abstract class Troll 
{
    int MaxHP;
    String name = "";
    double regen;
    public Troll(double regenamnt, String name, int MaxHP)
    {
        this.MaxHP = MaxHP;
        this.name = name;
        this.regen = regenamnt;
    }
    public abstract Attack attack();
    public abstract void takeDamage(Attack attack);
}
