package com.day4.edumentor;

//FullTimeCourse class implements ICertifiable
public class FullTimeCourse extends Quiz implements ICertifiable {
 private Learner learner;
 private Quiz quiz;

 public FullTimeCourse(Learner learner , Quiz quiz) {
     this.learner = learner;
     this.quiz = quiz;
 }

 @Override
 public void generateCertificate() {
	 if(quiz.getScore() <= 1) {
		 System.out.println("I'm sorry, " + learner.name + " You failed the full-time course.");
	 }else {
     System.out.println("Generating Full-Time Course Certificate for " + learner.name + "...");
     System.out.println("Outstanding Achievement! " + learner.name + " completed the full-time course.");
	 } 
 }
}
