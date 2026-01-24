package com.day10.hospitalmanagement;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		
		Node root = null;
		Patient e1 = new Patient("Rocky", LocalTime.parse("12:24", formatter));
		Patient e2 = new Patient("Swati" , LocalTime.parse("10:04", formatter));
		Patient e3 = new Patient("Shanker" , LocalTime.parse("13:10", formatter));
		Patient e4 = new Patient("Kohli" , LocalTime.parse("11:20", formatter));
		
		root = Node.insert(root, e1);
		root = Node.insert(root, e2);
		root = Node.insert(root, e3);
		root = Node.insert(root, e4);
		
		int option;
		
		do {
			
			System.out.println("\n1: Register new patient \n2: Display all patients \n3: Discharge the patient \n4: Exit");
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
				
				case 1:
					
					System.out.println("Enter the name of Patient");
					String name = sc.nextLine();
					
					System.out.println("Enter the check in time: (hh/mm)");
					LocalTime time = LocalTime.parse(sc.nextLine(), formatter);
					
					Patient p = new Patient(name, time);
					root = Node.insert(root, p);
					break;
					
				case 2:
					
					
					System.out.println("------Displaying all patients-------");
					System.out.println("InTime | Name");
					Node.display(root);
					break;
					
				case 3:
					
					System.err.println("Enter the Patient name");
					String patientR = sc.nextLine();
					root = Node.delete(root, patientR);
					
					System.err.println(patientR + " is discharged.");
					break;
				case 4:	
					break;
					
				default:
					System.out.println("Invalid input, try again.");
			}
		}while(option != 4);
		
		sc.close();

	}
}


