package com.day4.edumentor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating Learner
        System.out.print("Enter Learner Name: ");
        String learnerName = sc.nextLine();
        System.out.print("Enter Learner Email: ");
        String learnerEmail = sc.nextLine();
        System.out.print("Enter Learner ID: ");
        int learnerId = sc.nextInt();
        sc.nextLine(); // consume newline

        Learner learner = new Learner(learnerName, learnerEmail, learnerId);

        // Creating Instructor
        System.out.print("Enter Instructor Name: ");
        String instructorName = sc.nextLine();
        System.out.print("Enter Instructor Email: ");
        String instructorEmail = sc.nextLine();
        System.out.print("Enter Instructor ID: ");
        int instructorId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Instructor Specialization: ");
        String specialization = sc.nextLine();

        Instructor instructor = new Instructor(instructorName, instructorEmail, instructorId, specialization);

        // Display Users
        System.out.println("\n--- Users Info ---");
        learner.displayUserInfo();
        instructor.displayUserInfo();

        // Create Quiz
        String[] questions = {"What is Java?", "What is OOP?", "What is inheritance?"};
        String[] answers = {"Programming Language", "Object Oriented Programming", "Mechanism of Reusing"};
        Quiz quiz = new Quiz(questions, answers);

        // User attempts the quiz
        String[] userAnswers = new String[questions.length];
        System.out.println("\n--- Quiz ---");
        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i] + ": ");
            userAnswers[i] = sc.nextLine();
        }

        quiz.attemptQuiz(userAnswers);
        quiz.displayScore();

        // Update learner progress
        learner.setProgress((int) quiz.calculatePercentage());

        // Generate certificate based on course type
        System.out.println("\n--- Certificate Generation ---");
        System.out.print("Enter course type (short/full): ");
        String courseType = sc.nextLine();

        ICertifiable course;
        if (courseType.equalsIgnoreCase("short")) {
            course = new ShortCourse(learner , quiz);
        } else {
            course = new FullTimeCourse(learner , quiz);
        }
        course.generateCertificate();

        sc.close();
    }
}
