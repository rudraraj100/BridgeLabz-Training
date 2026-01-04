package com.inheritance.assistedproblems.employeemanagementsystem;

import java.util.Scanner;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Total Member: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Manager name: ");
		String name = sc.nextLine();
		
		Employee managerA = new Manager(n , name);
		managerA.displayDetail();
		
		Employee internB = new Intern("Rudresh" , 15000);
		internB.displayDetail();
		
		Employee Devs = new Developer("java");
		Devs.displayDetail();
		
		sc.close();

	}

}
