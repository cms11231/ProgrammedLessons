import java.util.Scanner;

public class MicrowaveTime {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
            
            double items;
            double time;
            double seconds;
            double math;
            

			System.out.println("Enter the number of items: ");
			items = scan.nextDouble();
            System.out.println("Enter the time for one of those items: ");
			time = scan.nextDouble();
            double ew = time/100;
            math = ew * 60 + (time - ew);
            
            if (time < 100) {
				seconds = time;
			} else {
				seconds = math;
			}

            System.out.println(seconds);
		}
		

}