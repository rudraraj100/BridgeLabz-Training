/*
Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/

import java.util.Scanner;

public class BusRouteTracker{
	public static void main(String[] args){

	// Taking input
	Scanner sc = new Scanner(System.in);
	System.out.println("Bus started broom..broom....");
	int stop = 1, user = 1;
	float totalDistance = 0, distance = 0;
	int choice = 1;
		
	// Running system on mutiple user and gives key to stop system to conductor
		while(choice == 1){
			stop = 1;
			while(user == 1){
			System.out.print("Stop " + stop + " arrived, ");
			float randDistance = (int)(Math.random() * 91) + 10;
			System.out.println("Distance of Stop " + stop + " is " + randDistance);
	
			distance += randDistance;
			stop++;
			System.out.println("For next stop [1] or [0] for exit");
			user = sc.nextInt();
			}

		System.out.println("Total distance travelled by user = " + distance);
		System.out.println("Is there any other passenger? yes[1] or NO[0]");
		user = 1; stop = 0;
		
		choice = sc.nextInt();
		}
	// scanner close	
	sc.close();

	}

}