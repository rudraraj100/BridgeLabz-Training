package com.day1.vehiclerentalsystem;

class Bike extends Vehicle implements Rentable {

    Bike(String vehicleId) {
        super(vehicleId, 300); // fixed base rate for bikes
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days; 
    }
}

