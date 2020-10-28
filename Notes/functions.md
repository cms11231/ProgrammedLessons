giving a name to a process

abstracting

<--------------------------------------------------->
concrete                                        abstract
  - low level                                      - high level
  - specific                                       - low detail

allows us to change solutions easily

inputs ---> function ---> outputs
               - A fast but a lot of memory
               - B slow but low memory
               - you can choose different solutions



Method Signature
description -> privacy static returntype name (parameters, type name, int)
example -> privacy(public, protected, private) static String doStuff


commands never have an output
query has an output





Next level of abstraction:
ex:
int x = 0;
public fun1(){x = 0}
public fun2(){if (x == 0)}
public fun3()
^put in a class


public class car{
    What to think about: data(varioables)? abilities(methods)?
    //data
    String make;
    int mileage = 0;
    int year;
    boolean isAutomatic;

    //abilities
    public void drive(int miles){}
    public int getMileage(){return mileage;}
    public void setMake(String make){
        this make = make;
    }
}

Car car = new Car();
Car car3 = new Car("Ford");


}
