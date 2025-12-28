package com.constructor.levelone;

public class BankAccountMain {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(
                1234567890L,
                "Rudra",
                25000,
                4.5
        );

        sa.displayAccountDetails();

        sa.deposit(5000);
        sa.withdraw(3000);

        System.out.println("Updated Balance: ₹" + sa.getBalance());
    }

}
