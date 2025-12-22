/*
Create a program to divide N number of chocolates among M children. 
Print the number of chocolates each child will get and also the remaining chocolates
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
*/

import java.util.*;

public class childrenChocolateDistribution{

	public static int findReminder(int chocolates , int childerns){
		
		int chocolatesLeft = chocolates % childerns;
		
		return chocolatesLeft;
	}
	public static int findQuoteint(int chocolates , int childerns){
		
		int chocolatesReceive = chocolates / childerns;
		
		return chocolatesReceive;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total childrens: ");
		int  childerns= sc.nextInt();
		
		System.out.println("Enter the total chocolates: ");
		int chocolates = sc.nextInt();
	
		int chocolatesReceive = findQuoteint(chocolates , childerns);
		int chocolatesLeft = findReminder(chocolates , childerns);
		
		System.out.println("Total chocolates each children would received: " + chocolatesReceive);
		System.out.println("Total chocolates left: " + chocolatesLeft);
		
		sc.close();
		
	}
}	