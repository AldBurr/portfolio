package unit08.unit08mcf;

public class ArrayList<E> implements List<E>
{
    private Object[] elements;
    private int size;
    public ArrayList(int size)
    {
        this.size = size;
        elements = new Object[2];
    }
    public ArrayList(List<E> list)
    {
        list = new ArrayList<E>(size); 
    }
    @Override
    public void set(int val, E value)
    {
        elements[val] = value;
    }
    @Override
    public int size()
    {
        return size;
    }
    @Override
    public void append(E value)
    {
        elements[size] = value;
        size += size;
    }
    @Override
    @SuppressWarnings("unchecked")
    public E get(int index)
    {
        return (E)elements[index];
    }
    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj)
    {
        boolean isEqual = true;
        if(obj instanceof ArrayList)
        {
            isEqual = false;
            return isEqual;
        }
        if(size == ((ArrayList<E>) obj).size())
        {
            isEqual = false;
            return isEqual;
        }
        for(int i = 0; i < size; i++)
        {
            if((this.get(i) == ((ArrayList<E>) obj).get(i)) == false)
            {
                isEqual = false;
            }
        }
        return isEqual;
    }
    @Override
    public Iterator<E> iterator()
    {
        return new ArrayIterator<E>(elements, size);
    }
}
