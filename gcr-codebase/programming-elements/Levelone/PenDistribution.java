/*
Suppose you have to divide 14 pens among 3 students equally. 
Write a program to find how many pens each student will get if the pens must be divided equally. 
Also, find the remaining non-distributed pens.
Hint => 
Use Modulus Operator (%) to find the reminder.
Use Division Operator to find the Quantity of pens
I/P => NONE
O/P => The Pen Per Student is ___ and the remaining pen not distributed is
*/


// Class PenDistribution represents pen distribution logic
public class PenDistribution{
   public static void main(String[] args){
      
	  // Total number of pens available
	  int pens = 14;
	  
	  // Calculate pens each student gets using division operator
	  int eachStudent = 14 / 3;
	  
	  // Calculate remaining pens using modulus operator
	  int remainingPens = 14 % 3;
	  
	  
	  // Display the result
	  System.out.println("The Pen Per Student is " + eachStudent + " and the remaining pen not distributed is " + remainingPens);
	
	}
}	