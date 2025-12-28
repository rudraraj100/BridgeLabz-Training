package com.constructor.levelone;

public class Manager extends Employee {

	    String teamName;

	    Manager(int employeeID, String department, double salary, String teamName) {
	        super(employeeID, department, salary);
	        this.teamName = teamName;
	    }

	    void displayManagerDetails() {
	        System.out.println("Employee ID : " + employeeID);   // public
	        System.out.println("Department  : " + department);   // protected
	        System.out.println("Salary      : ₹" + getSalary()); // private via method
	        System.out.println("Team Name   : " + teamName);
	    }


}
