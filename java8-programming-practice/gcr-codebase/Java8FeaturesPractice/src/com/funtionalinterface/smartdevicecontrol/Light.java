package com.funtionalinterface.smartdevicecontrol;

public class Light extends Device {
	
	public Light(String name) {
		super("Light");
		
	}
	@Override
	public void turnOn() {
		System.err.println(getName() + " is on.");
	
	}
	@Override
	public void turnOff() {
		System.err.println(getName() + " is off.");
		
	}
	
	
}

