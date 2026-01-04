package com.encapsulation.hospitalpatientmanagement;

import java.util.*;

//Out-patient with consultation charges
public class OutPatient extends Patient implements MedicalRecord {

 private double consultationFee;

 // Encapsulated medical history
 private List<String> medicalHistory = new ArrayList<>();

 public OutPatient(int id, String name, int age, double consultationFee) {
     super(id, name, age);
     this.consultationFee = consultationFee;
 }

 // Billing logic for out-patient
 @Override
 public double calculateBill() {
     return consultationFee;
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
