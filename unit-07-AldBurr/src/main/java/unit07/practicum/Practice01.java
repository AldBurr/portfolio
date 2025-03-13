package unit07.practicum;

public class Practice01 
{
    
    public static String arrayToString(String[] aArray)
    {
        String finalString = "";
        finalString += "[";
        for(int x = 0; x < aArray.length; x++)
        {
            finalString += aArray[x];
            finalString += " ";
        }
        finalString += "]";
        return(finalString);
    }
    public static void main(String[] args) 
    {
        String[] a_array = {"1", "2", "3"};
        System.out.println(Practice01.arrayToString(a_array));
    }
}
