package unit11.moonbase.part2;

import java.nio.channels.AcceptPendingException;

public class Control 
{
    public void accessTunnel(Rover r1)
    {
        if()
        {
            r1.run();
        }
        else 
        {
            Thread.sleep(500);
            accessTunnel(r1);
        } 
    }
    public void exitTunnel()
    {
        
    }
}
