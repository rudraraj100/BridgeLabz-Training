package com.day5.parkease;
public class Car extends Vehicle {

    public Car() {
        super(50); // base rate per hour
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = (hours > 5) ? 100 : 0;
        return (baseRate * hours) + penalty;
    }
}
