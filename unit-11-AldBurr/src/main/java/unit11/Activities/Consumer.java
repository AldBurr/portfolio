package unit11.Activities;

import java.util.LinkedList;

public class Consumer implements Runnable
{
    int id;
    LinkedList<String> queue;
    public Consumer(int id, LinkedList<String> queue)
    {
        this.id = id;
        this.queue = queue;
    }
    public void run()
    {
        synchronized(queue)
        {
            while(true)
            {
                while(!queue.isEmpty())
                {
                    String message = queue.remove(0);
                    System.out.println(id + " " + message);
                }
            }
        }
    }
}
