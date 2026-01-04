package com.encapsulation.ridehailing;

import java.util.*;

//Main class demonstrating polymorphism
public class RideHailingApp {

 // Polymorphic fare calculation method
 public static void calculateRideFare(List<Vehicle> vehicles, double distance) {

     for (Vehicle vehicle : vehicles) {

         vehicle.getVehicleDetails();
         System.out.println("Distance: " + distance + " km");
         System.out.println("Fare: ₹" + vehicle.calculateFare(distance));
         System.out.println("--------------------------------");
     }
 }

 public static void main(String[] args) {

     List<Vehicle> vehicles = new ArrayList<>();

     vehicles.add(new Car("CAR101", "Ramesh", 15));
     vehicles.add(new Bike("BIKE202", "Amit", 10));
     vehicles.add(new Auto("AUTO303", "Suresh", 12));

     calculateRideFare(vehicles, 8);
 }
}
