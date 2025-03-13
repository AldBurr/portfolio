package unit11.moonbase.part1;

public class Rover implements Runnable
{
    public String name;
    public String comingFrom;
    public String goingTo;
    public int timeToTraverse;
    public Rover(String name, String comingFrom, String goingTo, int timeToTraverse)
    {
        this.name = name;
        this.comingFrom = comingFrom;
        this.goingTo = goingTo;
        this.timeToTraverse = timeToTraverse;
    }
    @Override
    public void run()
    {
        System.out.println(name + "(" + timeToTraverse + ") is ready to start traversal at the " + comingFrom + " end of the tunnel");
        System.out.println(name + "(" + timeToTraverse + ") is starting traversal");
        for(int x = 0; x < timeToTraverse; x++)
        {
            System.out.println("\t" + name + "(" + x + ") Seconds");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
        System.out.println(name + "(" + timeToTraverse + ") Has completed traversal and has reached the " + goingTo + " end of the tunnel");
    }
    public static void main(String[] args) 
    {
        Rover r1 = new Rover("Rover 1", "Hyperion", "Odyssey", 15);
        Rover r2 = new Rover("Rover 2", "Odyssey", "Hyperion", 25);
        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        thread1.start();
        thread2.start();
    }
}
