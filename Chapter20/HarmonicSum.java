import java.util.Scanner;
public class HarmonicSum {
    	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        int n = 0;
        double sum = 0;
        double i = 1;

		System.out.println("Enter n: ");
        n = scan.nextInt();

        while ((i - 1.0) < n){

            sum = sum + (1.0 / i);

            i++;
        }

        System.out.println("The sum is: " + sum);
        
	}
}