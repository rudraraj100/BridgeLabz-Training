package com.encapsulation.vehiclerentalsystem;

//Bike vehicle with insurance
public class Bike extends Vehicle implements Insurable {

 // Sensitive field (encapsulated)
 private String insurancePolicyNumber;

 public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
     super(vehicleNumber, "Bike", rentalRate);
     this.insurancePolicyNumber = policyNumber;
 }

 // Rental cost calculation for bike
 @Override
 public double calculateRentalCost(int days) {
     return getRentalRate() * days;
 }

 // Insurance calculation for bike
 @Override
 public double calculateInsurance() {
     return getRentalRate() * 0.08;
 }

 @Override
 public String getInsuranceDetails() {
     return "Bike Insurance Applied";
 }
}
