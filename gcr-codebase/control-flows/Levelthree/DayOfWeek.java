/*
Write a program DayOfWeek that takes a date as input and 
prints the day of the week that the date falls on. 
Your program should take three command-line arguments: m (month), d (day), and y (year). 
For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, 
and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
*/
import java.util.Scanner;

// create class DayOfWeek represnts day by giving month, date and year as input
public class DayOfWeek{
   public static void main(String[] args){
      
	  // create scanner class to read input and accept input for month, date and year from user
	  Scanner sc = new Scanner(System.in);
	  
	  int m = Integer.parseInt(args[0]);
	  int d = Integer.parseInt(args[1]);
	  int y = Integer.parseInt(args[2]);
	  
	  // perform some formulas
	  int y0 = y - (14-m)/12;
	  int x = y0 + y0/4 - y0/100 + y0/400;
	  int m0 = m + 12 * ((14-m)/12)-2;
	  int d0 = (d + x + 31 * m0/12) % 7;
	  
		// apply switch to get the day
		switch(d0){
			case 1 :
				System.out.println("Sunday");
				break;
			case 2 :
				System.out.println("Monday");
				break;
			case 3 :
				System.out.println("Tuesday");
				break;
			case 4 :
				System.out.println("Wednesday");
				break;
			case 5 :
				System.out.println("Thrusday");
				break;
			case 6 :
				System.out.println("Friday");
				break;
			case 7 :
				System.out.println("saturday");
				break;	
	    }
		
	  // close scanner stream	
	  sc.close();
	}
}	
		