package com.day1.vehiclerentalsystem;

public class VehicleRentalApp {
    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Rohit");

        Rentable bike = new Bike("B101");
        Rentable car = new Car("C202");
        Rentable truck = new Truck("T303");

        System.out.println(c1.getCustomerDetails());

        // Polymorphic rent calculation
        System.out.println("Bike Rent (3 days): ₹" + bike.calculateRent(3));
        System.out.println("Car Rent (3 days): ₹" + car.calculateRent(3));
        System.out.println("Truck Rent (3 days): ₹" + truck.calculateRent(3));
    }
}