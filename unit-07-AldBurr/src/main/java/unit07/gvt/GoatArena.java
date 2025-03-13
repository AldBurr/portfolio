package unit07.gvt;

public class GoatArena 
{
    public static void battle(Goat goat1, Goat goat2)
    {
        while(goat1.isConscious() && goat2.isConscious())
        {
            Attack attack1 = goat1.attack();
            goat2.takeDamage(attack1);
            Attack attack2 = goat2.attack();
            goat1.takeDamage(attack2);
        }
        if(goat1.isConscious())
        {
            System.out.println("Goat 1 wins");
        }
        else if(goat2.isConscious())
        {
            System.out.println("Goat 2 wins");
        }
        else if(goat1.isConscious() && goat2.isConscious())
        {
            System.out.println("It ends in a Tie");
        }
    }
    public static void main(String[] args) 
    {
        Goat goat1 = new Mage("Frodo");
        Goat goat2 = new Fighter("Sauron");
        GoatArena.battle(goat1, goat2);
    }
}
