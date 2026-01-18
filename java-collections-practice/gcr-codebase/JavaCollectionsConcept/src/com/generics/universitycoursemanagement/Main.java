package com.generics.universitycoursemanagement;

public class Main {
	
	public static void main(String[] args) {
	
		Course<ExamCourse> examDept = new Course<>();
		examDept.addCourse(new ExamCourse("Mathematics"));
    	examDept.addCourse(new ExamCourse("Physics"));

    	Course<AssignmentCourse> assignDept = new Course<>();
    	assignDept.addCourse(new AssignmentCourse("Web Development"));
    	assignDept.addCourse(new AssignmentCourse("Software Testing"));

    	Course<ResearchCourse> researchDept = new Course<>();
    	researchDept.addCourse(new ResearchCourse("AI Research"));
    	researchDept.addCourse(new ResearchCourse("Blockchain Innovation"));

    	System.out.println("---- Exam Department Courses ----");
    	UniversityUtils.displayCourses(examDept.getCourses());

    	System.out.println("\n---- Assignment Department Courses ----");
    	UniversityUtils.displayCourses(assignDept.getCourses());
    
    	System.out.println("\n---- Research Department Courses ----");
    	UniversityUtils.displayCourses(researchDept.getCourses());
	}
}

