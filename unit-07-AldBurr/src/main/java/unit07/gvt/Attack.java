package unit07.gvt;
public class Attack {
    private String attackName ="";
    private int[] numHits;
    private DamageType dmgtype;
    public Attack(String name, int[] hits, DamageType type)
    {
        this.attackName = name;
        this.numHits = hits;
        this.dmgtype = type;
    }
    public DamageType getDamageType()
    {
        return dmgtype;
    }
    public int[] getHits()
    {
        return numHits;
    }
    public String getname()
    {
        return attackName;
    }
}
