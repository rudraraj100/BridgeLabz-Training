/*
  Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is 
*/

// Class SamAverageMarks represents average marks calculation
public class SamAverageMarks{
   public static void main(String[] args){
      
	  // Store marks of Maths, Physics, and Chemistry in one line
	  int maths = 94, physics = 95, chemistry = 96;
	  
	  // Calculate average percentage marks
	  double average = (maths + physics + chemistry) / 3;
	  
	  
	  // Display the average marks
	  System.out.println("Sam' average mark in PCM is " + average + "%");
	}
}	

		