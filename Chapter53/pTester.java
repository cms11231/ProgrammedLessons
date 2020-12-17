import java.util.Scanner;

public class PantryTester {
    public static void main ( String[] args ) {
        Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
        Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
        Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Welcome to Mother Hubbard's Pantry!");
        Pantry hubbard = new Pantry( goose, apple, rhub );
        System.out.println( hubbard );

        while (scan.nextInt() != -1) {
        
            hubbard.select(scan.nextInt());
            System.out.println("Enter amount to spread");
            hubbard.spread(scan.nextInt());
            System.out.println(hubbard);


        }

      scan.close();
    }
}