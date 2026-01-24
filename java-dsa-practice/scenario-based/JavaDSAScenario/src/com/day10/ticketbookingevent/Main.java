package com.day10.ticketbookingevent;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		
		Node root = null;
		Event e1 = new Event("Rock Night Live", LocalDate.parse("24/12/2026", formatter));
		Event e2 = new Event("Tech Conference 2026" , LocalDate.parse("24/12/2026", formatter));
		Event e3 = new Event("Stand-up Comedy Show" , LocalDate.parse("24/12/2026", formatter));
		Event e4 = new Event("Morning Yoga Session" , LocalDate.parse("24/12/2026", formatter));
		
		root = Node.insert(root, e1);
		root = Node.insert(root, e2);
		root = Node.insert(root, e3);
		root = Node.insert(root, e4);
		
		int option;
		
		do {
			
			System.out.println("\n1: Add new event \n2: Display all events  \n3: Cancelled the event \n4: Exit");
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
				
				case 1:
					
					System.out.println("Enter the name of event");
					String name = sc.nextLine();
					
					System.out.println("Enter the date: (d/M/yyyy)");
					LocalDate date = LocalDate.parse(sc.nextLine(), formatter);
					
					Event e = new Event(name, date);
					root = Node.insert(root, e);
					break;
					
				case 2:
					
					System.out.println("------Displaying all events-------");
					Node.display(root);
					break;
					
				case 3:
					
					System.err.println("Enter the event name");
					String eventR = sc.nextLine();
					root = Node.delete(root, eventR);
					
					System.err.println(eventR + " is removed.");
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

