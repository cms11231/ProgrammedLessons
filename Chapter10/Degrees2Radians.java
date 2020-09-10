public class Degrees2Radians
{  
    public static void main ( String[] args )  
    {
    var degrees = 30;
    var rad = degrees * Math.PI/180;
    var sinx = Math.sin(rad);
    var cosx = Math.cos(rad);
    var sum = (sinx * sinx) + (cosx * cosx);
    System.out.println("Radians: " + rad + " Sine: " + sinx + " Cos: " + cosx + " sum of squares: " + sum );
    }
}