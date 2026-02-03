package com.funtionalinterface.vehiclerentalsystem;
//  Scenario: Cars, bikes, and buses share rent() and returnVehicle()
//  methods.
//  Task: Use interface-based design.

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Car> carList = new ArrayList<>();
		List<Bikes> bikesList = new ArrayList<>();
		List<Bus> busList = new ArrayList<>();
		
		carList.add(new Car("AC","Innova"));
		carList.add(new Car("Non-AC","Ms800"));
		carList.add(new Car("AC","Creata"));
		
		bikesList.add(new Bikes("Sport","Rs300"));
		bikesList.add(new Bikes("Mileage","Splendar"));
		bikesList.add(new Bikes("Sport","R-ducati"));
		
		busList.add(new Bus("AC","Coach"));
		busList.add(new Bus("Non-AC","Mini"));
		
		
		carList.get(0).rent();
		carList.get(1).rent();
		carList.get(2).rent();
		carList.get(2).returnVehicle();
		carList.get(2).rent();
		carList.get(1).rent();
		
		busList.get(0).rent();
		busList.get(0).returnVehicle();
		
		bikesList.get(0).rent();
		bikesList.get(2).rent();
		
		
		
		
		
		
		
		
		
		
	}

}
