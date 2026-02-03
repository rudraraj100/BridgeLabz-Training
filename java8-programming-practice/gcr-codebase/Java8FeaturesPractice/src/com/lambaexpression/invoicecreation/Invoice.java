package com.lambaexpression.invoicecreation;

public class Invoice {
	
	private String id;
//	private String billName;
//	private double totalCost;
	
	public Invoice(String id) {//, String billName, double totalCost) {
	
		this.id = id;
//		this.billName = billName;
//		this.totalCost = totalCost;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		
		return "Invoice id: " + id;
	}

//	public String getBillName() {
//		return billName;
//	}
//
//	public double getTotalCost() {
//		return totalCost;
//	}
//	
	
	
	

}
