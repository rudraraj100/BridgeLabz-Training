package com.day7.skillforge;
class Course {

    private double rating;              // encapsulated
    String title;
    Instructor instructor;
    String[] modules;

    // default modules constructor
    Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Intro", "Basics", "Advanced"};
        this.rating = 0.0;
    }

    // custom modules constructor
    Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 0.0;
    }

    // protected logic for rating
    protected void updateRating(double value) {
        if (value >= 0 && value <= 5) {
            rating = (rating + value) / 2;   // operator usage
        }
    }

    // read-only access
    public double getRating() {
        return rating;
    }
}
