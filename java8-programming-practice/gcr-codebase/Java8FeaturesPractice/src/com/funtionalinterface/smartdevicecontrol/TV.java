package com.funtionalinterface.smartdevicecontrol;

public class TV extends Device{

	public TV(String name) {
		super("TV");
		
	}
	@Override
	
	public void turnOn() {
		System.err.println(getName() + " is on.");
	
	}
	
	public void turnOff() {
		System.err.println(getName() + " is off.");
		
	}
	
	
}