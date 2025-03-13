package unit13.haunted;

public class Area 
{
    private String name;
    private AreaType type;
    private String evilPresence;
    public Area(String name, AreaType type)
    {
        this.name = name;
        this.type = type;
    }
    public String getName()
    {
        return name;
    }
    public AreaType getType()
    {
        return type;
    }
    public boolean isHaunted()
    {
        if(!evilPresence.equals(null))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public String toString()
    {
        if(isHaunted())
        {
            return name + " [" + type + "/" + evilPresence + "]"; 
        }
        else
        {
            return name + " [" + type + "]";
        }
    }
    public boolean equals(Area a)
    {
        if(a.getName() == name)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void haunt(String evilPresence)
    {
        this.evilPresence = evilPresence;
    }
}
