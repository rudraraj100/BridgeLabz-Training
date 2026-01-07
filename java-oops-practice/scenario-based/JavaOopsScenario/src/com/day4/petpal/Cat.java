package com.day4.petpal;

class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void feed() {
        changeHunger(-15);
        System.out.println(name + " ate quietly ");
    }

    @Override
    public void play() {
        changeEnergy(-10);
        changeHunger(5);
        System.out.println(name + " chased a laser ");
    }

    @Override
    public void sleep() {
        changeEnergy(+40);
        System.out.println(name + " is napping ");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
