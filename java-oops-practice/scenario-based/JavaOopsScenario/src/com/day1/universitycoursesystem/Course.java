package com.day1.universitycoursesystem;

class Course {
    private String courseCode;
    private String title;

    Course(String courseCode, String title) {
        this.courseCode = courseCode;
        this.title = title;
    }

    public String getCourseDetails() {
        return courseCode + " - " + title;
    }
}

