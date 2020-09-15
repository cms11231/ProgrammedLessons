import java.util.Scanner;


public class FurtherSubstringFun
{
	public static void main(String[] args) {

	    int startI;
        int endI;
        
        Scanner scan = new Scanner(System.in);
	    String stringInput;
	    System.out.println("Enter a string:");
	    stringInput = scan.nextLine();
	    System.out.println("Enter beginning index: ");
	    startI = scan.nextInt();
        System.out.println("Enter ending index: ");
	    endI = scan.nextInt();

	    System.out.println("Original string:" + stringInput);
	    System.out.println("\nSubstring: " + stringInput.substring(startI, endI));

    }
}