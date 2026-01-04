package com.encapsulation.hospitalpatientmanagement;

import java.util.*;

//Main class demonstrating polymorphism
public class HospitalManagementSystem {

 public static void main(String[] args) {

     List<Patient> patients = new ArrayList<>();

     Patient p1 = new InPatient(101, "Rahul", 35, 5, 3000);
     Patient p2 = new OutPatient(102, "Anita", 28, 800);

     patients.add(p1);
     patients.add(p2);

     // Polymorphic processing of patients
     for (Patient patient : patients) {

         patient.getPatientDetails();
         System.out.println("Total Bill: ₹" + patient.calculateBill());

         if (patient instanceof MedicalRecord) {
             ((MedicalRecord) patient).addRecord("Initial diagnosis recorded");
             ((MedicalRecord) patient).viewRecords();
         }

         System.out.println("--------------------------------");
     }
 }
}
