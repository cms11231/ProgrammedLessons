import java.util.Scanner;

public class RunofIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        int start;
        int end;
            

		System.out.println("Enter start: ");
		start = scan.nextInt();
        System.out.println("Enter end: ");
		end = scan.nextInt();
            
        while (start <= end) {
            System.out.println(start);

            start = start + 1;
        }
	}
		

}