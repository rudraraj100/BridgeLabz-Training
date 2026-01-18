package com.generics.universitycoursemanagement;


public class ExamCourse extends CourseType {
    public ExamCourse(String name) {
        super(name);
    }

    public void evaluate() {
        System.out.println(courseName + " evaluated through Exams.");
    }
}



