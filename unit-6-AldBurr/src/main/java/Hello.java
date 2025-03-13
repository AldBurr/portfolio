import java.util.Scanner;
public class Hello {
    public static void helloYou()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.next();
        System.out.println("Hello " + name);
        scan.close();
    }
}
