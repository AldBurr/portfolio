package unit09.practicum;

import scala.collection.Iterator;

public class ArrayTuple<E> extends ArrayIterator<E> implements Tuple<E>
{
    Object[] elements;
    public ArrayTuple(Object[] elements)
    {
        super(elements, 0);
    }
    @SuppressWarnings("unchecked")
    public E get(int index)
    {
        return (E) elements[index];
    }
    @Override
    public int size()
    {
        return elements.length;
    }
    @Override
    public Iterator<E> Iterator()
    {
        Iterator<E> iterate;
        return iterate;
    }
    @Override
    public String toString()
    {
        String finalString = "";
        for(int x  = 0; x < elements.length; x++)
        {   
            finalString += elements[x];
        }
        return finalString;
    }
}
