import java.util.Scanner;


public class AgeInSeconds {

	public static void main(String[] args) {
        int years;
        int months;
        int days;

        
        Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Years: ");
		years = scan.nextInt();
		System.out.println("Enter Months: " );
        months = scan.nextInt();
        System.out.println("Enter Days: " );
        days = scan.nextInt();
        
        int secondsinday = days * 86400;
        int seconds = years * 365 * secondsinday + months * 30 * secondsinday + days * secondsinday;
        int life = (seconds % 1000) % 2500000;


        System.out.println("Seconds lived: " + seconds);
        System.out.println("Percentage of life lived: " + life);
	}

}