public class Mug {
    private int size;
    private String color;
    private double fillLevel;
    private String phrase;
    private Material material;
    Mug(int size, String color, double fillLevel, String phrase, Material material)
    {
        this.size = size;
        this.color = color;
        this.fillLevel = fillLevel;
        this.phrase = phrase;
        this.material = material;
    }
    public static void printMug(Mug aMug)
    {
        System.out.println("Size: " + aMug.size);
        System.out.println("Color: " + aMug.color);
        System.out.println("Amount Filled: " + aMug.fillLevel);
        System.out.println("Mug Phrase: " + aMug.phrase);
        System.out.println("Mug Material: " + aMug.material);
    }
    public double fill(double ounces)
    {
        if(ounces < fillLevel);
            fillLevel = ounces;
        return fillLevel;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Mug)
        {
            Mug other = (Mug)obj;
            return (size == other.size && material.equals((other.material)));
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        
    }
}

