import java.util.Scanner;
public class OneLetterPerLine {
    	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        String str = "hi";
        int i = 0;


		System.out.println("Enter a word: ");
        str = scan.next();

        int times = str.length();


        while(i < times){

            System.out.println(str.charAt(i));

            i++;

        }

	}
}