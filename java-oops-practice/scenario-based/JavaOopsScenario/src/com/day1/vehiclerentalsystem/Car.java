package com.day1.vehiclerentalsystem;

class Car extends Vehicle implements Rentable {

    Car(String vehicleId) {
        super(vehicleId, 800);
    }

    @Override
    public double calculateRent(int days) {
        double insuranceFee = 200;
        return (baseRate * days) + insuranceFee;
    }
}

