package com.day5.cinemahouse;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the total number of Movies: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
	
		String[][] list = new String[n][2];
	
		for(int i = 0 ; i < n ; i++) {
			
			System.out.println("Enter the movie show time:(HH:mm)");
			LocalTime showTime = LocalTime.parse(sc.nextLine(), formatter);
			list[i][0] = showTime.toString();	
			
			System.out.println("Enter the movie name");
			list[i][1] = sc.nextLine();
				
		}
		System.out.println("\nBefore sorting:" );
		System.out.println("Show Time - Name" );
		for(String [] r: list) {
			System.out.println("• " + r[0] + "-" + r[1] );
		}
		
		BubbleSort.bubbleSort(list);
		
		System.out.println("\nAfter sorting:" );
		System.out.println("Show Time - Name" );
		for(String [] r: list) {
			System.out.println("• " + r[0] + "-" + r[1] );
		}
		
		sc.close();
	}
}
