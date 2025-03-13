package unit11.concurrency;
import java.util.Scanner;
public class Counters 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer N: ");
        int N = scan.nextInt();
        scan.close();

        Thread[] counters = new Thread[N];

        for(int  i = 0; i < N; i ++)
        {
            try
            {
                counters[i].join();
            } catch (InterruptedException e){}
        }
    }
}
