package com.day8.gamerzone;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Player> participants = new ArrayList<>();
		
		System.out.println("Total players in the match");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Enter the player " + (i+1) + " name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter the player's score: ");
			int point = sc.nextInt();
			sc.nextLine();
			
			participants.add(new Player(name, point));
				
		}
		int end = participants.size()-1;
		
		QuickSort.quickSort(participants, 0 , end);
		
		for(Player p : participants ) {
			System.out.println(p);
			
		}
		
	}

}
