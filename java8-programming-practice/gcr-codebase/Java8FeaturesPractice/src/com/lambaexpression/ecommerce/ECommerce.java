package com.lambaexpression.ecommerce;

import java.util.ArrayList;
import java.util.Collections;

/*
 Custom Sorting in E-Commerce
○ Scenario: An online shop wants to sort products differently based on sales
campaigns (by price, rating, discount).
○ Task: Use a lambda with Comparator to sort products dynamically. 
 */

public class ECommerce {
	
	public static void main(String[] args) {
		
		Product p1 = new Product(1150,4.5,25);
		Product p2 = new Product(200,3.6,15);
		Product p3 = new Product(2050,5,35);
		Product p4 = new Product(2110,2.5,45);
		
		ArrayList<Product> list = new ArrayList<>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		System.out.println("Before sorting: ");
		for(Product p: list) {
			System.out.println(p);
		}
		
		Collections.sort(list, (a,b) -> Double.compare(b.price, a.price));
		
		System.out.println("\nAfter manual sorting: ");
		for(Product p: list) {
			System.out.println(p);
		}
	
	}

}
