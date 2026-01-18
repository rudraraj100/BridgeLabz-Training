package com.generics.resumescreeningsystem;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 = new Resume<>(new SoftwareEngineer("Rudra"));
        Resume<DataScientist> r2 = new Resume<>(new DataScientist("Aryan"));
        Resume<ProductManager> r3 = new Resume<>(new ProductManager("Dev"));

        ScreeningUtils.applyAIFilter(r1);
        ScreeningUtils.applyAIFilter(r2);
        ScreeningUtils.applyAIFilter(r3);

        List<JobRole> roleList = new ArrayList<>();
        roleList.add(new SoftwareEngineer("Rudra"));
        roleList.add(new DataScientist("Aryan"));
        roleList.add(new ProductManager("Dev"));

        ScreeningUtils.batchScreen(roleList);
    }
}
