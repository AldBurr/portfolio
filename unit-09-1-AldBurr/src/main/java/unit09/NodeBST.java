package unit09;
import java.lang.Comparable;
public class NodeBST<E extends Comparable<E>> implements BinarySearchTree<E> 
{
    BinaryNode<E> root;
    int size;
    public NodeBST()
    {
        root = null;
        size = 0;
    }
    @Override
    public int size()
    {
        return size;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void insert(E val)
    {
        if(root == null)
        {
            root.set(val);
        }
        else if(val.compareTo(root.getVal()) < 0)
        {
            BinaryNode<E> left = new BinaryNode<E>(val);
            root.changeLeft(left);
        }
        else
        {
            BinaryNode<E> right = new BinaryNode<E>(val);
            root.changeRight(right);
        }
    }
    @Override
    public boolean search(E target)
    {
        if(root.getVal() == target)
        {
            return true;
        }
        else if(target.compareTo(root.getVal()) < 0)
        {
            return root.search(target);
        }
        else
        {
            return root.search(target);
        }
    }
    public void binaryInsert(BinaryNode<E> node, E val)
    {
        if(val.compareTo(node.getVal()) < 0)
        {
            BinaryNode<E> left = new BinaryNode<E>(val);
            binaryInsert(left, val);
            size++;
        }
        else if(val.compareTo(node.getVal()) > 0)
        {
            BinaryNode<E> right = new BinaryNode<E>(val);
            binaryInsert(right, val);
            size++;
        }
    }
    private boolean binarySearch(BinaryNode<E> node, E target)
    {
        if(target == node.getVal())
        {
            return true;
        }
        else if(target.compareTo(node.getVal()) < 0)
        {
            BinaryNode<E> left = node.getLeft();
            return left != null && binarySearch(left, target);
        }
        else if(target.compareTo(node.getVal()) > 0)
        {
            BinaryNode<E> right = node.getRight();
            return right != null && binarySearch(right, target);
        }
    }
}
