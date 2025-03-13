package unit11.concurrency;

public class Countdown implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            for(int x = 10; x > 0; x--)
            {
                System.out.println("T-" + x);
                Thread.sleep(1000);
            }
            System.out.println("Liftoff");
        } 
        catch (InterruptedException ie){}
    }
}
