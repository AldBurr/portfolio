package unit09;
import java.lang.Comparable;
public interface BinarySearchTree<E extends Comparable<E>> 
{
    public void insert(E val);
    public boolean search(E target);
    public int size();
}
