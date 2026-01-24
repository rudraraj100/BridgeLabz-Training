package com.day9.universitydigitalrecordsystem;

public class Student {
	
	private String name;
	private long rollNum;
	private String city;
	
	public Student(String name, long rollNum, String city) {
	
		this.name = name;
		this.rollNum = rollNum;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public long getRollNum() {
		return rollNum;
	}

	public String getCity() {
		return city;
	}
	
	public String toString() {
		return rollNum+ " " + name + " "+ city;
	}
	
}
