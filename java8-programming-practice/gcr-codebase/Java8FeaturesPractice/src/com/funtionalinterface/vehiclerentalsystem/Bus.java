package com.funtionalinterface.vehiclerentalsystem;

public class Bus implements Rentable {
	private static int count = 0;
	private String type;
	private String name; 
	
	public Bus(String type, String name) {
		this.type = type;
		this.name = name;
		count++;
	}

	@Override
	public void rent() {
		if(count != 0) {
			System.out.println(name + " " + type + " Bus is rented.");
			count--;
		}else{
			System.out.println(name + " bus is already booked.");
		}
		
	}

	@Override
	public void returnVehicle() {
		
		System.out.println(name + " bus is returned to base");
		count++;
		
	}
	
	

}


