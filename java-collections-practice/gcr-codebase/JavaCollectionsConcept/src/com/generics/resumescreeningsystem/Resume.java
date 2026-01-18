package com.generics.resumescreeningsystem;
public class Resume<T extends JobRole> {

    private T role;

    public Resume(T role) {
        this.role = role;
    }

    public void process() {
        role.evaluateResume();
    }

    public T getRole() {
        return role;
    }
}
