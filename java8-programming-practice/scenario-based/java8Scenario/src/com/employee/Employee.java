package com.employee;


import java.time.Year;

public class Employee {
	
	private String id;
	private String name;
	private int age;
	private Character gender;
	private String department;
	private Year yearOfJoining;
	private long salary;
	
	public Employee(String id, String name, int age, char gender, String department, Year yearOfJoining,
			long salary) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public Year getYearOfJoining() {
		return yearOfJoining;
	}

	public long getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
	
	
	

}
