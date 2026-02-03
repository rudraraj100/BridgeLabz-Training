package com.streamapi.doctoravailability;
import java.util.*;

public class Hospital {

    public static void main(String[] args) {

        List<Doctor> list = new ArrayList<>();

        list.add(new Doctor("Dr. Sharma", "Cardiology", true));
        list.add(new Doctor("Dr. Mehta", "Neurology", false));
        list.add(new Doctor("Dr. Rao", "Orthopedics", true));
        list.add(new Doctor("Dr. Khan", "Dermatology", true));
        list.add(new Doctor("Dr. Patel", "Pediatrics", false));
        list.add(new Doctor("Dr. Singh", "ENT", true));

        System.out.println("Doctors available on weekends (sorted by specialty):");

        list.stream()
            .filter(Doctor::isAvailableOnWeekend)
            .sorted(Comparator.comparing(Doctor::getSpecialty))
            .forEach(System.out::println);
    }
}
