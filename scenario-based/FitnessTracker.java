/*
Sandeep’s Fitness Challenge Tracker 🏋️
Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/

import java.util.Scanner;

public class FitnessTracker{

	public static void main(String[] args){
		// scanner class
		Scanner sc = new Scanner(System.in);
		// declare array for week
		int[] week = new int[7];
		
		// take input for each index
		for(int i = 0 ; i < week.length ; i++){
			System.out.println("Total pushups on day " + (i+1) + ":");
			week[i] = sc.nextInt();
			if(week[i] == 0){
				i--;
				continue;
			}	
				
		}
		int totalPushups = 0;
		int average;	
		for(int n : week ){
				totalPushups += n;
				
		}
		// average pushups
		average = totalPushups/7;
		
		// display result
		System.out.println("The total pushups: " + totalPushups);
		System.out.println("The average " + average);
		
		sc.close();
	}
}	
		
			
			
		