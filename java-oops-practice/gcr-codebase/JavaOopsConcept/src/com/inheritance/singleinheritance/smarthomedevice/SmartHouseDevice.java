package com.inheritance.singleinheritance.smarthomedevice;

public class SmartHouseDevice {

	public static void main(String[] args) {
		
		Device bulb = new Thermostat("123" , "on" , 20 );
		
		bulb.displayStatus();
		

	}

}
