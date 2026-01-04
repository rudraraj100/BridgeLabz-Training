package com.encapsulation.ridehailing;

//Bike ride type
public class Bike extends Vehicle implements GPS {

 private String currentLocation;

 public Bike(String vehicleId, String driverName, double ratePerKm) {
     super(vehicleId, driverName, ratePerKm);
     this.currentLocation = "Unknown";
 }

 // Fare calculation for bike (cheaper)
 @Override
 public double calculateFare(double distance) {
     return getRatePerKm() * distance * 0.9;
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
