/*
Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.Scanner;

public class QuizApplication{
		// static variable
		static int score = 0;
	
	// method to check answer
	public static void checkAnswer(String answer){
		
		
		switch (answer){
		
			case "berlin": 
				score++;
				break;
				
			case "india panel code":
				score++;
				break;
				
			case "good and service tax":	
				score++;
				break;
				
			case "delhi":
				score++;
				break;
				
			case "101":
				score++;
				break;
			default :
				score += 0;
				
		}
		
		
	}		
	// main method		
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		// questions declared in array
		String[] questions = {"what is the capital of Germany" , "What is full form of IPC" , "What is full form of GST" , "What is the capital of india" , "What is 10 + 101 - 10"};
		
		String answer = "";
		for(int i = 0 ; i < questions.length ; i++){
			
			if(i == 0){
				System.out.println("\nAnswer the following Question1:");
				System.out.println(questions[i] + "\nPatna \nParis  \nLondon  \nBerlin");
				answer = sc.nextLine().trim().toLowerCase();
				checkAnswer(answer);
				
				
			}
			else if(i == 1){
				System.out.println("\nAnswer the following Question2:");
				System.out.println(questions[i] + "\nindia panel code \nindia post class  \nicecream pizza coke  \nindian pacific coast");
				answer = sc.nextLine().trim().toLowerCase();
				checkAnswer(answer);
			}
			else if(i == 2){
				System.out.println("\nAnswer the following Question3:");
				System.out.println(questions[i] + "\ngreen service team \nget set together  \ngood and service tax  \ngross service tax");
				answer = sc.nextLine().trim().toLowerCase();
				checkAnswer(answer);
			}
			else if(i == 3){
				System.out.println("\nAnswer the following Question4:");
				System.out.println(questions[i] + "\ndelhi \nParis  \nmumbai  \ngoa");
				answer = sc.nextLine().trim().toLowerCase();
				checkAnswer(answer);
			}
			else if(i == 4 ){
				System.out.println("\nAnswer the following Question5:");
				System.out.println(questions[i] + "\n100 \n101  \n99  \n110");
				answer = sc.nextLine().trim().toLowerCase();
				checkAnswer(answer);
			}
			 
		}
		// dispplay result
		System.out.println("\n Quiz Finished!");
        System.out.println("Your Score: " + score + " / " + questions.length);
		// close scanner
        sc.close();
    }
}	