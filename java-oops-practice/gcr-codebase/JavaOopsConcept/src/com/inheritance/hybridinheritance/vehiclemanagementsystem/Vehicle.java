package com.inheritance.hybridinheritance.vehiclemanagementsystem;

class Vehicle {
    protected String model;
    protected int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayDetails() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

