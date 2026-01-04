package com.encapsulation.ridehailing;

//Auto ride type
public class Auto extends Vehicle implements GPS {

 private String currentLocation;

 public Auto(String vehicleId, String driverName, double ratePerKm) {
     super(vehicleId, driverName, ratePerKm);
     this.currentLocation = "Unknown";
 }

 // Fare calculation for auto with base charge
 @Override
 public double calculateFare(double distance) {
     return (getRatePerKm() * distance) + 20;
 }

 @Override
 public String getCurrentLocation() {
     return currentLocation;
 }

 @Override
 public void updateLocation(String location) {
     this.currentLocation = location;
 }
}
