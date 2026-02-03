package com.streamapi.nametransformation;
import java.util.*;

public class CustomerNames {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "rudra",
                "ananya",
                "mohit",
                "sneha",
                "karan"
        );

        System.out.println("Customer names (UPPERCASE & sorted):");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}
