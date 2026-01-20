package com.day7.eduresults;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Marks> studentMarks = new ArrayList<>();
		
		studentMarks.add(new Marks("MH", 95, "Rudra"));
		studentMarks.add(new Marks("MH", 47, "Sneha"));
		studentMarks.add(new Marks("MH", 90, "Kiran"));

		studentMarks.add(new Marks("GJ", 60, "Harsh"));
		studentMarks.add(new Marks("GJ", 80, "Jinal"));

		studentMarks.add(new Marks("RJ", 41, "Arjun"));
		studentMarks.add(new Marks("RJ", 75, "Tanvi"));
		studentMarks.add(new Marks("RJ", 99, "Vikas"));
		
		int n = studentMarks.size();
		
		MergeSort.divide(studentMarks , 0 , n-1 );
		
		System.out.println(" Name | Marks | State ");
		
		for(Marks a: studentMarks) {
			
			System.out.println(a);
		
		}	
	}

}
