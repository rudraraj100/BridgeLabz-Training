package com.day8.movietime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Movie> list = new ArrayList<>();
		
		System.out.println("How much movies, you want to align in a list: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n ; i++) {
			System.out.println("Enter the movie " + (i+1) + " name:");
			String name = sc.nextLine();
			
			System.out.println("Enter the movie's showtime: (hh:mm) ");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
			LocalTime time = LocalTime.parse(sc.nextLine(), formatter);
			
			list.add(new Movie(name, time));
		}
		
		InsertionSort.insertionSort(list, list.size());
		
		for(Movie m: list) {
			System.out.println(m);
		}
			

	}

}
