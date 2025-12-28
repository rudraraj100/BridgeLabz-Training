package com.constructor.levelone;

public class VehicleMain {
	// main method to test class vehicle
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Rudra" , "2W");
		Vehicle v2 = new Vehicle("Rishav" , "2W");
		
		v1.vehicleDetails();
		
		Vehicle.updateRegistrationFee(2000);
		v2.vehicleDetails();

	}

}
