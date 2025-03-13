package unit13.haunted;

import java.util.Collection;

public interface Configuration<C>
{
    public Collection<C> getSuccessors();
    public boolean isValid();
    public boolean isGoal();
}
