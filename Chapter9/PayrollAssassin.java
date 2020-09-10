public class PayrollAssassin
{  
  public static void main ( String[] args )  
  {
    long   hoursWorked = 40;    
    double payRate     = 10.0;
    double taxRate = 0.10;    
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}

// the problem is deteced when you try to compile the file. It gives you an error about the variable nto being initiazed.