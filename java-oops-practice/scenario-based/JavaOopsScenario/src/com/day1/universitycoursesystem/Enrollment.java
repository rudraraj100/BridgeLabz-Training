package com.day1.universitycoursesystem;

class Enrollment {
    private Student student;
    private Course course;

    Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    void showEnrollment() {
        System.out.println(student.name + " enrolled in " + course.getCourseDetails());
    }
}
