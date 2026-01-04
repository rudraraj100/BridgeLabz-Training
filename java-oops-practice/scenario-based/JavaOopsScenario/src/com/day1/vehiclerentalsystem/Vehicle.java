package com.day1.vehiclerentalsystem;

class Vehicle {
    protected String vehicleId;
    protected double baseRate; // protected for subclass access

    Vehicle(String vehicleId, double baseRate) {
        this.vehicleId = vehicleId;
        this.baseRate = baseRate;
    }

    // Encapsulation
    public String getVehicleId() {
        return vehicleId;
    }

    public double getBaseRate() {
        return baseRate;
    }

    // Polymorphism
    double calculateRent(int days) {
        return baseRate * days;
    }
}

