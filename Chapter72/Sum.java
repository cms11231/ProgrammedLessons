import java.util.Scanner;
import java.io.*;

public class Sum {
  public static void main (String[] args) throws IOException { 
    File file = new File("Sum.txt");
    Scanner scan = new Scanner( file );
    int sum = 0;      

    while( scan.hasNextInt() ) {
      sum += scan.nextInt();
    }

    System.out.println("The sum is " + sum);
    scan.close();
  }
}