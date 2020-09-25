import java.util.Scanner;

public class SumofRangeogSequenInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        int low;
        int hi;
        int sum;

		System.out.println("Enter Low: ");
        low = scan.nextInt();
        System.out.println("Enter Hi: ");
        hi = scan.nextInt();
        
        sum = 0;

        
        while(low <= hi){

            sum += low++;

        }


        System.out.println("Sum: " + sum);
	}
		

}