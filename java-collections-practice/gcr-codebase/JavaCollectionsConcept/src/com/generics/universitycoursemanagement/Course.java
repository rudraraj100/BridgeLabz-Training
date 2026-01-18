package com.generics.universitycoursemanagement;
import java.util.*;

public class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T c) {
        courses.add(c);
    }

    public List<T> getCourses() {
        return courses;
    }
}
