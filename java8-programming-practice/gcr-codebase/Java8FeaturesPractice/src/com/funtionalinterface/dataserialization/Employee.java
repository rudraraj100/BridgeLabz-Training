package com.funtionalinterface.dataserialization;
class Employee implements BackupSerializable {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return deptName;
    }
}
