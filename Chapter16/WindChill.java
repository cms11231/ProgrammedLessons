import java.util.Scanner;


public class WindChill {

	public static void main(String[] args) {
        int speed;
        int temp;
        double WindChill;
        
        speed = 1;
        
        
        Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Wind Speed: ");
		speed = scan.nextInt();
		System.out.println("Enter Temperature: " );
		temp = scan.nextInt();

		
		if (speed < 3) {
			WindChill = temp;
		} else if (temp >= 50) {
			WindChill = temp;
		} else {
			WindChill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * temp * Math.pow(speed, .16));			
		}
		System.out.println("The Windchilll is: " + WindChill);
	}

}