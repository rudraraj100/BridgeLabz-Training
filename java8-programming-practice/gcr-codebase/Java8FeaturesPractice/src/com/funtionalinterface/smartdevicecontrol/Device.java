package com.funtionalinterface.smartdevicecontrol;

public class Device implements Operation {
	
	private String name;

	public Device(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void turnOn() {
		
		
	}

	@Override
	public void turnOff() {
		
		
	}
	
	
}

