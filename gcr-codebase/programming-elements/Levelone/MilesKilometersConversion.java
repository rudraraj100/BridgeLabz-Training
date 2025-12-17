/*
Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles i
*/

// Class MilesKilometersConversion represents distance conversion
public class MilesKilometersConversion{
   public static void main(String[] args){
      
	  
	  // Store distance in kilometers and convert into miles using conversion factor
	  double distanceKilometers = 10.8;
	  double distanceMiles = distanceKilometers * 1.6;
	  
	  
	  // Display the converted distance
	  System.out.println("The distance 10.8km in miles: " + distanceMiles);
	}
}	