public class Trigonometry
{  
    public static void main ( String[] args )  
    {
        var x = 1;
        var sinx = Math.sin(x);
        var cosx = Math.cos(x);
        var sum = (sinx * sinx) + (cosx * cosx);
        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum );
    }
}