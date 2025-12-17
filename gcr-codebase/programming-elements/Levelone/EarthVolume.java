/*
Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
*/

// Class EarthVolume represents calculation of Earth's volume
public class EarthVolume{
   public static void main(String[] args){
      
	  // Radius of Earth in kilometers and Convert radius from kilometers to miles
	  double radiusKm = 6378;
	  double radiusMil = radiusKm * 0.6;
	  
	   // Calculate volume in cubic kilometers and miles using sphere formula
	  double volumeInKm = (4.0/3) * 3.14 * Math.pow(radiusKm, 3);
	  double volumeInMil = (4.0/3) * 3.14 * Math.pow(radiusMil, 3);
	  
	  
	  // Display the calculated volumes
	  System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + " and cubic miles is " + volumeInMil);
	}
}	