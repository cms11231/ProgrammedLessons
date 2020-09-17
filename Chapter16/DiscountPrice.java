import java.util.Scanner;


public class DiscountPrice
{
	public static void main(String[] args) {

        double cents;
        double discount;
        
        Scanner scan = new Scanner(System.in);
	    System.out.println("Enter amount of purchases: ");
        cents = scan.nextDouble();
        
        boolean isless = false;
        
        if (cents < 1000) {
            isless = true;
        }

        double centss = cents - cents * .1;

        if (isless) {
            System.out.println("Discounted Price: " + cents);
        } else {
            System.out.println("Discounted Price: " + centss);
        }

    }
}

// The distance a brick travels in 100 seconds is 160,870.0 feet.