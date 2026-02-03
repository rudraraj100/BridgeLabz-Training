package com.funtionalinterface.backgroundjob;

//Scenario: Execute tasks asynchronously.
// ○ Task: Use Runnable functional interface.


public class JobExecution {

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			for(int i = 1 ; i<= 5 ; i++) {
				System.out.println("Hello " + i);
			}
		};
		
		Thread hello = new Thread(runnable);
		hello.run();
		

	}

}
