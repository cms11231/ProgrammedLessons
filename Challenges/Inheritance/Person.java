public class person {
    private String firstName;
    private String lastName;

    public person(){
        this.firstName = "Bobby";
        this.lastName = "Roberts";
    }

    public person(String first, String last){
        this.firstName = first;
        this.lastName = last;
    }

    public String getfirst(){
        return this.firstName;
    }

    public String getlast(){
        return this.lastName;
    }

    public void setName(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public void printLastFirst() {
        System.out.println(lastName + ", " + firstName);
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }

    public void print() {
        System.out.println(this.toString);
    }

    public void copy(Person myDear) {
        this.firstName = myDear.getFirstName();
        this.lastName = myDear.getLastName();
    }

    public Person getCopy() {
        return new Person(firstName, lastName);
    }
    
}