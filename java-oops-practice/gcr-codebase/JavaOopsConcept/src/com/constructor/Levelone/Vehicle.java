package com.constructor.levelone;

public class Vehicle {
	// instance variable
	String ownerName;
	String vehicleType;
	
	// class variable
	static int registrationFee = 2500;
	
	// parameterized constructor
	Vehicle( String ownerName , String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	// instance method
	void vehicleDetails() {
		System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle type      : " + vehicleType);
        System.out.println("Registration fee  : " + registrationFee);
        System.out.println();
	}
	
	// class method to update registration fee
	static void updateRegistrationFee(int newRegistrationFee) {
		registrationFee = newRegistrationFee;
	}

}
