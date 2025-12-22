/*
Extend or Create a UnitConvertor utility class similar to the one 
shown in the notes to do the following.  
Please define static methods for all the UnitConvertor class methods.
Method To convert kilometers to miles and return the value. 
Use the following code  double km2miles = 0.621371;
Method to convert miles to kilometers and return the value. 
Use the following code  double miles2km = 1.60934;
Method to convert meters to feet and return the value. 
Use the following code to convert  double meters2feet = 3.28084;
Method to convert feet to meters and return the value. 
Use the following code to convert  double feet2meters = 0.3048;
*/
import java.util.Scanner;

public class UnitConverter{
    // Method to convert into desired unit
	public static double distanceUnitConvertor(double value , String unit){
	
		if (unit.equalsIgnoreCase("km")) {
            return value * 0.621371; // km → miles
        } else if (unit.equalsIgnoreCase("miles")) {
            return value * 1.60934;  // miles → km
        } else if (unit.equalsIgnoreCase("meter")) {
            return value * 3.28084;  // meter → feet
        } else if (unit.equalsIgnoreCase("feet")) {
            return value * 0.3048;   // feet → meter
        } else {
            System.out.println("Invalid unit");
            return 0;
        }
    }
	public static void main(String[] args){
	    // Accepting input and read through scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value: ");
		double value = sc.nextDouble();
		
		System.out.println("Enter the unit(km, miles, meter, feet): ");
		String unit = sc.next();
		
		
		
		double converted = distanceUnitConvertor(value , unit);
		
		String nUnit;
		
		if (unit.equalsIgnoreCase("km")){
			 nUnit = "miles";
		}else if (unit.equalsIgnoreCase("miles")){
			 nUnit = "km";
		}else if (unit.equalsIgnoreCase("meter")){
			 nUnit = "feet";
		}else if (unit.equalsIgnoreCase("feet")){
			 nUnit = "Meter";
		}else{
			 nUnit = "invalid";	
		}	
		
		// Display result
		System.out.println("The converted distance " + converted + nUnit);
		
		// Close scanner
		sc.close();
	}
}	