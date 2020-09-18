import java.util.Scanner;


public class LastChanceGas
{
	public static void main(String[] args) {

        double capacity;
        double reading;
        double miles;
        
        Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your tank capacity: ");
        capacity = scan.nextDouble();
        System.out.println("Enter your gage reading: ");
        reading = scan.nextDouble();
        System.out.println("Enter amount of miles: ");
        miles = scan.nextDouble();
        
        double gasss = capacity * miles * (reading / 100);

        
        boolean enoughgas = false;
        
        if (gasss >= 200) {
            enoughgas = true;
        }

        if (enoughgas) {
            System.out.println("Enough gas!");
        } else {
            System.out.println("Get gas!");
        }

        System.out.println(gasss);

    }
}
