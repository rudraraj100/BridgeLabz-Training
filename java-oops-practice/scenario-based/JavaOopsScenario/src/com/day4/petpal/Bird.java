package com.day4.petpal;

class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void feed() {
        changeHunger(-10);
        System.out.println(name + " pecked seeds ");
    }

    @Override
    public void play() {
        changeEnergy(-20);
        changeHunger(10);
        System.out.println(name + " is flying around ");
    }

    @Override
    public void sleep() {
        changeEnergy(+25);
        System.out.println(name + " is resting ");
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet tweet!");
    }
}
