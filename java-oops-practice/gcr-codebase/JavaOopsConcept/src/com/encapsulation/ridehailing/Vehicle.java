package com.encapsulation.ridehailing;

//Abstract base class for all ride vehicles
public abstract class Vehicle {

 // Encapsulated vehicle & driver details
 private String vehicleId;
 private String driverName;
 private double ratePerKm;

 // Constructor
 public Vehicle(String vehicleId, String driverName, double ratePerKm) {
     this.vehicleId = vehicleId;
     this.driverName = driverName;
     this.ratePerKm = ratePerKm;
 }

 // Protected getter for rate
 protected double getRatePerKm() {
     return ratePerKm;
 }

 // Concrete method to display vehicle details
 public void getVehicleDetails() {
     System.out.println("Vehicle ID: " + vehicleId);
     System.out.println("Driver Name: " + driverName);
 }

 // Abstract method to calculate fare
 public abstract double calculateFare(double distance);
}
