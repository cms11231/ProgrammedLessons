import java.util.Scanner;
public class WordsSeperatedByDots {
    	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        String str = "hi";
        String str2 = "hi";
        int i = 0;

		System.out.println("Enter a word: ");
        str = scan.next();
        System.out.println("Enter a second word: ");
        str2 = scan.next();

        int times = 30 - str.length() - str2.length();
		System.out.println("\n" + str);
        


        while(i < times){

            System.out.println(".");

            i++;

        }

        System.out.println(str2);
	}
}