package com.constructor.levelone;

public class EmployeeMain {

	public static void main(String[] args) {
		 Manager mgr = new Manager(
	                501,
	                "Engineering",
	                85000,
	                "Backend Team"
	        );

	        mgr.displayManagerDetails();

	        // Modifying salary using public method
	        mgr.setSalary(95000);
	        System.out.println("Updated Salary: ₹" + mgr.getSalary());
	    }

}


