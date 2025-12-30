/*
Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LibraryApp{

	public static void main(String[] args){
		// scanner class
		Scanner sc = new Scanner(System.in);
		
		long totalFine = 0;
		// datetimeformatter to set formate
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		// loop to get due and return time for 5 books
		for(int i = 1 ; i <= 5 ; i++ ){
		
			System.out.println("Enter the due date(dd-MM-yyyy) for book " + i);
			LocalDate dueDate = LocalDate.parse(sc.nextLine() , formatter);
		
			System.out.println("Enter the return date(dd-MM-yyyy)");
			LocalDate returnDate = LocalDate.parse(sc.nextLine() , formatter);
		
			long lateDays = ChronoUnit.DAYS.between(dueDate , returnDate);
		
			if(lateDays > 0){
				long fine = lateDays * 5;
				totalFine += fine;
				System.out.println("Late by " + lateDays + " days. Fine: " + fine);
            } else {
                System.out.println("Returned on time. No fine");
            }
				
		}	
		// display total fines
		System.out.println("The total late fines for 5 books: " + totalFine);
		
		sc.close();
	}
}	