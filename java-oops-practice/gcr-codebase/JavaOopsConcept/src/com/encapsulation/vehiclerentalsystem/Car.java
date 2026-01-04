package com.encapsulation.vehiclerentalsystem;

//Car vehicle with insurance
public class Car extends Vehicle implements Insurable {

 // Sensitive field (encapsulated)
 private String insurancePolicyNumber;

 public Car(String vehicleNumber, double rentalRate, String policyNumber) {
     super(vehicleNumber, "Car", rentalRate);
     this.insurancePolicyNumber = policyNumber;
 }

 // Rental cost calculation for car
 @Override
 public double calculateRentalCost(int days) {
     return getRentalRate() * days;
 }

 // Insurance calculation for car
 @Override
 public double calculateInsurance() {
     return getRentalRate() * 0.15;
 }

 @Override
 public String getInsuranceDetails() {
     return "Car Insurance Applied";
 }
}

