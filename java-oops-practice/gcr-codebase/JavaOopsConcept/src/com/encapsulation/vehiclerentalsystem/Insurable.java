package com.encapsulation.vehiclerentalsystem;

//Interface for vehicles that require insurance
public interface Insurable {

 // Calculates insurance cost
 double calculateInsurance();

 // Returns insurance information
 String getInsuranceDetails();
}
