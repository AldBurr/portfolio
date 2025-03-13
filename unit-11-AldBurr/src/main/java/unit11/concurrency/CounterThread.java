package unit11.concurrency;
import java.lang.Thread;
public class CounterThread extends Thread
{
    String name;
    public CounterThread(String name)
    {
        this.name = name;
    }
    @Override
    public void run()
    {
        System.out.println(name);
        for(int x = 1; x <= 100; x++)
        {
            System.out.println(name +":" + x);
        }
    }
    public static void main(String[] args) 
    {
        CounterThread thread = new CounterThread("Threader");
        thread.start();
        while(thread.isAlive()){}
        for(char ch = 'A'; ch <= 'Z'; ch++)
        {
            System.out.print(ch + " ");
        }
        thread.start();
    }
}
