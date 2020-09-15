import java.util.Scanner;


public class CorrectChange
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int cents;
        System.out.println("Input the cents:");
        cents = scan.nextInt();

        int dollars = cents / 100;
        int centss = cents - (dollars * 100);
        int quarters = centss / 25;
        int centsss = centss - (quarters * 25);
        int dimes = centsss / 10;
        int centssss = centsss - (dimes * 10);
        int nickels = centssss / 5;
        int pennies = centssss - (nickels * 5);
    
        System.out.println("Your change is: " + dollars + " dollar, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");
  }
}
