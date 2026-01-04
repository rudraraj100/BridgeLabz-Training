package com.inheritance.singleinheritance.smarthomedevice;

public class Thermostat extends Device {
	
	int temperatureSetting;
	
	
	public Thermostat(String deviceId , String status , int temperatureSetting) {
		super(deviceId , status);
		this.temperatureSetting = temperatureSetting;
	}
	void displayStatus() {
		super.displayStatus();
        System.out.println("temperatureSetting: " + temperatureSetting); 
        
	}    
	

}
