package com.inheritance.assistedproblems.vehicleandtransportsystem;

public class Motorcycle extends Vehicle {
	
	String type;
	
	public Motorcycle(String type) {
		this.type = type;
	}
	
	@Override
	void displayInfo() {
		System.out.println("This is a bike");
		System.out.println("type: " + type);
	}

	
}
