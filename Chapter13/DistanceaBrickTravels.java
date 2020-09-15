import java.util.Scanner;


public class DistanceaBrickTravels
{
	public static void main(String[] args) {

        double time;
        double g = 32.174;
        
        Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the number of seconds: ");
        time = scan.nextDouble();
        
        
        double distance = 0.5 * g * time * time;

	    System.out.println("Distance: " + distance);

    }
}

// The distance a brick travels in 100 seconds is 160,870.0 feet.