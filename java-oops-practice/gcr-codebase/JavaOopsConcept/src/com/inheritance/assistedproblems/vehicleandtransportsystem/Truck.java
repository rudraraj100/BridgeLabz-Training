package com.inheritance.assistedproblems.vehicleandtransportsystem;

public class Truck extends Vehicle {
	
	String color = "red";
	
	@Override
	void displayInfo() {
		System.out.println("It is a truck.");
	}

}
