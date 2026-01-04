package com.day2.cabbygo;

public class Sedan extends Vehicle {
	public Sedan (String vehicleNumber) {
		super(vehicleNumber , 4 , "Sedan");
	}
	

	public double getRatePerKm() {
		return 50;
	}
	
	
	

}
