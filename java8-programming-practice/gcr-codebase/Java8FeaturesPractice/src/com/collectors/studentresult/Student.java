package com.collectors.studentresult;

public class Student {
	
	private String name;
	private Character grade;
	public Student(String name, Character grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public Character getGrade() {
		return grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	
	

}
