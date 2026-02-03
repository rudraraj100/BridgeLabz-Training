package com.funtionalinterface.vehiclerentalsystem;

public class Bikes implements Rentable{
	
	private static int count = 0;
	private String type;
	private String name; 
	
	public Bikes(String type, String name) {
		this.type = type;
		this.name = name; 
		count++;
	}

	@Override
	public void rent() {
		if(count != 0) {
			System.out.println(name + " " + type + " bike is rented.");
			count--;
		}else{
			System.out.println(name + " bike is already booked.");
		}
		
	}

	@Override
	public void returnVehicle() {
		System.out.println(name + " bike is returned to base");
		count++;
		
	}
	
	

}

