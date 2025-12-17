/*
Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
I/P => NONE
O/P => Harry's age in 2024 is
*/

// Class HarryAge represents age calculation
public class HarryAge{
   public static void main(String[] args){
      
	
	 // Store Harry's birth year and the current year
	 int harryBirthYear =  2000;
	 int currentYear = 2024;
	 
     // Calculate age by subtracting birth year from current year
	 int harryAge = (currentYear - harryBirthYear);
	 
	 
	 // Display Harry's age
	 System.out.println("Harry's age in " + currentYear + " is " + harryAge);
	 
	}
}	
	 