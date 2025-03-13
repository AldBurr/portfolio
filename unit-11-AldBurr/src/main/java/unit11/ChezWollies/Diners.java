package unit11.ChezWollies;
import java.util.Random;
public class Diners
{
    Random rand = new Random(5);
    public String name;
    public int hungerLvl;
    public Diners(String name)
    {
        this.name = name;
        hungerLvl = rand.nextInt(10);
    }
    public void eat(FoodItems food, int wolleconds) throws InterruptedException
    {
        Thread.sleep(wolleconds);
        hungerLvl --;
    }
    public void retrieve()
    {
        
    }
}
