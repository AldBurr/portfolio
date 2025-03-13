package unit08.unit08mcf;

public class LinkedList<E> implements List<E>
{
    private Node<E> head;
    private Node<E> tail;
    private int size;
    public LinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public int size()
    {
        return size;
    }
    @Override
    public void append(E value)
    {
        Node<E> node = new Node<E>(value);
        if(size == 0)
        {
            head = node;
            tail = node;
        }
        else
        {
            tail.setNext(node);
            tail = node;
        }
    }
    @Override
    public E get(int index)
    {
        for(int x = 0; x <= index; x++)
        {
            if(x == index)
            {
                return getValue();
            }
            else
            {
                return null;
            }
        }
    }
    @Override
    public void set(int index, E val)
    {
        LinkedList.get(index);
        
    }
}