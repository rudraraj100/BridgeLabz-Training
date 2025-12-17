/*
Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
Hint => 
Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is
*/

// Class ProfitLossPercentage represents profit and loss calculation
public class ProfitLossPercentage{
   public static void main(String[] args){
      
	  // Store cost price and selling price
	  float costPrice = 129;
	  float sellingPrice = 191;
	  
	  // Calculate profit using profit formula and profit percentage
	  float result = sellingPrice - costPrice;
	  float percentage = (result/costPrice) * 100;
	  
	  
	  // display the cost price, selling price and profit percentage
	  System.out.println("The Cost Price is INR " + costPrice + " and  Selling Price is INR " + sellingPrice + 
	  "\nThe Profit is INR " + result + " and the Profit Percentage is " + percentage);
    }
}	