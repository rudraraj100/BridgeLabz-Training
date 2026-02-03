package com.funtionalinterface.cloningprotype;
public class PrototypeDemo {

    public static void main(String[] args) {

        try {
            Employee emp1 = new Employee("Rudra", 22);

            // Clone emp1
            Employee emp2 = (Employee) emp1.clone();
            emp2 = new Employee("Rudra Clone", 23); 

            System.out.println("Original: " + emp1);
            System.out.println("Clone   : " + emp2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
