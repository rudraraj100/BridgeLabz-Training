package com.lambaexpression.notificationfiltering;

import java.util.*;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		List<Notification> filteredList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<= 2; i++){
			
			System.out.println((i) + ". Log the alert type");
			String type= sc.nextLine().toLowerCase().trim();
			
			System.out.println((i) + ". Log the alert message");
			String message = sc.nextLine();
			
			Notification n = new Notification(type, message);
			
			Predicate<Notification> predicate = (x) -> x.getType().equals("emergency");
			
			if(predicate.test(n)) {
				
				filteredList.add(n);
				
			}	
		}
		
		
		for(Notification n: filteredList) {
			
			System.out.println(n);
			
		}
		
		sc.close();
	}

}
