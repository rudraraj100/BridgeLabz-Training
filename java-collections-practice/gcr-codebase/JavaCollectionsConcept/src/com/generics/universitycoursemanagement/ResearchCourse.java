package com.generics.universitycoursemanagement;

public class ResearchCourse extends CourseType {
   
	public ResearchCourse(String name) {
        super(name);
    }

    public void evaluate() {
        System.out.println(courseName + " evaluated through Research work.");
    }
}
