/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  
Please define static methods for all the UnitConvertor class methods. 
*/

import java.util.Scanner;

public class UnitConverterTwo{
    // Method to convert into desired unit
	public static double distanceUnitConvertor(double value , String unit){
	
		if (unit.equalsIgnoreCase("yards")) {
            return value * 3; // yards to feet
        } else if (unit.equalsIgnoreCase("feet")) {
            return value * 0.333333;  // feet to yards
        } else if (unit.equalsIgnoreCase("meter")) {
            return value * 39.3701;  // meter to inches
        } else if (unit.equalsIgnoreCase("inches")) {
            return value * 0.0254;   // inches to meter
        } else if (unit.equalsIgnoreCase("inches")) {
            return value * 2.54;   // inches to cm
		}else {
            System.out.println("Invalid unit");
            return 0;
        }
    }
	public static void main(String[] args){
	     // Accepting input and read through scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value: ");
		double value = sc.nextDouble();
		
		System.out.println("Enter the unit(yards, feet, meter, inches): ");
		String unit = sc.next();
		
		
		
		double converted = distanceUnitConvertor(value , unit);
		
		String nUnit;
		
		if (unit.equalsIgnoreCase("yards")){
			 nUnit = "feet";
		}else if (unit.equalsIgnoreCase("feet")){
			 nUnit = "yards";
		}else if (unit.equalsIgnoreCase("meter")){
			 nUnit = "inches";
		}else if (unit.equalsIgnoreCase("inches")){
			 nUnit = "Meter";
		}else if (unit.equalsIgnoreCase("inches")){
			 nUnit = "cm";
		}else{
			 nUnit = "invalid";	
		}	
		
		// Display result
		System.out.println("The converted distance " + converted + nUnit);
		
		// Close Scanner
		sc.close();
	}
}	