package com.day5.parkease;
public class Bike extends Vehicle {

    public Bike() {
        super(20);
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = (hours > 6) ? 50 : 0;
        return (baseRate * hours) + penalty;
    }
}
