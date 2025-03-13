package unit11.ChezWollies;

public class FoodItems 
{
    public String name;
    public int numofservings;
    public FoodItems(String name, int numofservings)
    {
        this.name = name;
        this.numofservings = numofservings;
    }
    public int getServings()
    {
        return numofservings;
    }
    public String getName()
    {
        return name;
    }
}
