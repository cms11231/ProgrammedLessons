import java.util.Scanner;
public class AddingUpIntegers {
    	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        int numofint = 0;
        int number;
        int sum = 0;


		System.out.println("How many Integers will be added: ");
        numofint = scan.nextInt();

        for (int i = 0; i < numofint; i++){

            System.out.println("Enter an Integer: ");
            number = scan.nextInt();

            sum += number;

        }

        System.out.println("The sum is: " + sum);
        
	}
}