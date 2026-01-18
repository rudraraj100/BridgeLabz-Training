package com.day6.fleetmanager;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
	
	ArrayList<VehicleData> list = new ArrayList<>();
	
	list.add(new VehicleData("vid104" , 86));
	list.add(new VehicleData("id105" , 96));
	list.add(new VehicleData("id108" , 108));
	list.add(new VehicleData("id110" , 150));
	list.add(new VehicleData("id115" , 180));
	list.add(new VehicleData("id100" , 35));
	list.add(new VehicleData("id120" , 60));
	list.add(new VehicleData("id113" , 55));
	list.add(new VehicleData("id112" , 36));
	
	int n = list.size();
	
	MileageMergeSort.divide(list , 0 , n-1);
	
	for(int i = 0 ; i < n ; i++) {
		
		System.out.print(list.get(i) + " < ");
	}
	
	
	
	
	}
}
