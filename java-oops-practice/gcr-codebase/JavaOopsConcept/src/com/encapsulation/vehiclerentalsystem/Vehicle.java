package com.encapsulation.vehiclerentalsystem;

//Abstract base class for all vehicles
public abstract class Vehicle {

 // Encapsulated fields
 private String vehicleNumber;
 private String type;
 private double rentalRate; // per day

 // Constructor
 public Vehicle(String vehicleNumber, String type, double rentalRate) {
     this.vehicleNumber = vehicleNumber;
     this.type = type;
     this.rentalRate = rentalRate;
 }

 // Getter for rental rate
 public double getRentalRate() {
     return rentalRate;
 }

 // Getter for vehicle type
 public String getType() {
     return type;
 }

 // Abstract method to calculate rental cost
 public abstract double calculateRentalCost(int days);
}

