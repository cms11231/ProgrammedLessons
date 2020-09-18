import java.util.Scanner;


public class MatineeMovie
{
	public static void main(String[] args) {

        double age;
        double time;
        
        Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your age: ");
        age = scan.nextDouble();
        System.out.println("Enter the time: ");
        time = scan.nextDouble();
        
        boolean isadult = false;
        boolean ismatinee = false;
        
        if (age >= 13) {
            isadult = true;
        } else {
            isadult = false;
        }

        if (time < 1700) {
            ismatinee = true;
        } else {
            ismatinee = false;
        }

        if (isadult && ismatinee) {
            System.out.println("$5.00");
        } else if (isadult && !ismatinee){
            System.out.println("$8.00");
        } else if (!isadult && ismatinee){
            System.out.println("$2.00");
        } else if (!isadult && !ismatinee){
            System.out.println("$4.00");
        }


    }
}
