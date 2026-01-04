package com.inheritance.multilevelinheritance.retailordermanagement;

public class ShippedOrder extends Order {
	
	long trackingNumber;
	
	public ShippedOrder() {
		
	}
	
	public ShippedOrder(long orderId , String orderDate , long trackingNumber) {
		
		super(orderId , orderDate);
		this.trackingNumber = trackingNumber;
		
	}
	
	void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Tracking number: " + trackingNumber);
	}

}
