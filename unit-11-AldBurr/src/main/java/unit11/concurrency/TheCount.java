package unit11.concurrency;

public class TheCount implements Runnable
{
    public static int[] COUNT = new int[1];
    public int id;
    public TheCount(int id)
    {
        this.id = id;
    }
    public void run()
    {
        System.out.println("Counter: " + id + " is Starting...");
            for(int i = 0; i < 1000000; i++)
            {
                synchronized(COUNT)
                {
                COUNT[0]++;
                }
            }
        System.out.println("Counter" + id + " is done!");
    }
    public static void main(String[] args) 
    {
        for(int i = 0; i <10; i++)
        {
            TheCount counter = new TheCount(i);
            Thread thread = new Thread();
            thread.start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
}
