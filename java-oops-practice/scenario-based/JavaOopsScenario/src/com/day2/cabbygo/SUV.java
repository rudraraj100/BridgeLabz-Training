package com.day2.cabbygo;

public class SUV extends Vehicle {
	
	public SUV (String vehicleNumber, int capacity, String type) {
		super(vehicleNumber , 6 , "SUV");
	}
	

	public double getRatePerKm() {
		return 60;
	}
	

}
