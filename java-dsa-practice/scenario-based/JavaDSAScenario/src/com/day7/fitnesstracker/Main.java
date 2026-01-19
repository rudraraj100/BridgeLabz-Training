package com.day7.fitnesstracker;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total users:");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[][] usersList = new String[n][2];
		
		for(int i = 0; i < n ; i++) {
			
			System.out.println((i+1) + ". Enter the your name: ");
			usersList[i][0] = sc.nextLine();
			
			System.out.println((i+1) + ". Enter the total steps: ");
			usersList[i][1] = sc.nextLine();
			
		}
		BubbleSort.bubbleSort(usersList);
		
		for(String[] s : usersList) {
			
			System.out.println(s[0] + "-" + s[1]);
		}
	}
}
