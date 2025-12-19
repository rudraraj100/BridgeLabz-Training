/*
Create a program to print the greatest factor of a number beside itself using a loop.
Hint => 
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop
*/
import java.util.Scanner;

// create a class NumberGreatestFactor represents factors of number takes as an input
public class NumberGreatestFactor{
   public static void main(String[] args){
      
	  // create scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept an input from user and assign it int type and create variable greatestFactor with initial value 1
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  int greatestFactor = 1;
	  
		// apply for loop to display factor of the number and break when we get greatestFactor 
		for(int i = n - 1 ; i >= 1 ; i-- ){
			
			if(n % i == 0){
				greatestFactor = i;
				
				break;
			}
		}
	  // display the greatestFactor	
	  System.out.println("Greatest factor is: " + greatestFactor);
      	  
      
      // close scanner stream	  
      sc.close();
	}
}	