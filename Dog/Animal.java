public class Dog{
    private String name, breed;
    private int age;
    private boolean eaten, slept, played;

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public String getAge() {
        return this.age;
    }

    public void sleep() {
        this.sleep = true;
    }

    public void eat() {
        this.eat = true;
    }

    public void play() {
        this.play = true;
    }

    public boolean eaten(){
        return this.eaten;
    }

    public boolean slept(){
        return this.eaten;
    }

    public boolean played(){
        return this.played;
    }

    public boolean isHappy() {
        isHappy = false;
    }

}