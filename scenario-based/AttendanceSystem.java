/*
School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

import java.util.Scanner;

public class AttendanceSystem{
	
	public static void main(String[] args){
		// Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		// Array to store names of 10 students
		String[] students = new String[10];
		
		 // Input student names
		System.out.println("Registered 10 students names.");
		
		for(int i = 0 ; i < students.length ; i++){
			System.out.print((i+1) + " no. Student: ");
			students[i] = sc.nextLine();
		}
		// Counters to track attendance
		int absent = 0;
		int present = 0;
		for(String student : students){
			// Ask attendance status for current student
			System.out.println("Is " + student + " present or absent?");
			String status = sc.nextLine().trim().toLowerCase();
			
			// Check attendance status
			if(status.equalsIgnoreCase("present")){
				present++;
			}else{
				absent++;
			}
		}
		// Display final attendance summary
		System.out.println("Total present students: " + present);
		System.out.println("Total absent students: " + absent);
		
		sc.close();
	}
}	
			
			
		