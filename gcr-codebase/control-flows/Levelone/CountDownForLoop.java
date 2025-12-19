/*
Rewrite program 8 to do the countdown using the for-loop
*/
import java.util.Scanner;

// create a class CountDownForLoop represents the countdown start from user given input value
public class CountDownForLoop{
   public static void main(String[] args){
      
	  // create a scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept input number from user and assign int type
	  System.out.println("Put a number from which to start the countdown");
	  int counter = sc.nextInt();
	    
		// apply while loop to display the countdown
		for( int i = counter ; i >= 1 ; i-- ){
			System.out.println(i);
			
		}
			
	  sc.close();
	}
}	