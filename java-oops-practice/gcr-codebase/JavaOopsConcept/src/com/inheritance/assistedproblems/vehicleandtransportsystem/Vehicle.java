package com.inheritance.assistedproblems.vehicleandtransportsystem;

public class Vehicle {

	int maxxSpeed;
	String fuelType;
	
	public Vehicle() {
		
	}
	
	public Vehicle (int maxxSpeed ,String fuelType) {
		this.maxxSpeed = maxxSpeed;
		this.fuelType = fuelType;
	}
	
	void displayInfo() {
		System.out.println("maxx speed:  " + maxxSpeed);
		System.out.println("fuel type:   " + fuelType);
		
	}
}
