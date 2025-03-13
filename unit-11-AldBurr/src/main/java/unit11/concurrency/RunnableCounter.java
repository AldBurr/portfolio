package unit11.concurrency;

public class RunnableCounter implements Runnable
{
    String name;
    public RunnableCounter(String name)
    {
        this.name = name;
    }
    @Override
    public void run()
    {
        for(int x = 1; x <= 100; x++)
        {
            System.out.println(name + ":" + x);
        }
    }
    public static void main(String[] args) 
    {
        Runnable runner = new RunnableCounter("runner1");
        Thread thread1 = new Thread(runner);
        thread1.start();
    }
}
