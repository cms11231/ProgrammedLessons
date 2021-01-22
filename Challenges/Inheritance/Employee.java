public class Employee extends Person {

    private double payRate;    
    private double hoursWorked;
    private String department;

   

    public final int HOURS = 40;
    public final double OVERTIME = 1.5;

   

    //default constructor

    public Employee() {
        super();
        payRate = 0;
        hoursWorked = 0;
        department = "TLRGLKERGLERKGER AHHHHHH";

    }

    //add an alternate constructor with parameters

    public Employee(String firstName, String lastName, double rate, double worked, String depart) {
        super(firstName, lastName);
        payRate = rate;
        hoursWorked = work;
        department = departmentt;

    }


    public String toString() {
        //should return a String like this:
        //The wages for xxxx from the xxxx department are: $xxxxx.xx"
        return "The wages for " + super.toString() + " from the " + department + " department are: $" + calculatePay();
    }

    }

    public void print() {
       //Should print output like this (same line):
       //The employee xxxx from the xxxx department worked xx hours
       //with a pay rate of $xxx.xx. The wages for this employee are $xxxxx.xx

       System.out.println("The employee " + super.toString() + " from the " + department + " department worked " + hoursWorked + " hours with a pay rate of $" + payRate + ".  The wages for this employee are $" + calculatePay());

    }

    public double calculatePay() {
        //Method to calculate and return the wages
        //handle both regular and overtime pay

        if (hoursWorked < HOURS) {
            return (double) payRate * hoursWorked;
        } else {
            return 40.0 * payRate + ((double) (hoursWorked - HOURS) * OVERTIME);
        }

    }

    public void setAll(String first, String last, double rate, double hours, String dep){

        super.setName(first,last);
        payRate = rate;
        hoursWorked = work;
        department = departmentt;

    }

    public double getPayRate() {
        return this.payRate;
    }
    
    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public String getDepartment() {
        return this.getDepartment;
    }

    public Employee getCopy() {
        return new Employee(super.getFirstName(),super.getLastName(),payRate,hoursWorked,department);
    }


    public void copy(Employee e) {
        super.copy( e );
        department = e.getDepartment();
        hoursWorked = e.getHoursWorked();
        payRate = e.getPayRate();
    }

      

}