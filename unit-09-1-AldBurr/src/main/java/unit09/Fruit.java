package unit09;
import java.lang.Comparable;
public class Fruit implements Comparable<Fruit>
{
    private final double price;
    private final String name;
    public Fruit(String name, double price)
    {
        this.price = price;
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    @Override
    public String toString()
    {
        return name + " $" + price;
    }
    public int compareTo(Fruit f1)
    {
        int nameDiff;
        double priceDiff;
        nameDiff = this.name.compareToIgnoreCase(f1.name);
        if(nameDiff == 0)
        {
            priceDiff = this.getPrice() - f1.getPrice();
            return priceDiff < 0 ? -1 : 1;
        }
        else 
        {
            return nameDiff;
        }
    }
}
