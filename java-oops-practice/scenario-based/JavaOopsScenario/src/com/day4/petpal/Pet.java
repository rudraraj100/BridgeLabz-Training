package com.day4.petpal;

import java.util.Random;

abstract class Pet implements IInteractable {
    protected String name;
    protected String type;
    protected int age;

    // Encapsulated fields
    private int hunger;   // 0 (full) → 100 (very hungry)
    private int energy;   // 0 (tired) → 100 (energetic)
    private String mood;

    // Constructor with random default values
    public Pet(String name, String type, int age) {
        Random r = new Random();
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = r.nextInt(50);
        this.energy = r.nextInt(50) + 50;
        updateMood();
    }

    // User-defined constructor
    public Pet(String name, String type, int age, int hunger, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        updateMood();
    }

    // Encapsulation: internal logic hidden
    private void updateMood() {
        if (hunger > 70) mood = "Hungry ";
        else if (energy < 30) mood = "Tired ";
        else mood = "Happy ";
    }

    protected void changeHunger(int value) {
        hunger += value;
        if (hunger < 0) hunger = 0;
        if (hunger > 100) hunger = 100;
        updateMood();
    }

    protected void changeEnergy(int value) {
        energy += value;
        if (energy < 0) energy = 0;
        if (energy > 100) energy = 100;
        updateMood();
    }

    public void showStatus() {
        System.out.println("\n🐾 Pet Status");
        System.out.println("Name   : " + name);
        System.out.println("Type   : " + type);
        System.out.println("Age    : " + age);
        System.out.println("Mood   : " + mood);
    }

    // Polymorphic method
    public abstract void makeSound();
}

