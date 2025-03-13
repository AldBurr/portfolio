package unit10.practicum;

public class HeapPQ<E> implements Queue<E>
{
    ArrayHeap heap;
    @Override
    public void enqueue(E value)
    {
        heap.add((int) value);
    }
    @Override
    public E dequeue()
    {
        int val = heap.remove();
        return (E) val;
    }
    @Override
    public int size()
    {
        return heap.size();
    }
}
