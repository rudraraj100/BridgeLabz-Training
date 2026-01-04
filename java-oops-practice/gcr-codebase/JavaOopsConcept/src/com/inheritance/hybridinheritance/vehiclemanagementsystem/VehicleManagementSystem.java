package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class VehicleManagementSystem {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        ev.displayDetails();
        ev.charge();

        pv.displayDetails();
        pv.refuel();
    }
}

