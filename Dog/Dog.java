public class Dog extends Animal{

    public Dog(String name, String breed, int age){
        super(name, breed, age);
    }


    public boolean isHappy() {
        return slept() || eaten() || played();
    }

}