package unit08.practicum;

public interface Person 
{
    public Attack attack();
    public void takeDamage(Attack attack);
    public String toString();
    public boolean isConscious();
}
