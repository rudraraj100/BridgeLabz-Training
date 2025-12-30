/*
Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.Scanner;

public class TemperatureLogger{
	// method for getting average
	public static double average(double[] temp){
	
		double sum = 0;
		
			for(int i = 0 ; i < temp.length ; i++){
			
				sum += temp[i];
			}
		
		double averageTemp = sum/temp.length;	
		
		return averageTemp;
	}
	// method to get maxx temperature
	public static double maxxTemp(double[] temp){
	
		double maxx = -Double.MIN_VALUE;
		
			for(int i = 0 ; i < temp.length ; i++){
				
				if(temp[i] > maxx ){
					maxx = temp[i];
				}
			}
		return maxx;
	}
	//  method to display result
	public static void displayResult(double averageTemp , double maxx){
		
		System.out.println("The average temperature for last 7 days: " + averageTemp);
		System.out.println();
		System.out.println("The maximum temperature: " + maxx);
	}		
	// main method
	public static void main(String[] args){
		// scanner class
		Scanner sc = new Scanner(System.in);
		
		double[] temp = new double[7];
		
		for(int i = 0 ; i < temp.length ; i++){
		
			System.out.println("What was the temperature on day "+ (i+1) + " in 'C: ");
			temp[i] = sc.nextDouble();
		}
		
		double averageTemp = average(temp);
		
		double maxx = maxxTemp(temp);
		
		displayResult(averageTemp , maxx);
		
		sc.close();
	}
}	
		
		
		