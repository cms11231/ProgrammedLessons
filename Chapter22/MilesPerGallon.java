import java.util.Scanner;
public class MilesPerGallon {
    	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        int imiles = 1;
        while (imiles > 0) {

            int fmiles = 0;
            int gallons = 0;
            float mpg = 0;
    
            System.out.println("Initial miles: ");
            imiles = scan.nextInt();

            if (imiles < 0) {
                break;
            }

            System.out.println("Final miles: ");
            fmiles = scan.nextInt();
            System.out.println("Gallons: ");
            gallons = scan.nextInt();
            
            mpg = (fmiles - imiles)  / gallons;

            System.out.println("Miles per Gallon: " + mpg);
        }
        
        System.out.println("bye");

        
	}
}