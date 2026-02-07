package com.multithreading.restaurantorderingprocess;

import java.time.LocalTime;

public class Chefs extends Thread {
	
	
	private String dish;
	private final int totalTimeSeconds;
	
	

	public Chefs(String chefName, String dish, int totalTimeSeconds) {
		super(chefName);
		this.dish = dish;
		this.totalTimeSeconds = totalTimeSeconds;
	}



	@Override
	public void run() {
		
		String chefName = getName();
		
		try {
			
			long totalTimeInMl = totalTimeSeconds * 1000;
			long sleepPerStep = totalTimeInMl/4;
			
			System.out.println(LocalTime.now()+ " : " + chefName + " started preparing " + dish);
			
			Thread.sleep(sleepPerStep);
			System.out.println(LocalTime.now()+ " : " + chefName + " preparing " + dish + ": 25% complete");
			
			Thread.sleep(sleepPerStep);
			System.out.println(LocalTime.now()+ " : " + chefName + " preparing " + dish + ": 50% complete");
			
			Thread.sleep(sleepPerStep);
			System.out.println(LocalTime.now()+ " : " + chefName + " preparing " + dish + ": 75% complete");
			
			Thread.sleep(sleepPerStep);
			System.out.println(LocalTime.now()+ " : " + chefName + " preparing " + dish + ": 100% complete");
			
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}
	
	
	
	

}
