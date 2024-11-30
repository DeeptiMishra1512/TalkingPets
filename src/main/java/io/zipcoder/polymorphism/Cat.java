package io.zipcoder.polymorphism;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
       // System.out.println(name + " says: Meow!");
        System.out.println(" Meow!");
    }

}
