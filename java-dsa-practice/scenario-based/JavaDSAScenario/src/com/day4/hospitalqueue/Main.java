package com.day4.hospitalqueue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of Patients: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[][] record = new String[n][2];
		
		for(int i = 0 ; i < n ; i++) {
			
			System.out.println("Enter the " + (i + 1) + " no. patient name: ");
			record[i][0] = sc.nextLine();
			System.out.println("Press critical level(1-10): ");
			record[i][1] = sc.nextLine();
			
			}
		
		BubbleSort.bubbleSort(record);
		
		System.out.println("After sorting");
		
		for(String r[] : record) {
			
			System.out.println(r[0] + " " + r[1]);
		}
		
		
	}

}


