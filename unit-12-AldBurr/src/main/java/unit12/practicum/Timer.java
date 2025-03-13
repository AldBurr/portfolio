package unit12.practicum;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;

public class Timer 
{
    public static void timeVals(List<Integer> list, int numberOfValues)
    {
        double currentTime = (double) System.nanoTime();
        for(int i = 0; i <  numberOfValues; i++)
        {
            list.add(i);
        }
        double endTime = (double) System.nanoTime();
        double elapsedTime = endTime - currentTime;
        System.out.println("Filled list with " + numberOfValues + " in " + elapsedTime);
    }
    public static void main(String[] args) 
    {
        Thread thread = new Thread();
        ArrayList<Integer> list = new ArrayList<>();
        int numberOfValues = 100000000;
        thread.start();
        timeVals(list, numberOfValues);
        Vector<Integer> list2 = new Vector<>();
        timeVals(list2, numberOfValues);
    }
    /***
     * In Vector each time a new value is added it changes the size up by one to maximuze storage while Arraylist keeps doubling the size everytime
     ***/
}
