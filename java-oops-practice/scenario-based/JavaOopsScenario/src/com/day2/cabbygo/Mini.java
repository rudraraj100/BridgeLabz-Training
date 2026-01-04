package com.day2.cabbygo;

public class Mini extends Vehicle {
	
	public Mini (String vehicleNumber, int capacity, String type) {
		super(vehicleNumber , capacity , type);
	}
	
	public double getRatePerKm() {
		return 15;
	}

}
