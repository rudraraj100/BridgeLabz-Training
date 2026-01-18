package com.generics.universitycoursemanagement;

public class AssignmentCourse extends CourseType {
   
	public AssignmentCourse(String name) {
        super(name);
    }

    public void evaluate() {
        System.out.println(courseName + " evaluated through Assignments.");
    }
}