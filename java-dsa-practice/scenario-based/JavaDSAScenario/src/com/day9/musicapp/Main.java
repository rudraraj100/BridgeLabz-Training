package com.day9.musicapp;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Node root = null;
		
		Song s1 = new Song("Oceans" , "182gf75");
		Song s2 = new Song("Animal" , "102lf85");
		Song s3 = new Song("Time" , "194la65");
		Song s4 = new Song("Arrival to earth" , "455mn75");
		Song s5 = new Song("Autumnal glow" , "302ab75");
		
		root = Node.insert(root, s1);
		root = Node.insert(root, s2);
		root = Node.insert(root, s3);
		root = Node.insert(root, s4);
		root = Node.insert(root, s5);
		
		int option;
		
		do {
			System.out.println("------Welcome to Music app------");
			System.out.println("\n1: release new song \n2: Search a song \n3: Display all Songs \n4: Exit");
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			
				case 1:
					System.out.println("Enter the new song title: ");
					String title = sc.nextLine();
					
					System.out.println("Enter the new song track id: ");
					String track_id = sc.nextLine();
					
					Song s = new Song(title , track_id);
					
					root = Node.insert(root, s);
					break;
					
				case 2: 
					System.out.println("Enter the track id:");
					String track_idS = sc.nextLine();
					
					System.out.println("Does song on this track id present in playlist? " + Node.search(root, track_idS));
					break;
					
				case 3:
					System.out.println("All songs present in playlist in alphabatical order:\n");
					System.out.printf("%-15s%-15s\n", "Track id:", "Song title:" );
					Node.inorder(root);
					break;
					
				case 4:	
					break;
					
				default:
					System.out.println("Wrong input");
					break;
					
			}
		}while(option != 4);
		
		sc.close();
	}
}
