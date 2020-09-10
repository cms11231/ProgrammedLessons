public class ReassVar
{  
  public static void main ( String[] args )  
  {
    double value = 2;
    double X = value;
    double quadratic = 3 * X * X - 8 * X + 4;
    System.out.println("At X = " + X + " the value of the quadratic is " + quadratic);
    value = 4;
    X = value;
    quadratic = 3 * X * X - 8 * X + 4;
    System.out.println("At X = " + X + " the value of the quadratic is " + quadratic);
    value = 6;
    X = value;
    quadratic = 3 * X * X - 8 * X + 4;
    System.out.println("At X = " + X + " the value of the quadratic is " + quadratic);
  }
}