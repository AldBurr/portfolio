package unit08;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MugTest 
{
    @Test
    public void mugTest()
    {
        int size = 12;
        String color = "Blue";
        Material material = Material.BAMBOO;
        String phrase = "WAKE UP"; 
        Mug mug1 = new Mug(size, color, material, phrase);
        assertEquals(mug1.getColor(), color);
    }
}
