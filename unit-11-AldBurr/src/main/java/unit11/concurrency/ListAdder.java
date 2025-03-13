package unit11.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ListAdder implements Runnable
{
    List<Integer> sharedList;
    int num;
    public ListAdder(List<Integer> sharedList, int num)
    {
        this.sharedList = sharedList;
        this.num = num;
    }
    @Override
    public void run()
    {
        for(int x = 0; x < num; x++)
        {
            synchronized(sharedList)
            {
            sharedList.add(x);
            }
        }
    }
    public static void main(String[] args) 
    {
        List<Integer> holder = new ArrayList<>();
        Thread[] threads = new Thread[100];
        for(int i = 0; i < 100; i++)
        {
            threads[i] = new Thread(new ListAdder(holder, i));
            threads[i].start();
        }
        for(int x = 0; x < 100; x++)
        {
            try {
                threads[x].join();
            } catch (InterruptedException e) {}
        }
    }
}
