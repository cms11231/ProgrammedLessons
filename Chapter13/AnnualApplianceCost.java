import java.util.Scanner;


public class AnnualApplianceCost
{
	public static void main(String[] args) {

	    double kwh;
        int kwha;
        
        Scanner scan = new Scanner(System.in);
	    System.out.println("Enter cost per kilowatt-hour in cents:");
        kwh = scan.nextDouble();
        

	    System.out.println("Enter kilowatt-hours used per year:");
        kwha = scan.nextInt();
        
        double annual = (kwh * kwha) * 0.01;

	    System.out.println("Annual Cost: " + annual);

    }
}