public class Mug {
    int size;
    String color;
    double fillLevel;
    String phrase;
    String material;
    public Mug(int size, String color, double fillLevel, String phrase, String material)
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
    public static void main(String[] args) {
        
    }
}
