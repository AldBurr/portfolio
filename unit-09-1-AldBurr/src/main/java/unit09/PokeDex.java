package unit09;
import java.lang.Comparable;
public class PokeDex 
{
    BinarySearchTree<E extends Comparable<E>> bst;
    public PokeDex(){}
    public void addPokemon(int number)
    {
        if(!containsPokemon(number))
        {
            bst.insert(number);
        }
    }
    public boolean containsPokemon(int val)
    {
        if(bst.search(val))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
