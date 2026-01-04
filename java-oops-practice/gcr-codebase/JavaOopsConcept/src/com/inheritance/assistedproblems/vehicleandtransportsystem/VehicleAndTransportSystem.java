package com.inheritance.assistedproblems.vehicleandtransportsystem;


public class VehicleAndTransportSystem {

	public static void main(String[] args) {
		
	
		Vehicle v = new Vehicle(100 , "petrol");
		Vehicle bike = new Motorcycle("sport");
		bike.displayInfo();

		Vehicle car = new Car(5);
		car.displayInfo();
		
		v.displayInfo();
		

	}

}
