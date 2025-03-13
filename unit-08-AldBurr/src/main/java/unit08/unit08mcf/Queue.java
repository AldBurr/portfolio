package unit08.unit08mcf;

public interface Queue<E> 
{
    public void enqueue(E value);
    E dequeue();
    int size();
}