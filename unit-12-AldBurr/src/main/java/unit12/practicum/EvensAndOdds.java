package unit12.practicum;

public class EvensAndOdds 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Thread thread = new Thread();
        thread.start();
        thread.join();
        for(int i = 1; i <= 99; i +=2)
        {
            System.out.println(i);
            thread.notifyAll();
            thread.wait();
        }
        for(int i = 2; i <= 100; i += 2)
        {
            System.out.println(i); 
            thread.wait();
            thread.notifyAll();
        }
    }
}
