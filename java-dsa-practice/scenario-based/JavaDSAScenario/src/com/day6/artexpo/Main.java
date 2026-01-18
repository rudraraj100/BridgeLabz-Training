package com.day6.artexpo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<ArtistInfo> list = new ArrayList<>();
		
		
		
		while(true) {
			
		    System.out.println("Enter Artist name: ");
			String name = sc.nextLine().toLowerCase().trim();
			
			if(name.equals("no")) {
				break;
			}
	
			System.out.println("Time of registrations:(hh:mm) ");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
			LocalTime time = LocalTime.parse(sc.nextLine(), formatter);
			
			list.add(new ArtistInfo(time, name));
			
			TimeInsertionSort.insertionSort(list , list.size());
				
		}
		
		
		System.out.println("Sorted artist registration list:\n");
		for(ArtistInfo a : list) {
			System.out.println(a);
		}
		sc.close();
	}

}
