/*
An athlete runs in a triangular park with sides provided as input by the user in meters. 
If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/

import java.util.*;

public class TriangularPark{
	
	// Method to calculate total round
	public static int calculateRound(double sOne , double sTwo , double sThree){
		
		double perimeter = sOne + sTwo + sThree;
		double distance = 5000;
		int rounds = (int)(distance/perimeter); 
		
			if(distance % perimeter != 0){
				return rounds++;
			}
		
		return rounds;
		
	}

    public static void main(String[] args){
		// Accepting the input of three sides
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght1 of traingle's side: ");
		double sOne = sc.nextDouble();
		
		System.out.println("Enter the lenght2 of traingle's side: ");
		double sTwo = sc.nextDouble();
		
		System.out.println("Enter the lenght3 of traingle's side: ");
		double sThree = sc.nextDouble();
		
		int rounds = calculateRound(sOne , sTwo , sThree);
		
		// Display the result
		System.out.println("Total rounds to complete 5km: " + rounds);
		// Close scanner
		sc.close();
	}	
}	
	
	
		