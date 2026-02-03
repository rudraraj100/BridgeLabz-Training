package com.collectors.studentresult;

import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Rudra", 'A'));
		list.add(new Student("Rakesh", 'C'));
		list.add(new Student("Mohit", 'B'));
		list.add(new Student("Rashi", 'A'));
		list.add(new Student("Rohan", 'D'));
		list.add(new Student("Disha", 'B'));
		list.add(new Student("Rishav", 'A'));
		list.add(new Student("Rahul", 'B'));
		list.add(new Student("Soumya", 'B'));
		
		Map<Character, List<String>> gradeWise = list.stream().collect(Collectors.groupingBy(Student::getGrade, Collectors.mapping(Student::getName, Collectors.toList())));
		System.out.println("Grade:    Name");
		gradeWise.forEach((grade, name)->
				
					System.out.println( grade + ":   " + name)
					
					
		);			
	}

}
