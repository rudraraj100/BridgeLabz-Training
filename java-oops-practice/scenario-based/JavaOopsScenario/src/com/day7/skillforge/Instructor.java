package com.day7.skillforge;
class Instructor extends User {

    Instructor(String name, String email) {
        super(name, email);
    }

    void uploadCourse(String title) {
        System.out.println("Course uploaded: " + title);
    }
}
