package com.encapsulation.vehiclerentalsystem;

import java.util.*;

//Main class to demonstrate polymorphism
public class VehicleRentalSystem {

 public static void main(String[] args) {

     List<Vehicle> vehicles = new ArrayList<>();

     vehicles.add(new Car("MH12AB1234", 2000, "CAR-INS-101"));
     vehicles.add(new Bike("MH14XY5678", 800, "BIKE-INS-202"));
     vehicles.add(new Truck("MH10TR9090", 5000, "TRUCK-INS-303"));

     int days = 5;

     // Polymorphic iteration
     for (Vehicle vehicle : vehicles) {

         double rentalCost = vehicle.calculateRentalCost(days);
         double insurance = 0;

         if (vehicle instanceof Insurable) {
             insurance = ((Insurable) vehicle).calculateInsurance();
         }

         System.out.println(vehicle.getType() + " Rental Cost: ₹" + rentalCost);
         System.out.println("Insurance Cost: ₹" + insurance);
         System.out.println("--------------------------------");
     }
 }
}

