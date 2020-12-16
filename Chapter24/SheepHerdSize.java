import java.util.Scanner;
public class SheepHerdSize {
    	public static void main(String[] args) {

        double effect = 100.0;
        int month = 1;
        while (effect > 50) {
            System.out.println("Month: " + month);
            month++;

            System.out.println("Effectiveness: " + effect);
            effect = effect - (effect * .04);
        }
        
        System.out.println("DISCARDED");
        
	}
}