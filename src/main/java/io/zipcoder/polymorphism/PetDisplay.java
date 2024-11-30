package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetDisplay {

//    Create a program that asks the user how many pets they have.
//     Once you know how many pets they have, ask them what kind of pet each one is,
//     along with each pet's name. For now your program should just hold onto the user input
//     and print out the list at the end; we'll modify this in part 3.

    List<String> name = new ArrayList<>();
    int count = 0;
    List<Pet> petList = new ArrayList<>();
    Pet pet =null;
    String petType ="";

    /*
### Part 3:
Modify your program from part 1 to use the Pet class and its subclasses.
Keep a list of the pets your user lists and at the end of the program print out a
list of their names and what they say when they speak.
 */

    public void numOfPetAndCount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Pets do you have? ");
        count = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= count; i++) {
            System.out.println("What is the kind of your Pet(Cat/Dog/Fish)" + i);
             petType = scan.nextLine().toLowerCase();

            System.out.println("What is the name of your Pet" + i);
            String petName = scan.nextLine();


            if(petType.equals("dog")){
                pet = new Dog(petName);
            }
            else if(petType.equals("cat")){
              pet = new Cat(petName);
            }
            else if(petType.equals("fish")){
                pet = new Fish(petName);
            }
            petList.add(pet);
        }

        // Print out all the pets' names and what they say
       // System.out.println("\nPetList Size : " + petList.size());
        System.out.println("\nHere are your pets: You have " + count+ " pets!!!!");
        for (int i = 0; i < petList.size(); i++) {
            Pet pet = petList.get(i);
            System.out.print(pet.getName() + " says: ");
            pet.speak();

        }

        scan.close();

    }
}

