package unit08.unit08mcf;
import java.util.Iterator;
public class IterableString<E> implements Iterator<E>
{
    private E[] userString;
    private int index = -1;
    @SuppressWarnings("unchecked")
    public IterableString(String input)
    {
        userString = (E[]) input.split(" ");
    }
    @Override
    public E next()
    {
        if(index < userString.length)
        { 
            index++;
            return userString[index];
        }
        else
        {
            return null;
        }
    }
    @Override
    public boolean hasNext()
    {
        return index < userString.length;
    }
    public static void main(String[] args) {
        for (String word : new IterableString<String>("Hello World"))
        {
            System.out.println(word);
        }
    }
}
