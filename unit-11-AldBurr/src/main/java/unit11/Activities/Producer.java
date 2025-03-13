package unit11.Activities;
import java.util.LinkedList;
import java.util.Random;
public class Producer implements Runnable
{
    LinkedList<String> queue;
    int id;
    private static final Random r = new Random();
    public Producer(LinkedList<String> queue, int id)
    {
        this.queue = queue;
        this.id = id;
    }
    public void run()
    {
        int messageNumber = 1;
        while(true)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
            int numberMessages = r.nextInt();
            synchronized(queue)
            {
                for(int i = 0; i < numberMessages; i++)
                {
                    String messages = queue.get(i) + " ";
                }
            }
        }
    }
}