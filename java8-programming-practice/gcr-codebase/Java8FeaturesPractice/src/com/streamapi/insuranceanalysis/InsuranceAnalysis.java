package com.streamapi.insuranceanalysis;
import java.util.*;
import java.util.stream.Collectors;

public class InsuranceAnalysis {

    public static void main(String[] args) {

        List<Claim> list = new ArrayList<>();

        list.add(new Claim("C101", "Health", 50000));
        list.add(new Claim("C102", "Vehicle", 30000));
        list.add(new Claim("C103", "Health", 70000));
        list.add(new Claim("C104", "Travel", 20000));
        list.add(new Claim("C105", "Vehicle", 45000));
        list.add(new Claim("C106", "Health", 60000));
        list.add(new Claim("C107", "Travel", 25000));

        Map<String, Double> avgClaimAmount =
                list.stream()
                    .collect(Collectors.groupingBy(
                        Claim::getClaimType,
                        Collectors.averagingDouble(Claim::getClaimAmount)
                    ));

        System.out.println("Average claim amount per claim type:");

        avgClaimAmount.forEach((type, avg) ->
                System.out.println(type + " -> " + String.format("%.2f", avg))
        );
    }
}
