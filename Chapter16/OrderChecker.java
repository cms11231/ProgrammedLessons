import java.util.Scanner;


public class OrderChecker
{
	public static void main(String[] args) {

        double bolts;
        double nuts;
        double washer;
        
        Scanner scan = new Scanner(System.in);
	    System.out.println("Enter amount of bolts: ");
        bolts = scan.nextDouble();
        System.out.println("Enter amount of nuts: ");
        nuts = scan.nextDouble();
        System.out.println("Enter amount of washers: ");
        washer = scan.nextDouble();
        
        boolean enoughnuts = false;
        
        if (bolts <= nuts) {
            enoughnuts = true;
        }

        if (enoughnuts) {
            System.out.println("\nCheck the order: Enough  nuts");
        } else {
            System.out.println("\nCheck the order: Not enough nuts");
        }

        double cost = bolts * 5 + nuts * 3 + washer;
        
        System.out.println("\nTotal cost: " + cost);

    }
}
