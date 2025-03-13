package unit11.Activities;

public class Waiter implements Runnable
{
    private final Object lock;
    public Waiter(Object lock)
    {
        this.lock = lock;
    }
    @Override
    public void run()
    {
        synchronized(lock)
        {
            try
            {
                lock.wait();
            }
            catch (InterruptedException e){}
            System.out.println("Done waiting!");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        for(int i = 0; i < 10; i++)
        {
            Waiter waiter = new Waiter(lock);
            Thread thread = new Thread(waiter);
            thread.start();
        }
        Thread.sleep(1000);
        synchronized(lock)
        {
            lock.notifyAll();
            System.out.println("Thread notified!");
        }
    }
}
