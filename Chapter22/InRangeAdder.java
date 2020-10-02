import java.util.Scanner;
public class InRangeAdder {
    	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        int low = 0;
        int high = 0;
        int data = 0;
        int sumi = 0;
        int sumo = 0;

        System.out.println("Low end of range: ");
        low = scan.nextInt();
        System.out.println("High end of range: ");
        high = scan.nextInt();
        System.out.println("Enter data: ");
        data = scan.nextInt();



        while (data != 0) {
            if (data >= low && data <= high) {
                sumi += data;
            } else {
                sumo += data;
            }
            
            System.out.println("Enter data: ");
            data = scan.nextInt();

            if (data == 0) {
                break;
            }

        }


        System.out.println("Sum of in range values: " + sumi);
        System.out.println("Sum of out of range values: " + sumo);
        

        
	}
}