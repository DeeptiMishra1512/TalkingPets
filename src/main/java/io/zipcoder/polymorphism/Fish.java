package io.zipcoder.polymorphism;

public class Fish extends Pet{

    public Fish(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(" Bloop!");
    }
}
