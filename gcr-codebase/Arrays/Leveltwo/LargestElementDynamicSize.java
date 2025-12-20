/*
Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
Hint => 
In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements. 
To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number
*/

import java.util.Scanner;
   
public class LargestElementDynamicSize { 
    public static void main(String[] args) {
                 
			Scanner sc = new Scanner(System.in);
                      
			// Take user input
			System.out.print("Enter a number: ");
			long number = sc.nextLong();
                 
			int maxDigit = 10;
			long[] digits = new long[maxDigit];
			int index = 0;
                   
				// Store digits in array
				while (number != 0) {
                      
					if (index == maxDigit) {
						maxDigit += 10;
						long[] temp = new long[maxDigit];
                           
                        // Copy old elements
						for (int i = 0; i < digits.length; i++) {
							temp[i] = digits[i];
						}
							
					digits = temp; // reassign array reference
					    
					}		
					 
					// get last digit and remove last digit		 
					digits[index] = number % 10; 
					number = number / 10;          
					index++;
				}
                 
			long largest = 0;
			long secondLargest = 0;
                                
			// Find largest and second largest
				for (int i = 0; i < index; i++) {
                        
					if (digits[i] > largest) {
						secondLargest = largest;
						largest = digits[i];
					} 
					else if (digits[i] > secondLargest && digits[i] != largest) {
						secondLargest = digits[i];
					}
				}
                     
			// Display result
			System.out.println("Largest digit: " + largest);
			System.out.println("Second largest digit: " + secondLargest); 
             
			// close scanner stream	 
			sc.close();
    }
}