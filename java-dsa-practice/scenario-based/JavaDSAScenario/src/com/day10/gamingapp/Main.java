package com.day10.gamingapp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Node root = null;
		Player p1 = new Player("Rishav", 63);
		Player p2 = new Player("Rashi" , 53);
		Player p3 = new Player("Rudresh" , 30);
		Player p4 = new Player("Soumya" , 35);
		
		root = Node.insert(root, p1);
		root = Node.insert(root, p2);
		root = Node.insert(root, p3);
		root = Node.insert(root, p4);
		
		int option;
		
		do {
			System.out.println("\n---Welcome to Gaming app---");
			System.out.println("\n1: Add new player \n2: Display top 10  \n3: Ban a player \n4: Exit");
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
				
				case 1:
					
					System.out.println("Enter the name of player");
					String player = sc.nextLine();
					
					System.out.println("Enter the score");
					double score = sc.nextDouble();
					
					Player p = new Player(player, score);
					root = Node.insert(root, p);
					break;
					
				case 2:
					
					System.out.println("------Scoreboard(Top 10)-------");
					Node.topPlayers(root);
					break;
					
				case 3:
					
					System.err.println("Enter the player name");
					String nameR = sc.nextLine();
					root = Node.delete(root, nameR);
					
					System.err.println(nameR + "is removed from the game.");
					break;
				case 4:	
					break;
					
				default:
					System.out.println("Invalid input, try again.");
			}
		}while(option != 4);
		
		sc.close();

	}

}
