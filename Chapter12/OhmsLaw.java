import java.util.Scanner;


public class OhmsLaw
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int v;
        int r;    
        
        System.out.println("How many volts: ");
        v = scan.nextInt();
    
        System.out.println("Whats the resistance: ");
        r = scan.nextInt();
    
        double c = (v + 0.0) / r;
        System.out.println("The current is " + c);
  }
}
