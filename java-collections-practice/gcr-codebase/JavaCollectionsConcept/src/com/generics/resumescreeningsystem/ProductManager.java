package com.generics.resumescreeningsystem;
public class ProductManager extends JobRole {

    public ProductManager(String name) {
        super(name);
    }

    public void evaluateResume() {
        System.out.println(candidateName + " screened for Product Manager role.");
    }
}
