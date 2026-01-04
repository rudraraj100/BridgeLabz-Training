package com.day1.universitycoursesystem;

public class UniversityEnrollmentSystem {
    public static void main(String[] args) {

        Student ug = new Undergraduate(101, "Aman");
        Student pg = new Postgraduate(201, "Neha");

        Course c1 = new Course("CS101", "Object Oriented Programming");

        Faculty f1 = new Faculty(1, "Dr. Sharma");

     // Polymorphic grading
        f1.gradeStudent((Graded) ug, 78);
        f1.gradeStudent((Graded) pg, 51);
        
        Enrollment e1 = new Enrollment(ug, c1);
        e1.showEnrollment();
        ug.viewTranscript();
        
        Enrollment e2 = new Enrollment(pg, c1);
        e2.showEnrollment();
        pg.viewTranscript();

        

       
      
    }
}
