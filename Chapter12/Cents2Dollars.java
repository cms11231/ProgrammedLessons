import java.util.Scanner;



public class Cents2Dollars
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int cents;
        System.out.println("Input the cents:");
        cents = scan.nextInt();

        int dollars = cents / 100;
        int centss = cents - (dollars * 100);
    
        System.out.println("That is " + dollars + " dollars and " + centss + " cents.");
  }
}
