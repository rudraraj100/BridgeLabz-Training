package com.funtionalinterface.smartdevicecontrol;

public class AC extends Device{
	
	public AC(String name) {
		super("AC");
		
	}
	@Override
	
	public void turnOn() {
		System.err.println(getName() + " is on.");
	
	}
	
	public void turnOff() {
		System.err.println(getName() + " is off.");
		
	}
	
	
}

