package com.day9.tailorshop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Order> list = new ArrayList<>();
		
		System.out.println("Enter how many order you will take today?");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0 ; i < n ; i++) {
			
			System.out.println( (i+1) + ". Enter the order id: ");
			String orderId = sc.nextLine();
			
			System.out.println("Enter the deadline of order: " + orderId + " (yyyy/M/d)");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/M/d");
			
			LocalDate date = LocalDate.parse(sc.nextLine(), formatter);
			
			list.add(i, new Order(orderId , date));
			
			InsertionSort.insertionSort(list , i);
			
		}
		
		for(Order o: list) {
			System.out.println(o);
		}

	}

}
