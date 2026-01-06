package com.day3.campusconnect;

import java.util.ArrayList;
import java.util.List;

// Faculty class
public class Faculty extends Person {

    private String department;
    private List<Course> assignedCourses;

    // Constructor
    public Faculty(int id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
        this.assignedCourses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        assignedCourses.add(course);
    }

    // Polymorphism
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Role: Faculty");
        System.out.println("Department: " + department);
    }
}

