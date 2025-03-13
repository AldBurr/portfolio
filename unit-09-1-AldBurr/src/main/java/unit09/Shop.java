package unit09;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;
public class Shop 
{
    Set<Integer> someonesOrder;
    Set<Integer> display = new HashSet<>();
    public Set<Integer> displayCase()
    {
        Random r = new Random();
        
        for(int x = 0; x < 25; x++)
        {
            display.add(r.nextInt(25));
        }
        return display;
    }
    public int getFromDisplay()
    {
        Random r = new Random();
        ArrayList<Integer> aList = new ArrayList<>(display);
        int indexChosen = r.nextInt(25);
        int chosen = aList.get(indexChosen);
        aList.remove(indexChosen);
        return chosen;
    }
    public void takeOrder(Set<Integer> orderset)
    {
        this.someonesOrder = orderset;
        
    }
    public void eat()
    {
        for(int x = 0; x < someonesOrder.size(); x++)
        {
            System.out.println(someonesOrder);
        }
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        scan.close();
    }
}
