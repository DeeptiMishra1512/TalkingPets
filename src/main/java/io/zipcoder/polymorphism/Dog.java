package io.zipcoder.polymorphism;

public class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }
@Override
    public void speak(){
    //System.out.println(name + " says: Woof!");
    System.out.println(" Woof!");
    }

}
