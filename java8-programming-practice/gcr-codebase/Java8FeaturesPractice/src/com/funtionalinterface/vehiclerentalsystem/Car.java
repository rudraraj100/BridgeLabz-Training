package com.funtionalinterface.vehiclerentalsystem;

public class Car implements Rentable{

	private static int count = 0;
	private String type;
	private String name; 
	
	public Car(String type, String name) {
		this.type = type;
		this.name = name;
		count++;
	}

	@Override
	public void rent() {
		if(count != 0) {
			System.out.println(name + " " + type + " car is rented.");
			count--;
		}else{
			System.out.println(name + " car is already booked.");
		}
		
	}

	@Override
	public void returnVehicle() {
		System.out.println(name + " car is returned to base");
		count++;
		
	}
	
	

}
