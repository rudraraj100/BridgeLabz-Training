package com.day4.petpal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pet pet = null;

        System.out.println("🐾 Welcome to PetPal");
        System.out.print("Choose pet type (Dog / Cat / Bird): ");
        String choice = sc.next();

        System.out.print("Enter pet name: ");
        String name = sc.next();

        System.out.print("Enter pet age: ");
        int age = sc.nextInt();

        // User-defined object creation
        if (choice.equalsIgnoreCase("Dog")) {
            pet = new Dog(name, age);
        } else if (choice.equalsIgnoreCase("Cat")) {
            pet = new Cat(name, age);
        } else if (choice.equalsIgnoreCase("Bird")) {
            pet = new Bird(name, age);
        } else {
            System.out.println("Invalid pet type");
            return;
        }

        pet.showStatus();
        pet.makeSound();
        pet.feed();
        pet.play();
        pet.sleep();
        

        sc.close();
    }
}

