package unit08.practicum;

public class SSBArena 
{
    public static void main(String[] args) {
        
        Person Frodo = new Fighter(3, 15, "Frodo Baggins", 0, DamageTypes.Magic, DamageTypes.Physical);
        Person Sauron = new Fighter(1, 35, "Sauron", 25, DamageTypes.Poison, DamageTypes.Magic);
        Frodo.takeDamage(Sauron.attack());
        Sauron.takeDamage(Frodo.attack());
        if(Frodo.isConscious())
        {
            System.out.println("Frodo WINS");
        }
        else if(Sauron.isConscious())
        {
            System.out.println("Sauron WINS");
        }
        else
        {
            System.out.println("It is a tie");
        }
    }
}
