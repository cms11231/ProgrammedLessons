import java.util.Scanner;



public class AreaofaCircle
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int inData;
        System.out.println("Input the radius:");
        inData = scan.nextInt();

        Double area = (inData * inData) * Math.PI;
    
        System.out.println("The radius is: " + inData + "     The area is: " + area);
  }
}
