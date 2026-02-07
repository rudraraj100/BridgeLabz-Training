package com.multithreading.bankingsystem;

public class Main {

	public static void main(String[] args) {
		
		BankAccount n = new BankAccount();
		Transaction t1 = new Transaction(n , "Rohan" , 3000.0 );
		Transaction t2 = new Transaction(n ,"Mohan" , 4000.0 );
		Transaction t3 = new Transaction(n ,"Sohan" , 2000.0 );
		Transaction t4 = new Transaction(n ,"Suhan" , 5000.0 );
		Transaction t5= new Transaction(n ,"Aahan" , 1500.0 );
		
		Thread one = new Thread(t1);
		one.setName("customer 1");
		Thread two = new Thread(t2);
		two.setName("customer 2");
		Thread three = new Thread(t3);
		three.setName("customer 3");
		Thread four = new Thread(t4);
		four.setName("customer 4");
		Thread five = new Thread(t5);
		five.setName("customer 5");
		
		one.start();		
		two.start();
		three.start();
		four.start();
		five.start();
		

//		System.out.println(n.getBalance());;
	}

}
