import java.util.Scanner;
public class AvgAndStanDev {
    	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        int n = 0;
        int i = 0;
        float avg = 0;
        float avgg = 0;
        float sd = 0;
        float sdd = 0;

		System.out.println("Enter n: ");
        n = scan.nextInt();

        while (i < n){
            System.out.println("Enter float: ");
            float num = scan.nextFloat();

            avg += num;
            sd += num * num;
            i++;
        }

        avgg = avg / n;
        sd = sd / n;
        sdd = (float)Math.sqrt(sd - avg * avg);


        System.out.println("The average: " + avgg);
        System.out.println("The standard deviation: " + sdd);
        
	}
}