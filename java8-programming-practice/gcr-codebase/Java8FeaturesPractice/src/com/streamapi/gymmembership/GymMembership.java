package com.streamapi.gymmembership;
import java.time.LocalDate;
import java.util.*;

public class GymMembership {

    public static void main(String[] args) {

        List<Member> list = new ArrayList<>();

        list.add(new Member("Aman", LocalDate.now().plusDays(10)));
        list.add(new Member("Riya", LocalDate.now().plusDays(40)));
        list.add(new Member("Kunal", LocalDate.now().plusDays(25)));
        list.add(new Member("Neha", LocalDate.now().minusDays(5)));
        list.add(new Member("Rohit", LocalDate.now().plusDays(30)));

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        System.out.println("Members whose membership expires within next 30 days:");

        list.stream()
            .filter(m -> !m.getExpiryDate().isBefore(today) &&
                         !m.getExpiryDate().isAfter(next30Days))
            .forEach(System.out::println);
    }
}
