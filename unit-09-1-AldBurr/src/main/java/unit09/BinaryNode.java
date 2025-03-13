package unit09;

public class BinaryNode<E> 
{
    private E value;
    private BinaryNode<E> left;
    private BinaryNode<E> right;
    public BinaryNode(E val)
    {
        this.value = val;
    }
    public BinaryNode(E value, BinaryNode<E> left, BinaryNode<E> right)
    {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public E getVal()
    {
        return value;
    }
    public void set(E val)
    {
        value = val;
    }
    public BinaryNode<E> getLeft()
    {
        return left;
    }
    public void changeLeft(BinaryNode<E> left)
    {
        this.left = left;
    }
    public BinaryNode<E> getRight()
    {
        return right;
    }
    public void changeRight(BinaryNode<E> right)
    {
        this.right = right;
    }
    public String infixTraversal()
    {
        String aString = "";
        if(left != null)
        {
            left.infixTraversal();
            aString += left.getLeft();
        }
        aString += this.value + " ";
        if(right != null)
        {
            right.infixTraversal();
            aString += right.getRight();
        }
        return aString;
    }
    public boolean search(E target)
    {
        if(target == value)
        {
            return true;
        }
        boolean found = false;
        if(left != null)
        {
            found = left.search(target);
        }
        else if (right != null)
        {
            found = left.search(target);
        }
        return found;
    }
    public static void main(String[] args)
    {

    }
}
