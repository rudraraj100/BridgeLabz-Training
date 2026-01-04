package com.inheritance.multilevelinheritance.retailordermanagement;

public class OrderManagement {

	public static void main(String[] args) {
		
		Order bat = new DeliveredOrder(132456 , "03-01-26" , 159753654 , "05-02-26");
		bat.getOrderStatus();

	}

}
