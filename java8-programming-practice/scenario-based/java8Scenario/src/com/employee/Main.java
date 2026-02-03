package com.employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.Year;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee("12lp" , "Pulkit" , 25 , 'm' , "management" , Year.parse("2014") , (long)350000));
		list.add(new Employee("12lp" , "Mukesh" , 25 , 'm' , "sales" , Year.parse("2013") , (long)45000));
		list.add(new Employee("12lp" , "rahul" , 25 , 'm' , "dev" , Year.parse("2025") , (long)30000));
		list.add(new Employee("12lp" , "ankita" , 25 , 'f' , "management" , Year.parse("2021") , (long)400000));
		list.add(new Employee("12lp" , "rashi" , 22 , 'm' , "sales" , Year.parse("2024") , (long)305000));
		list.add(new Employee("12lp" , "rajni" , 20 , 'f' , "dev" , Year.parse("2015") , (long)340000));
		list.add(new Employee("12lp" , "balram" , 26 , 'm' , "management" , Year.parse("2012") , (long)20500));
		list.add(new Employee("12lp" , "purohit" , 25 , 'm' , "sales" , Year.parse("2000") , (long)301000));
		list.add(new Employee("12lp" , "kishu" , 25 , 'm' , "dev" , Year.parse("2011") , (long)350200));
		list.add(new Employee("12lp" , "rishu" , 25 , 'm' , "management" , Year.parse("2026") , (long)350300));
		list.add(new Employee("12lp" , "pari" , 28 , 'f' , "sales" , Year.parse("2001") , (long)315000));
		list.add(new Employee("12lp" , "soumya" , 23 , 'f' , "dev" , Year.parse("2024") , (long)350050));
		list.add(new Employee("12lp" , "nova" , 22 , 'f' , "management" , Year.parse("2020") , (long)40000));
		list.add(new Employee("12lp" , "ananya" , 22 , 'f' , "sales" , Year.parse("2025") , (long)34000));
		list.add(new Employee("12lp" , "abdul" , 25 , 'm' , "dev" , Year.parse("2023") , (long)37000));
		list.add(new Employee("12lp" , "rudra" , 22 , 'm' , "management" , Year.parse("2022") , (long)500000));
		list.add(new Employee("12lp" , "rakesh" , 25 , 'm' , "sales" , Year.parse("2002") , (long)401000));
		list.add(new Employee("12lp" , "disha" , 21 , 'f' , "dev" , Year.parse("2021") , (long)650000));
		list.add(new Employee("12lp" , "raj" , 26 , 'm' , "management" , Year.parse("2023") , (long)550000));
		list.add(new Employee("12lp" , "krishna" , 25 , 'm' , "sales" , Year.parse("2025") , (long)85000));
		list.add(new Employee("12lp" , "mohit" , 22 , 'm' , "dev" , Year.parse("2026") , (long)95000));
		
		
		
		Map<Character, Long> genderCount = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		System.out.println("1. How many male and female employees are there in the organization ?");
		System.out.println("Ans: " + genderCount);
		
		
		List<String> departmentName = list.stream().map(Employee:: getDepartment).distinct().collect(Collectors.toList());
		System.out.println("\n2. Print the name of all departments in the organization ?");
		System.out.println("Ans: " + departmentName);
		
		Map<Character, Double> avgAge = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("\n3. What is the average age of male and female employees ?");
		System.out.println("Ans: " + avgAge );
		
		
		Employee highestPaidEmployee = list.stream().max(Comparator.comparingLong(Employee::getSalary)).orElse(null);
		System.out.println("\n4. Get the details of highest paid employee in the organization ?");
		System.out.println(highestPaidEmployee);
		
		Year cutOff = Year.of(2015);
		System.out.println("\n5. Get the names of all employees who have joined after 2015 ?");
		System.out.println("Ans: ");
		list.stream().filter(x -> x.getYearOfJoining().isAfter(cutOff)).map(Employee::getName).forEach(System.out::println);
		
		System.out.println("\n6. Count the number of employees in each department ?");
		Map<String , Long> employeeInEachDepart = list.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.counting()));
		System.out.println("Ans:" + employeeInEachDepart);
		
		System.out.println("\n7. What is the average salary of each department ?");
		Map<String , Double> avgDepartSalary = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingLong(Employee::getSalary)));
		avgDepartSalary.forEach((dept, avgSalary) ->
        	
			System.out.printf("%s : %.2f%n", dept, avgSalary)
		);
		
		System.out.println("\n8. Get the details of youngest male employee in the product development department ?");
		Employee youngestOne = list.stream().filter(x -> x.getDepartment().equals("dev")).min(Comparator.comparingInt(Employee::getAge)).orElse(null);
		System.out.println("Ans: " + youngestOne); 
		
		
		System.out.println("\n9. Who has the most working experience in the organization?");
		Employee highExperince = list.stream().min(Comparator.comparing(Employee::getYearOfJoining)).orElse(null);
		System.out.println("Ans: " + highExperince.getName());
		
		System.out.println("\n10. How many male and female employees are there in the Sales team?");
		Map<Character , Long> totalEmployeesInSales = list.stream().filter(x -> x.getDepartment().equals("sales")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("Ans: " + totalEmployeesInSales);
		
		System.out.println("\n11. What is the average salary of male and female employees ?");
		Map<Character, Double> avgSalary = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		avgSalary.forEach((gender , avgsal) ->
			
				System.out.printf("%s : %.2f%n" , gender , avgsal)			
		);			
		
		System.out.println("\n12. List down the names of all employees in each department ?");
		Map<String, List<String>> departmentWiseEmployees = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
		departmentWiseEmployees.forEach((dept,name) ->
		
						System.out.println(dept + ":" + name)
		
		);
		
		System.out.println("\n13. What is the average salary and total salary of the whole organization?");
		
		DoubleSummaryStatistics salaryStats = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

		System.out.printf("Total Salary   : %.2f%n", salaryStats.getSum());
		System.out.printf("Average Salary : %.2f%n", salaryStats.getAverage());

		
		System.out.println("\n14. Get the employee whose salary are more than 4L.");
		List<Employee> lowSalary = list.stream().filter(a -> a.getSalary() > 400000.0).collect(Collectors.toList());
		lowSalary.forEach(System.out:: println);
		
		System.out.println("\n15.Who is the highest paid employee in the organization?");
		Employee highestPaidEmployeeOrg = list.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
		System.out.println("Ans: " + highestPaidEmployeeOrg);
		
		System.out.println("\n16.Who is the second highest paid employee in the organization?");
		
		list.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).skip(1).findFirst().ifPresent(System.out::println);
		
		
		System.out.println("\n17.Who is the third highest paid employee in the organization?");
		list.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).skip(2).findFirst().ifPresent(System.out::println);
		
		
		System.out.println("\n18.Who is the lowest paid employee in the organization?");
		list.stream().sorted(Comparator.comparingLong(Employee::getSalary)).findFirst().ifPresent(System.out::println);
		
		
		System.out.println("\n19.Who is the second lowest paid employee in the organization?");
		list.stream().sorted(Comparator.comparingLong(Employee::getSalary)).skip(1).findFirst().ifPresent(System.out::println);
		
		System.out.println("\n20.Get the first five lowest paid employee in the organization?");
		list.stream().sorted(Comparator.comparingLong(Employee::getSalary)).limit(5).forEach(System.out::println);
		
		System.out.println("\n21.Get the first five highest paid employee in the organization?");
		list.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).limit(5).forEach(System.out::println);
		
		
	}

}
