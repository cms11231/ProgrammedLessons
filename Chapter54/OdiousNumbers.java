import java.util.Scanner;

public class OdiousNumbers{
    public static boolean isOdious(int n){
        
        int binaryCount = 0;
        while (n > 0) {
            if ((n % 2) == 1) {
                binaryCount ++;
            }
            n /= 2;
        }
        if (binaryCount % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Number: ");
        int n = scan.nextInt();

        if (isOdious(n)) {
            System.out.println(n + " is odious.");
        } else {
            System.out.println(n + " isn't odious.");
        }
        
        while (n > 0) {
            System.out.println("Enter number: ");
            n = scan.nextInt();

            if (isOdious(n)) {
                System.out.println(n + " is odious.");
            } else {
                System.out.println(n + " isn't odious.");
            }
        }
        scan.close();

    }
}