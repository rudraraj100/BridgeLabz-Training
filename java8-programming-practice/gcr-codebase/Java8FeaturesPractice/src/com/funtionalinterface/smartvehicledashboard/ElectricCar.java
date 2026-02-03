package com.funtionalinterface.smartvehicledashboard;
class ElectricCar implements Vehicle {

    private int batteryPercentage;

    public ElectricCar(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    @Override
    public void displaySpeed() {
        System.out.println("Electric Car speed: 100 km/h");
    }

    // Override default method for electric vehicles
    @Override
    public void displayBattery() {
        System.out.println("Battery: " + batteryPercentage + "%");
    }
}
