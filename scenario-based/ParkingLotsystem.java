/*
Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
*/

import java.util.Scanner;

public class ParkingLotsystem{
	
	public static void main(String[] args){
		// Scanner object to take user input
		Scanner sc = new Scanner(System.in);
		// Total number of parking slots
		int n = 20;
		// Boolean array to track parking slots
		boolean[] parking = new boolean[n];
	
		
		// Counter to track number of parked vehicles
		int count = 1;
		// Loop continues until parking lot is full
		while(count < 20){
			System.out.println("Choose one: Park, Exit, Occupancy");
			String opt = sc.next().trim().toLowerCase();
			// Switch-case for menu selection
			switch(opt){
				// Case to park a vehicle
				case "park" : 
							System.out.println("Choose between 1 to 20 Slots.");
							int slot = sc.nextInt();
							
							if(parking[slot-1] == true){
								System.out.println("This slot is already occupied");
								
								
							}else{	
								System.out.println("Your vehcile is parked");
								parking[slot-1] = true;
								count++;
							}
							break;
				
				 // Case to exit a vehicle
				case "exit" : 
							System.out.println("Please tell me your slot number: ");
							slot = sc.nextInt();
							parking[slot-1] = false;
							System.out.println("You can leave now, Thank you for visiting.");
							count--;
							break;
						
				
				// Case to show occupied slots
				case "occupancy" : 
							System.out.println("Below are occupied slots: ");
							for(int i = 1 ; i <= n ; i++){
								if(parking[i-1] == true){
									System.out.print( i + " ");
									System.out.println();
								}
									
							}break;	
				
			}	
		}
		// Message when parking lot is full
		System.out.println("All slots are occupied");
	}
}

	