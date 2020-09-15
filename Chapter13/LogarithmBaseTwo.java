import java.util.Scanner;


public class LogarithmBaseTwo
{
	public static void main(String[] args) {

        double eww;
        
        Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a double: ");
        eww = scan.nextDouble();
        
        double logbase2 = (Math.log(eww)) / (Math.log(2));

	    System.out.println("Base 2 log of " + eww + " is " + logbase2);

    }
}