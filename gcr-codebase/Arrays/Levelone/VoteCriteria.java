/*
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Define an array of 10 integer elements and take user input for the student's age. 
Loop through the array using the length property and 
for the element of the array check If the age is a negative number 
print an invalid age and if 18 or above, print The student with the age ___ can vote. 
Otherwise, print The student with the age ___ cannot vote. 
*/
   
import java.util.Scanner;

   
public class VoteCriteria{   
   public static void main(String[] args){
		
		// create scanner class to read input and create an array of size 10
		Scanner sc = new Scanner(System.in);
		int[] age = new int[10];
		
		System.out.println("Enter the 10 students age");
		// assign input with array index
		for( int i = 0 ; i < age.length ; i++){
			System.out.println("Student " + (i + 1) + " age: ");
			age[i] = sc.nextInt();
		}
			// evalaute who can vote based on condition
			for(int i = 0 ; i < age.length ; i++){
			
				if(age[i] >= 18){
					System.out.println("Student " + (i + 1) + " can vote");
				}
				
				else if(age[i] < 18 && age[i] > 0){
					System.out.println("Student " + (i + 1) + " can not vote");
				}
				
				else {
					System.out.println("Student " + (i + 1) + " Invalid age");
				}
			}
				
		//close scanner stream
		sc.close();
	}
}	