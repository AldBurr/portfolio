import java.util.Scanner;
import java.util.Random;
public class Bet {
    double playerbet = 0;
    int wheellocation;
    String color;
    enum Colors
    {
        RED,
        BLACK,
        GREEN
    }
    Bet(int numberchoice, double bet)
    {
        wheellocation = numberchoice;
        playerbet = bet;
    }
    Bet(String colorChoice, double bet)
    {
        color = colorChoice;
        playerbet = bet;
    }
    public Boolean winning()
    {
        Random roulette = new Random();
        int winningNum = roulette.nextInt(37);
        Colors winningColor;
        if((winningNum % 2) == 0)
        {
            winningColor = Colors.BLACK;
        }
        else if(winningNum == 0)
        {
            winningColor = Colors.GREEN;
        }
        else
        {
            winningColor = Colors.RED;
        }
        System.out.println("The wheel Lands on... " + winningNum + " " + winningColor);
        if(winningNum == wheellocation)
        {   
            return (true);
        }
        else
        {
            return (false);
        }
    }
    public static void main(String[] args) {
        Scanner dealer = new Scanner(System.in);
        System.out.print("Please enter your bet and location: ");
        String bet = dealer.nextLine();
        String[] aArray = bet.split(" ");
        String betDollar = aArray[0];
        String betLocation = aArray[1];
        int betplace = Integer.parseInt(betLocation);
        int dollarBet = Integer.parseInt(betDollar);
        double playerbet = (double) dollarBet;
        Bet bet1 = new Bet(betplace, playerbet);
        dealer.close();
        if (bet1.winning() == true)
        {
            System.out.println("CONGRATULATIONS: YOU WON, PLAY AGAIN?");
            System.out.println("You have won $" + (playerbet * 36));
        }
        else
        {
            System.out.println("UNFORTUNATELY YOU LOST, PLAY AGAIN?");
            System.out.println("You have won $0");
        }
    }
}
