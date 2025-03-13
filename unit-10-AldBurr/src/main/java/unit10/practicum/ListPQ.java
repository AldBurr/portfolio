package unit10.practicum;
import java.util.LinkedList;
public class ListPQ<E extends LinkedList<E>> implements Queue<E>
{
    private LinkedList<E> queue;
    public void enqueue(E val)
    {
        queue.add(val);
    }
    public E dequeue()
    {
        E smallest = queue.get(0);
        for(int x = 0; x < queue.size(); x++)
        {
            if(queue.get(x) < smallest)
            {
                smallest = queue.get(x);
            }
        }
        queue.remove(queue.indexOf(smallest));
        return smallest;
    }
    public int size()
    {
        return  queue.size();
    }
}
