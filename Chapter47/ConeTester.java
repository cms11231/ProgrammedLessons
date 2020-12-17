import java.util.Scanner ;



public class ConeTester {
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);
        double radius, height;
        System.out.print( "Radius: " ); 
        radius = scan.nextDouble();
        System.out.print( "Height: " ); 
        height = scan.nextDouble();

        Cone cone = new Cone(radius,height);
    
        System.out.println( "Area:"  + cone.area() + "\nVolume: " + cone.volume() + "\nSlant Height: " + cone.slantHeight() + "\nApex of Cone Angle: " + cone.angle());
    }



}