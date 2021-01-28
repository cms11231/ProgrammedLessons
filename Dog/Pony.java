public class Pony extends Animal{

    public boolean hasBeenGroomed = false;
    
    public Pony(String name, String breed, int age, boolean alreadyGroomed){
        super(name, breed, age);

        this.hasBeenGroomed = alreadyGroomed;
    }

    public void groom(){
        this.hasBeenGroomed = true;
    }

    public boolean hasBeenGroomed(){
        return this.hasBeenGroomed;
    }


    public boolean isHappy() {
        return slept() && eaten() && played() && hasBeenGroomed();
    }

}