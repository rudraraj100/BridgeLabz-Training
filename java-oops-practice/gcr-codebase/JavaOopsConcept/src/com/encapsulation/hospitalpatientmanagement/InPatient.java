package com.encapsulation.hospitalpatientmanagement;

import java.util.*;

//In-patient with hospital stay charges
public class InPatient extends Patient implements MedicalRecord {

 private int daysAdmitted;
 private double dailyCharge;

 // Encapsulated medical history
 private List<String> medicalHistory = new ArrayList<>();

 public InPatient(int id, String name, int age, int daysAdmitted, double dailyCharge) {
     super(id, name, age);
     this.daysAdmitted = daysAdmitted;
     this.dailyCharge = dailyCharge;
 }

 // Billing logic for in-patient
 @Override
 public double calculateBill() {
     return daysAdmitted * dailyCharge;
 }

 // Add medical record securely
 @Override
 public void addRecord(String record) {
     medicalHistory.add(record);
 }

 // View medical records
 @Override
 public void viewRecords() {
     System.out.println("Medical Records: " + medicalHistory);
 }
}
