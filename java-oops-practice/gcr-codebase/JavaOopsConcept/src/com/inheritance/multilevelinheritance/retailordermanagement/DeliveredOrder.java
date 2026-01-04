package com.inheritance.multilevelinheritance.retailordermanagement;

public class DeliveredOrder extends ShippedOrder {
	
	String deliveryDate;
	
	public DeliveredOrder (long orderId , String orderDate , long trackingNumber , String deliveryDate) {
		
		super( orderId , orderDate , trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	
	void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Delivery date: " + deliveryDate);
	}

}
