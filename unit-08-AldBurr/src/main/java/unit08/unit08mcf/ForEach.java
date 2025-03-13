package unit08.unit08mcf;

public class ForEach 
{
    public static void forArray(String[] stringArray)
    {
        for(String word : stringArray)
        {
            System.out.println(word);
        }
    }
    public static void forList(ArrayList<String> stringArray)
    {
        for(String element : stringArray)
        {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        String[] stringArray = new String[] {"A", "B", "C"};
        forArray(stringArray);
    }
}
