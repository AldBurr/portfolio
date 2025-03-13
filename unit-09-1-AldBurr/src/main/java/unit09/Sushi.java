package unit09;

public class Sushi 
{
    private int number;
    private int weight;
    private int price;
    public Sushi(int number, int weight, int price)
    {
        this.number = number;
        this.weight = weight;
        this.price = price;
    }
    public int getNum()
    {
        return number;
    }
    public int getWeight()
    {
        return weight;
    }
    public int getPrice()
    {
        return price;
    }
}
