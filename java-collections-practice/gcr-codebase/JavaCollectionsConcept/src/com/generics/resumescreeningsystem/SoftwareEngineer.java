package com.generics.resumescreeningsystem;
public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(String name) {
        super(name);
    }

    public void evaluateResume() {
        System.out.println(candidateName + " screened for Software Engineer role.");
    }
}
