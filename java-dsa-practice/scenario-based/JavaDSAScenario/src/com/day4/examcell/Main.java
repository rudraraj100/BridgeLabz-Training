package com.day4.examcell;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Score> marks = new ArrayList<>();
		
		marks.add(new Score("Mumbai"   , 86));
		marks.add(new Score("Pune"     , 69));		
		marks.add(new Score("Odissa"   , 68));
		marks.add(new Score("UP"       , 33));
		marks.add(new Score("Bihar"    , 49));
		marks.add(new Score("Mumbai"   , 99));
		marks.add(new Score("Mumbai"   , 66));
		marks.add(new Score("Pune"     , 96));
		marks.add(new Score("Odissa"   , 86));
		marks.add(new Score("UP"       , 63));
		marks.add(new Score("Bihar"    , 94));
		
		int n = marks.size();
		
		System.out.println("Before Sorting:");
		System.out.println("---------------");
		for(int i = 0 ; i < n ; i++) {
			System.out.println(marks.get(i));
		}
		
		ScoreMergeSort.divide(marks, 0 , n-1);
		
		System.out.println("\nAfter Sorting:");
		System.out.println("---------------");
		for(int i = 0 ; i < n ; i++) {
			System.out.println(marks.get(i));
		}
	}

}
