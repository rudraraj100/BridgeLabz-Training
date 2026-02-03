package com.collectors.employee;

public class Employee {
	

	private String name;
	private String department;
	private long salary;
	
	public Employee( String name, String department, long salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	

	public String getName() {
		return name;
	}

	

	

	public String getDepartment() {
		return department;
	}


	public long getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [ name=" + name +  ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	
	

}
