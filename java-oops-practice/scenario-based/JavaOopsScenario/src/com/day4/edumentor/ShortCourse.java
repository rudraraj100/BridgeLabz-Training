package com.day4.edumentor;

//ShortCourse class implements ICertifiable
public class ShortCourse extends Quiz implements ICertifiable {
 private Learner learner;
 private Quiz quiz;

 public ShortCourse(Learner learner , Quiz quiz ) {
     this.learner = learner;
     this.quiz = quiz;
 }

 @Override
 public void generateCertificate() {
	 if( quiz.getScore() <= 1) {
		 System.out.println("I'm sorry, " + learner.name + "! You failed in short course.");
		 
	 }else {
	 
     System.out.println("Generating Short Course Certificate for " + learner.name + "...");
     System.out.println("Congratulations " + learner.name + "! You completed a short course.");
	}
 }
}
