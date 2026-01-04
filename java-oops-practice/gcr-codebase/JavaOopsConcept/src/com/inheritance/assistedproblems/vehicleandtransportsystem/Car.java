package com.inheritance.assistedproblems.vehicleandtransportsystem;

public class Car extends Vehicle {
	
	int seatCapacity;
	
	public Car (int seatCapacity){
		this.seatCapacity = seatCapacity;
			
	}
	
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Total seats: " + seatCapacity);
	}

}
