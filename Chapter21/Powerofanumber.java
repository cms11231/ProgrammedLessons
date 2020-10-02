import java.util.Scanner;
public class Powerofanumber {
    	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        float X;
        int N = 0;
        int i = 0;

        System.out.println("Enter X: ");
        X = scan.nextFloat();
        System.out.println("Enter N: ");
        N = scan.nextInt();

        float pow = X;

        if (N < 0) {
            System.out.println("N must be a positive integer.");
        } else {
            while (i<(N-1)) {
                pow = pow * X;
                i++;
            }
            System.out.println( X + " raised to the power " + N + " is: " + pow);
        }

        
	}
}