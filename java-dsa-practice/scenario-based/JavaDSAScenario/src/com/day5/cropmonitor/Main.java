package com.day5.cropmonitor;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Sensor> list = new ArrayList<>();
		
		int i = 0;
		
		do {
			System.out.println((i+1) + ". Record, Enter the current time:(HH:mm)");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
			LocalTime time = LocalTime.parse(sc.nextLine(), formatter);
			
			System.out.println("Enter the temperature:");
			int temperature = sc.nextInt();
			sc.nextLine();
			
			list.add(new Sensor(time , temperature));
			i++;
		}
		while(i<= 10);
		
		int n = list.size();
		
		QuickSort.quickSort(list, 0 , n-1);
		
		// print
		
		for(Sensor a: list) {
			System.out.print(a + " ");
		}
		
		
	sc.close();	
	}

}
