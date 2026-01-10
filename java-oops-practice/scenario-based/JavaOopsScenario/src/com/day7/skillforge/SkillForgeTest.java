package com.day7.skillforge;
public class SkillForgeTest {

    public static void main(String[] args) {

        Instructor ins = new Instructor("Ravi", "ravi@skillforge.com");
        ins.uploadCourse("Java Mastery");

        Course c1 = new Course("Java Mastery", ins);

        Student s1 = new Student("Amit", "amit@gmail.com");
        s1.updateProgress(50);
        s1.updateProgress(50);

        AdvancedStudent s2 = new AdvancedStudent("Neha", "neha@gmail.com");
        s2.updateProgress(100);

        c1.updateRating(4.5);

        System.out.println("Course Rating: " + c1.getRating());

        s1.generateCertificate();   
        s2.generateCertificate();   
        }
}
