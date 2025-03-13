package unit11.ChezWollies;

import java.util.LinkedList;

public class ChezWollies 
{
    LinkedList<FoodItems> conveyor;
    private final int wolleconds;
    public int numofDiners = 0;
    public void enter()
    {
        numofDiners ++;
    }
    public void exit()
    {
        numofDiners--;
    }
    public int getCount()
    {
        return numofDiners;
    }
    public void serve(FoodItems item)
    {
        conveyor.add(item);
    }
}
