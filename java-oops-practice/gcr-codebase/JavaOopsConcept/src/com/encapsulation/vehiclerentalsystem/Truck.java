package com.encapsulation.vehiclerentalsystem;

//Truck vehicle with insurance
public class Truck extends Vehicle implements Insurable {

 // Sensitive field (encapsulated)
 private String insurancePolicyNumber;

 public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
     super(vehicleNumber, "Truck", rentalRate);
     this.insurancePolicyNumber = policyNumber;
 }

 // Rental cost calculation for truck
 @Override
 public double calculateRentalCost(int days) {
     return (getRentalRate() * days) + 2000; // additional heavy vehicle charge
 }

 // Insurance calculation for truck
 @Override
 public double calculateInsurance() {
     return getRentalRate() * 0.20;
 }

 @Override
 public String getInsuranceDetails() {
     return "Truck Insurance Applied";
 }
}

