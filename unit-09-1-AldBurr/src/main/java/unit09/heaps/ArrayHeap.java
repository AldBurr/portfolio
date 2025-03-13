package unit09.heaps;
import java.util.ArrayList;
public class ArrayHeap implements Heaps
{
    int[] array;
    int size;
    public ArrayHeap()
    {
        this.array = new int[3];
        this.size = 0;
    }
    public int size()
    {
        return size;
    }
    @Override
    public String toString()
    {
        return size + ", " + array;
    }
    @Override
    public void add(int val)
    {
        if(size == array.length)
        {
            array = Arrays.copyOf(this.array, size*2);
        }
        array[size] = val;
        size++;
    }
    public void swap(int loc1, int loc2)
    {
        int temp = loc1;
        loc1 = loc2;
        loc2 = temp;
    }
    public int remove() {
        size--;
        int value = array[0];
        swap(0, size);
        array[size] = 0;

        return value;
    }
    private void siftDown()
    {
        int parent = 0;
        while(parent < size)
        {
            int left = parent * 2 + 1;
            int right = left + 1;
            int dest = parent;
            if(left < size)
            {
                dest = left;
            }
            if(right < size && array[right] < array[left])
            {
                dest = right;
            }
            if(array[dest] < array[parent])
            {
                swap(dest, parent);
                parent = dest;
            }
            else
            {
                break;
            }
        }
    }
    public static void main(String[] args)
    {
        ArrayHeap heap = new ArrayHeap();
        System.out.println(heap.toString());
    }
}
