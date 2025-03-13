import java.util.Scanner;
public class Collatz {
    public static String sequence(int n)
    {
        String finalsquence = "";
        while(n != 1)
        {
            if(n%2 == 0)
            {
                finalsquence += n + " ";
                n = n/2;
            }
            else if(n%2 != 0)
            {
                finalsquence += n + " ";
                n = (3*n) + 1;
            }
        }
        return finalsquence += "1";
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a natrual number: ");
        int num = scan.nextInt();
        if(num > 0)
        {
            System.out.println(Collatz.sequence(num));
        }
        scan.close();
    }
}
