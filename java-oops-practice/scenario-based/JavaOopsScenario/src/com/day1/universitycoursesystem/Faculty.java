package com.day1.universitycoursesystem;

class Faculty {
    private int facultyId;
    private String name;

    Faculty(int facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    // Polymorphic grading
    void gradeStudent(Graded student, double marks) {
        student.assignGrade(marks);
    }
}
