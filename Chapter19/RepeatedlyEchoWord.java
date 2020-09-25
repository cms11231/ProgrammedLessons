import java.util.Scanner;

public class RepeatedlyEchoWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        String str = "hi";

        int i = 0;

		System.out.println("Enter a word: ");
        str = scan.next();
		System.out.println("\n");
        int times = str.length();
        
        
        while(i < times){

            System.out.println(str);

            i++;

        }



	}
		

}