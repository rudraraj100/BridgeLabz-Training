package com.encapsulation.ridehailing;

//Car ride type
public class Car extends Vehicle implements GPS {

 private String currentLocation;

 public Car(String vehicleId, String driverName, double ratePerKm) {
     super(vehicleId, driverName, ratePerKm);
     this.currentLocation = "Unknown";
 }

 // Fare calculation for car
 @Override
 public double calculateFare(double distance) {
     return getRatePerKm() * distance;
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
