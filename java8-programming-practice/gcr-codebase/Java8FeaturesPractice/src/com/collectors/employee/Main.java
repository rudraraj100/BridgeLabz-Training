package com.collectors.employee;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		
ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee("Pulkit" , "management" , (long)350000));
		list.add(new Employee( "Mukesh" , "sales", (long)45000));
		list.add(new Employee("rahul" , "dev" ,(long)30000));
		list.add(new Employee("ankita" ,  "management" , (long)400000));
		list.add(new Employee("rashi" , "sales" , (long)305000));
		list.add(new Employee("rajni" , "dev" ,  (long)340000));
		list.add(new Employee("balram" , "management" , (long)20500));
		list.add(new Employee( "purohit" , "sales" , (long)301000));
		list.add(new Employee("kishu" , "dev" , (long)350200));
		
		Map<String , Double> avgSalaryByDept = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		avgSalaryByDept.forEach((Depart , avg)-> 
					
							System.out.printf("%s : %.2f%n" , Depart ,avg)
		);					
	}

}
