package com.day9.universitydigitalrecordsystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter total number of students you want to enroll: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Node root = null;
		Student s;
		for(int i = 0 ; i <= n-1 ; i++) {
			System.out.println("Enter the student name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter the enrollment number: ");
			long roll = sc.nextLong();
			sc.nextLine();
			
			System.out.println("Enter the city name: ");
			String city = sc.nextLine();
			
			s = new Student(name, roll, city);
		    root = Node.insert(root, s);
			
		
		}
		System.out.printf("%-15s%-15s%-15s\n\n","Rollno.", "Name", "City");
		Node.inorder(root);
		
		System.out.println("\nEnter roll number to remove student");
		int r = sc.nextInt();
		sc.nextLine();
		
		root = Node.delete(root, r);
		
		System.out.printf("%-15s%-15s%-15s\n\n","Rollno.", "Name", "City");
		Node.inorder(root);
		
		
		

	}

}
