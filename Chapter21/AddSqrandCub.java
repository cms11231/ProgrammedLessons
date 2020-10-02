import java.util.Scanner;
public class AddSqrandCub {
    	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        int i = 0;
        int N = 0;
        int sqr = 0;
        int cub = 0;


        System.out.println("Enter N: ");
        N = scan.nextInt();

        while (i<(N+1)) {
            sqr += (i*i);
            cub += (i*i*i);
            i++;
        }

        System.out.println( "The sum of squares is: " + sqr + "\nThe sum of cubes is: " + cub);
        
	}
}