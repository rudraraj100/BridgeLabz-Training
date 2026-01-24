package com.day9.ecommerceproductinventory;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------AtoZ Ecommerce platform:------\n");
		System.out.println("Are you Admin/Customer?");
		String identity = sc.nextLine().toLowerCase().trim();
		int option;
		Node root = null;;
		if(identity.equals("admin")) {
			
			do {
				
		
			System.out.println("------Welcome aboard to AtoZ------");
			System.out.println("Which operation would you like to choose:\n");
			System.out.println("1: Insert new product \n2: Update product price \n3: Remove product \n4: Display all products \n5: Exit");
			
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			
			case 1:
				
				System.out.println("Enter the name of the product");
				String name = sc.nextLine();
				
				System.out.println("Enter the sku detail of product");
				String sku = sc.nextLine();
				
				System.out.println("Enter the manufacture date: (dd/mm/yyyy) ");
				String manufactureDate = sc.nextLine();
				
				System.out.println("Enter the price:");
				double price = sc.nextDouble();
				
				Product p = new Product( name, sku, manufactureDate, price);
				
				root = new Node(p);
				
				Node.insert(root, p);
				break;
				
			case 2:
				
				System.out.println("Enter the sku number: ");
				String skuR = sc.nextLine();
				System.out.println("Enter the update price: ");
				double priceU = sc.nextDouble();
				
				Node.replace(root, skuR, priceU);
				
				
				break;
				
			case 3:
				
				System.out.println("Enter the sku id of the product to delete:");
				String skuD = sc.nextLine();
				
				root = Node.delete(root, skuD);
				System.out.println("The product is deleted.");
				break;
				
			case 4:
				
				System.out.println("These products are available.");
				Node.inorder(root);
				break;
				
			case 5:
				
				break;
				
			default : 
				
				System.out.println("Wrong input, try again!");
				
			}
			}
			while(option != 5);
	
		}
		else if(identity.equals("customer")) {
			
			System.out.println("1: Display all products \n5: Exit");
			option = sc.nextInt();

			switch(option) {
			
				case 1:
					System.out.println("These products are available.");
					Node.inorder(root);
					break;
					
				case 2:
					System.out.println("Have a good day!");
					break;
				
					
				default :
					System.out.println("Wrong option");
					break;
			}
			
		}
		
		sc.close();
	}

}
