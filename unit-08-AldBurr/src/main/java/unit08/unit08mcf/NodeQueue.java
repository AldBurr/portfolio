package unit08.unit08mcf;

public class NodeQueue<T> 
{
    /*
    Front Node
     */
    Node<T> front;
    /*
    Back Node
     */
    Node<T> back;
    /*
    Size of Queue
     */
    int size;
    public NodeQueue(Node<T> front, Node<T> back, int size)
    {
        this.front = front;
        this.back = back;
        this.size = size;
    }
    @Override
    public String toString()
    {
        return size + " " + front;
    }
    public void enqueue(T value)
    {
        Node<T> node = new Node<T>(value);
        if(front == null)
        {
            front = node;
            back = node;
        }
        else
        {
            back.setNext(node);
            back = node;
        }
        size++;
    }
    public T dequeue()
    {
        T value = front.getValue();
        front = front.getNext();
        if( front == null){
            back = null;
        }
        size--;
        return value;
    }
    public int size()
    {
        return size;
    }
}
