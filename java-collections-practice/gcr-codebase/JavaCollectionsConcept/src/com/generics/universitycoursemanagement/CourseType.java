package com.generics.universitycoursemanagement;

public abstract class CourseType {
    String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public abstract void evaluate();
}
