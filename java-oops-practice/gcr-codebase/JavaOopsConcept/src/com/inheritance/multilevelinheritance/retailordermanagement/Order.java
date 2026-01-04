package com.inheritance.multilevelinheritance.retailordermanagement;

public class Order {
	
	long orderId;
	String orderDate;
	
	public Order() {
		
	}
	
	
	public Order(long orderId ,String orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		
	}
	
	void getOrderStatus() {
		System.out.println("Order id: " + orderId);
		System.out.println("Order date: " + orderDate);
		
	}

}
