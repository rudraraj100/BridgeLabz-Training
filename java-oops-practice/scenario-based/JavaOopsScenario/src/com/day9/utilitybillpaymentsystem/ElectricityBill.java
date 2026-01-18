package com.day9.utilitybillpaymentsystem;

public class ElectricityBill extends Bill implements IPayable {

	public ElectricityBill(double amount, String dueDate) {
		super("Electricity", amount, dueDate, 50);
	}

	@Override
	public void pay() {
		markPaid();
		System.out.println("Electricity bill paid: ₹" + amount);
	}

	@Override
	public void sendReminder() {
		System.out.println("Electricity Bill Reminder: Power will be disconnected!");
	}
	@Override
	public void showBill() {
		System.out.println("\nElectricityBill = ₹" + amount);
	}
}