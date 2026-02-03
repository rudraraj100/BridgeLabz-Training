package com.collectors.orderrevenue;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<Order> orders = new ArrayList<>();
		
		orders.add(new Order("Rudra", 2500));
		orders.add(new Order("Rudra", 2500));
		orders.add(new Order("Rudra", 2500));
		orders.add(new Order("Rudra", 2500));
		orders.add(new Order("Rashi", 3000));
		orders.add(new Order("Rashi", 3000));
		orders.add(new Order("Rashi", 3000));
		orders.add(new Order("Rohan", 1500));
		orders.add(new Order("Rocky", 3050));
		orders.add(new Order("Rocky", 3050));
		orders.add(new Order("Rocky", 3050));
		
		Map<String, Double> revenueByCustomer = orders.stream().collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(Order::getTotal)));
		
		revenueByCustomer.forEach((customer, total) ->
						
						System.out.println(customer + " : " + total)
						
						
		);				
	}

}
