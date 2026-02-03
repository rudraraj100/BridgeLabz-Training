package com.funtionalinterface.smartdevicecontrol;
// Scenario: All devices (lights, AC, TV) should have turnOn() and turnOff() methods.
// ○ Task: Create an interface and implement it in multiple classes.
public class Main {

	public static void main(String[] args) {
		
		Device d1 = new Light("l1");
		Device d2 = new AC("havel");
		Device d3 = new TV("sony");
		
		d1.turnOn();
		d2.turnOn();
		d3.turnOn();
		
		d3.turnOff();
		d2.turnOff();
		d1.turnOff();

	}

}
