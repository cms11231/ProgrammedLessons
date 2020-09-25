import java.util.Scanner;

public class SumofSequenInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        int n;
        int hi;
        int sum;
        int fsum;

		System.out.println("Enter N: ");
        n = scan.nextInt();
        
        hi = 1;
        sum = 0;

        
        while(hi <= n){

            sum += hi++;

        }

        fsum = (n * (n + 1)) / 2;

        System.out.println("Loop sum: " + sum);
        System.out.println("Formula sum: " + fsum);
	}
		

}