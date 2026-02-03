package com.funtionalinterface.smartvehicledashboard;
class Car implements Vehicle {

    @Override
    public void displaySpeed() {
        System.out.println("Car speed: 80 km/h");
    }

    // Uses default displayBattery() → does nothing
}

class Bike implements Vehicle {

    @Override
    public void displaySpeed() {
        System.out.println("Bike speed: 60 km/h");
    }

    // Uses default displayBattery() → does nothing
}
