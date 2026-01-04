package com.encapsulation.hospitalpatientmanagement;

//Abstract base class for all patients
public abstract class Patient {

 // Encapsulated patient details
 private int patientId;
 private String name;
 private int age;

 // Sensitive data (secured)
 private String diagnosis;

 // Constructor
 public Patient(int patientId, String name, int age) {
     this.patientId = patientId;
     this.name = name;
     this.age = age;
 }

 // Concrete method to display patient details
 public void getPatientDetails() {
     System.out.println("Patient ID: " + patientId);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }

 // Controlled access to sensitive data
 public void setDiagnosis(String diagnosis) {
     this.diagnosis = diagnosis;
 }

 // Abstract method for billing
 public abstract double calculateBill();
}

