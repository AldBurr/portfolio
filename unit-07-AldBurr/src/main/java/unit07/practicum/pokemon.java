package unit07.practicum;

public class pokemon 
{
    public String pokemonname = "";
    final type pokemontype;
    public int pokemonlevel = 1;
    enum type
    {
        GRASS,
        FIRE,
        WATER,
        AIR,
        NORMAL,
        DRAGON
    }
    public pokemon(String pokename, type powertype, int level)
    {
        this.pokemonname = pokename;
        this.pokemontype = powertype;
        if(level > 100)
        {
            pokemonlevel = 100;
            System.out.println("A Pokemons level cannot exceed 100, Level is set to 100");
        }
        this.pokemonlevel = level;
    }
    public pokemon(String pokename, type powertype)
    {
        this.pokemonname = pokename;
        this.pokemontype = powertype;
    }
    public void increaseLevel()
    {
        if(pokemonlevel == 100)
        {
            System.out.println("You cannot level up your pokemon any more");
        }
        else
        {
            pokemonlevel += 1;
        }
    }
    public String pokemonRep()
    {
        return "Pokemon{Name = " + pokemonname + ", Type = " + pokemontype + ", Level = " + pokemonlevel + "}";
    }
    public boolean checkIfEqual(pokemon ball1, pokemon ball2)
    {
        type firstType = ball1.displayType();
        type secondType = ball2.displayType();
        int firstLvl = ball1.displayLevel();
        int secondLvl = ball2.displayLevel();
        if((firstType == secondType) && (firstLvl == secondLvl))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void changeName(String newName)
    {
        pokemonname = newName;
    }
    public String displayName()
    {
        return pokemonname;
    }
    public type displayType()
    {
        return pokemontype;
    }
    public int displayLevel()
    {
        return pokemonlevel;
    }
}
