package com.generics.universitycoursemanagement;

import java.util.List;

class UniversityUtils {

    public static void displayCourses(List<? extends CourseType> courseList) {
        for (CourseType c : courseList) {
            c.evaluate();
        }
    }
}
