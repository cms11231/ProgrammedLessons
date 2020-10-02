import java.util.Scanner;
public class WedgeofStars {
    	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        int stars = 0;

        System.out.println("Initial number of stars: ");
        stars = scan.nextInt();


        while (stars>0) {
            int i = 0;

            while (i < stars) {
                System.out.print("*");
                i ++;
            }
            System.out.print("\n");
            stars--;
        }
        

        
	}
}