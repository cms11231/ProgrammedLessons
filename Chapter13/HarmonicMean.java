import java.util.Scanner;


public class HarmonicMean
{
	public static void main(String[] args) {

        float x;
        float y;
        
        Scanner scan = new Scanner(System.in);
	    System.out.println("Enter X: ");
        x = scan.nextInt();

        System.out.println("Enter Y: ");
        y = scan.nextInt();
        
        float arith = (x + y) / 2;
        float harm = 2 / (1 / x + 1 / y);

	    System.out.println("Arithmetic mean: " + arith + "\nHarmonic mean: " + harm);

    }
}