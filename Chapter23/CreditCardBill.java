import java.util.Scanner;
public class CreditCardBill {
    	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        double debt = 1000;
        int N = 0;
        int month = 1;
        double now = 0;
        double total = 0;

        System.out.println("Enter Monthly Payment: ");
        N = scan.nextInt();

        while (debt > 0) {
            System.out.println("Month: " + month);
            debt = ((debt - N) * .015) + (debt - N);
            System.out.println("Balance: " + debt);
            total = month * N;
            System.out.println("Total Payments: " + total);
            month++;
        }
        

        
	}
}