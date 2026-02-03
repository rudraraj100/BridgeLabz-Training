package com.student;

import java.util.List;

public class Student {
	
	private String name;
	private String id;
	private String field;
	private int age;
	private Character gender;
	private String city;
	private int rank;
	private List<Long> contact;
	
	public Student(String name, String id, String field, int age, Character gender, String city, int rank,
			List<Long>contact) {
		super();
		this.name = name;
		this.id = id;
		this.field = field;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.rank = rank;
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getField() {
		return field;
	}

	public int getAge() {
		return age;
	}

	public Character getGender() {
		return gender;
	}

	public String getCity() {
		return city;
	}

	public int getRank() {
		return rank;
	}

	public List<Long> getContact() {
		return contact;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", field=" + field + ", age=" + age + ", gender=" + gender
				+ ", city=" + city + ", rank=" + rank + ", contact=" + contact + "]";
	}
	
	
	

}
