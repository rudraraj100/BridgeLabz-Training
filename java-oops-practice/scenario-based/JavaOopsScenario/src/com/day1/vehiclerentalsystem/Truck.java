package com.day1.vehiclerentalsystem;

class Truck extends Vehicle implements Rentable {

    Truck(String vehicleId) {
        super(vehicleId, 1500);
    }

    @Override
    public double calculateRent(int days) {
        double loadingCharge = 500;
        return (baseRate * days) + loadingCharge;
    }
}
