package com.day3.campusconnect;

import java.util.ArrayList;
import java.util.List;

// Student class extends Person and implements course actions
public class Student extends Person implements ICourseActions {

    private double[] grades;             
    private double gpa;
    private List<Course> courses;

    // Constructor
    public Student(int id, String name, String email, double[] grades) {
        super(id, name, email);
        this.grades = grades;
        this.courses = new ArrayList<>();
        calculateGPA();
    }

    // GPA calculation using operators
    private void calculateGPA() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        gpa = sum / grades.length;
    }

    // Interface methods
    public void enrollCourse(Course course) {
        courses.add(course);
    }

    public void dropCourse(Course course) {
        courses.remove(course);
    }

    // Polymorphism
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Role: Student");
        System.out.println("GPA: " + gpa);
    }
}
