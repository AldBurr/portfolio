package unit08.unit08mcf;
import java.util.Iterator;
public class RLNG<E> implements Iterator<E> 
{
    private static final long maxInt = Integer.MAX_VALUE + 1;
    private int randSeed;
    private int endVal = 1000;
    private int startVal = 0;
    private E generatedNum;
    public RLNG(int seed)
    {
        this.randSeed = seed;
    }
    public RLNG()
    {
        randSeed = (int) 1.7 * (java.time.LocalDateTime.now().getNano());
    }
    public void iterator()
    {
        if(hasNext())
        {
            generatedNum = (E) (123 * randSeed - 1) % Integer.MAX_VALUE;
        }
    }
    public E next()
    {
        randSeed++;
        return generatedNum;
    }
    public boolean hasNext()
    {
        return startVal < endVal;
    }
}
