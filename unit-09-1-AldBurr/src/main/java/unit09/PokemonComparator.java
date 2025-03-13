package unit09;
import java.lang.Comparable;
public class PokemonComparator implements Comparable<Pokemon>
{
    @Override
    public int compare(Pokemon o1, Pokemon o2)
    {
        String name1 = o1.getName();
        String name2 = o2.getName();
    }
}
