package com.day5.parkease;
public abstract class Vehicle implements IPayable {

    protected double baseRate;

    // Constructor
    public Vehicle(double baseRate) {
        this.baseRate = baseRate;
    }
}
