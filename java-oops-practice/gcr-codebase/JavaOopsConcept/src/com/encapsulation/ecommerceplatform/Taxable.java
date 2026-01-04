package com.encapsulation.ecommerceplatform;

public interface Taxable {
	
	// Calculate tax amount
	double calculateTax();
	
	// Returns tax description
	String getTaxDetails();

}
