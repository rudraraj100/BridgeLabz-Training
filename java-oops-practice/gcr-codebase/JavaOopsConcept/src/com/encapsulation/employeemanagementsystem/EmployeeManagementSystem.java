package com.encapsulation.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Ravi", 50000);
        Employee e2 = new PartTimeEmployee(102, "Maya", 40, 500);

        e1.assignDepartment("IT");
        e2.assignDepartment("HR");

        employees.add(e1);
        employees.add(e2);

        // Polymorphic behavior
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
