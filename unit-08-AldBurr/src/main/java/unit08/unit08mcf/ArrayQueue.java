package unit08.unit08mcf;

public class ArrayQueue<E> implements Queue 
{
    E[] elements;
    int front;
    int back;
    int size;
    public ArrayQueue()
    {
        elements = new E[Integer.MAX_VALUE];
        front = 0;
        size = 0;
        back = 0;
    }
    @Override
    public void enqueue(E value)
    {
        elements[back] = value;
        back = (back + 1) % elements.length; //Wraps around
        size++; //increments size
    }
    @Override
    public String dequeue()
    {
        String fronthold = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length; //I think this will wrap it
        size--;
        return fronthold;
    }
    @Override
    public int size()
    {
        return size;
    }
}
