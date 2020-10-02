import java.util.Scanner;
public class JetLagCalc {
    	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    
        double hours = 0;
        double zones = 0;
        double depart = 0;
        double arrive = 0;
        double departt = 0;
        double arrivee = 0;


		System.out.println("Enter Hours: ");
        hours = scan.nextInt();
        System.out.println("Enter Number of Zones Crossed: ");
        zones = scan.nextInt();
        System.out.println("Enter Departure time: ");
        depart = scan.nextInt();
        System.out.println("Enter Arrival time: ");
        arrive = scan.nextInt();

        if (depart >=8 && depart < 12) {
            departt = 0.0;
        } else if (depart >= 12 && depart < 18) {
            departt = 1.0;
        } else if (depart >= 18 && depart < 22) {
            departt = 3.0;
        } else if (depart < 1) {
            departt = 4.0;
        } else if (depart >= 1 && depart < 8) {
            departt = 5.0;
        }


        if (arrive >=8 && arrive < 12) {
            arrivee = 4.0;
        } else if (arrive >= 12 && arrive < 18) {
            arrivee = 2.0;
        } else if (arrive >= 18 && arrive < 22) {
            arrivee = 0.0;
        } else if (arrive < 1 || arrive == 0) {
            arrivee = 1.0;
        } else if (arrive >= 1 && arrive < 8) {
            arrivee = 3.0;
        }

        
        double days = (hours / 2.0 + (zones - 3.0) + departt + arrivee) / 10.0;

        System.out.println( days + " days" + arrivee + departt);
        
	}
}