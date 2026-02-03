package com.funtionalinterface.dataserialization;
public class BackupProcessor {

    public static void backupObject(Object obj) {
        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up: " + obj);
            // Logic to serialize object to file/db
        } else {
            System.out.println("Skipping non-serializable object: " + obj);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Rudra", 22);
        Department dept = new Department("Management");

        backupObject(emp);  // Will backup
        backupObject(dept); // Will skip
    }
}
