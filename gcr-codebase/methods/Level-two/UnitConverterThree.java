/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  
Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertFarhenheitToCelsius(double farhenheit) => 
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172; 
*/
import java.util.Scanner;

public class UnitConverterThree{
    // Method to convert into desired unit
	public static double distanceUnitConvertor(double value , String unit){
	
		if (unit.equalsIgnoreCase("farhenheit")) {
            return (value - 32) * 5 / 9; // farhenheit to celsius
        } else if (unit.equalsIgnoreCase("celsius")) {
            return (value * 9 / 5) + 32;  // celsius to farhenheit
        } else if (unit.equalsIgnoreCase("pound")) {
            return value * 0.453592;  // pound to kilogram
        } else if (unit.equalsIgnoreCase("kilogram")) {
            return value * 2.20462;   // kilogram to pound
        } else if (unit.equalsIgnoreCase("gallon")) {
            return value * 3.78541;   // gallon to liter
		}else if (unit.equalsIgnoreCase("liter")) {
            return value * 0.264172;   // liter to gallon
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
		
		System.out.println("Enter the unit(farhenheit, celsius, pound, kilogram, gallon, liter): ");
		String unit = sc.next();
		
		
		
		double converted = distanceUnitConvertor(value , unit);
		
		String nUnit;
		
		if (unit.equalsIgnoreCase("farhenheit")){
			 nUnit = "'C";
		}else if (unit.equalsIgnoreCase("celsius")){
			 nUnit = "'F";
		}else if (unit.equalsIgnoreCase("pound")){
			 nUnit = "kilogram";
		}else if (unit.equalsIgnoreCase("kilogram")){
			 nUnit = "pound";
		}else if (unit.equalsIgnoreCase("gallon")){
			 nUnit = "liter";
		}else if (unit.equalsIgnoreCase("liter")){
			 nUnit = "gallon";
		}else{
			 nUnit = "invalid";	
		}	
		
		// Display result
		System.out.println("The converted unit " + converted + nUnit);
		
		// Close scanner
		sc.close();
	}
}	