package com.day3.campusconnect;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- Faculty Input --------
        System.out.println("Enter Faculty ID:");
        int fid = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter Faculty Name:");
        String fname = sc.nextLine();

        System.out.println("Enter Faculty Email:");
        String femail = sc.nextLine();

        System.out.println("Enter Faculty Department:");
        String dept = sc.nextLine();

        Faculty faculty = new Faculty(fid, fname, femail, dept);

        // -------- Course Input --------
        System.out.println("\nEnter Course Name:");
        String courseName = sc.nextLine();

        Course course = new Course(courseName, faculty);
        faculty.assignCourse(course);

        // -------- Student Input --------
        System.out.println("\nEnter Student ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Student Email:");
        String email = sc.nextLine();

        System.out.println("Enter number of subjects:");
        int n = sc.nextInt();

        double[] grades = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter grade for subject " + (i + 1) + ":");
            grades[i] = sc.nextDouble();
        }

        Student student = new Student(id, name, email, grades);

        // -------- Course Enrollment --------
        student.enrollCourse(course);
        course.addStudent(student);

        // -------- Output --------
        System.out.println("\n---- Student Details ----");
        student.printDetails();

        System.out.println("\n---- Faculty Details ----");
        faculty.printDetails();

        System.out.println("\n---- Course Details ----");
        course.showCourseDetails();

        sc.close();
    }
}
