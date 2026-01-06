package com.day4.edumentor;

//Quiz class
public class Quiz {
 private String[] questions;
 private String[] answers; // Encapsulated, cannot be modified after creation
 private int score;
 private int totalQuestions;


 public Quiz() {
	 
 }
 // Constructor
 public Quiz(String[] questions, String[] answers) {
     this.questions = questions;
     this.answers = answers;
     this.totalQuestions = questions.length;
     this.score = 0;
 }
 

 public int getScore() {
	return score;
}



 // Method to attempt the quiz
 public void attemptQuiz(String[] userAnswers) {
     for (int i = 0; i < totalQuestions; i++) {
         if (userAnswers[i].equalsIgnoreCase(answers[i])) {
             score++;
         }
     }
 }

 // Calculate percentage
 public double calculatePercentage() {
     return (double) score / totalQuestions * 100;
 }

 // Display score
 public void displayScore() {
     System.out.println("Quiz Score: " + score + "/" + totalQuestions);
     System.out.println("Percentage: " + calculatePercentage() + "%");
 }

 public int getTotalQuestions() {
     return totalQuestions;
 }
}

