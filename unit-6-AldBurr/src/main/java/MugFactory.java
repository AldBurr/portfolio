public class MugFactory 
{
    public static final String I_HATE_MONDAYS = "I hate Mondays";
    public static final String MOM = "Mom";
    public static void printMug(Object obj)
    {
        System.out.println(obj);
    }
    public static void main(String[] args) 
    {
        Mug mug1 = new Mug(3, "Blue", 5.0, "Coffee?", Material.PLASTIC);
        Mug.printMug(mug1);
    }
}
