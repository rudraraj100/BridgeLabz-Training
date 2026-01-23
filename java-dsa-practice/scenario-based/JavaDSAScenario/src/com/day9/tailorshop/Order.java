package com.day9.tailorshop;

import java.time.LocalDate;

public class Order {
	
	private String orderId;
	private LocalDate deadline;
	
	public Order(String orderId, LocalDate deadline) {
		
		this.orderId = orderId;
		this.deadline = deadline;
	}

	public String getOrderId() {
		return orderId;
	}

	public LocalDate getDeadline() {
		return deadline;
	}
	
	public String toString() {
		
		return "Order id: " + orderId + "-" + "DeadLine: " + deadline;
	}
	
	
}
