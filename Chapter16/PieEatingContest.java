import java.util.Scanner;


public class PieEatingContest
{
	public static void main(String[] args) {

        double weight;
        
        Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your weight: ");
        weight = scan.nextDouble();
        
        
        if (weight >= 280 ^ weight <= 220) {
            System.out.println("You are not beefy enough or too beefy");
        } else {
            System.out.println("You are beefy enough");
        }


    }
}
