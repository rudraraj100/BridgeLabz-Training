package com.generics.resumescreeningsystem;
public class DataScientist extends JobRole {

    public DataScientist(String name) {
        super(name);
    }

    public void evaluateResume() {
        System.out.println(candidateName + " screened for Data Scientist role.");
    }
}
