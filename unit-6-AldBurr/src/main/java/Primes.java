import java.util.Scanner;
public class Primes 
{
    public static boolean isPrime(int n)
    {
        Boolean tester = true;
        for(int x = 2; x < n; x++)
        {
            if((n % x) == 0)
            {
                tester = true;
            }
            else
            {
                tester = false;
                return(tester);
            }
        }
        return tester;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a natrual number: ");
        int num = scan.nextInt();
        while(num > 0);
        {
            System.err.println(Primes.isPrime(num));
            System.out.println("Please enter a natrual number: ");
            num = scan.nextInt();
        }  
        scan.close();
    }
}
