package unit11;

public class Deadlock implements Runnable
{
    private final String name;
    private final Deadlock d1;
    private final Deadlock d2;
    public Deadlock(String name)
    {
        this.name = name;
    }
    @Override
    public void run()
    {

    }
}
