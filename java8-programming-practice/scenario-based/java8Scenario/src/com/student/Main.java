package com.student;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();

		list.add(new Student("Rudra", "ab234", "Mechanical Engineering", 21, 'M', "Patna", 1,
		        Arrays.asList(123456789L, 987654321L)));

		list.add(new Student("Aman", "cs101", "Computer Engineering", 20, 'M', "Delhi", 2,
		        Arrays.asList(987654321L, 876543210L)));

		list.add(new Student("Priya", "ec202", "Electronics Engineering", 22, 'F', "Karnataka", 30,
		        Arrays.asList(912345678L, 901234567L)));

		list.add(new Student("Neha", "it303", "Information Technology", 27, 'F', "Bangalore", 4,
		        Arrays.asList(998877665L, 887766554L)));

		list.add(new Student("Rahul", "me404", "Mechanical Engineering", 23, 'M', "Mumbai", 50,
		        Arrays.asList(889977665L, 778899665L)));

		list.add(new Student("Snehal", "ce505", "Civil Engineering", 29, 'F', "Kolkata", 60,
		        Arrays.asList(776655443L, 665544332L)));

		list.add(new Student("Arjun", "ee606", "Electrical Engineering", 22, 'M', "Chennai", 57,
		        Arrays.asList(665544332L, 554433221L)));

		list.add(new Student("Kavya", "ai707", "Artificial Intelligence", 21, 'F', "Mumbai", 8,
		        Arrays.asList(554433221L, 443322110L)));

		list.add(new Student("Vikash", "cs808", "Computer Engineering", 22, 'M', "Noida", 9,
		        Arrays.asList(443322110L, 332211009L)));

		list.add(new Student("Sneha", "ec909", "Electronics Engineering", 28, 'F', "Karnataka", 10,
		        Arrays.asList(332211009L, 221100998L)));

		list.add(new Student("Rohit", "me111", "Mechanical Engineering", 23, 'M', "Mumbai", 11,
		        Arrays.asList(221100998L, 110099887L)));

		list.add(new Student("Pooja", "it222", "Information Technology", 20, 'F', "Mumbai", 120,
		        Arrays.asList(110099887L, 109988776L)));

		list.add(new Student("Saurav", "ce333", "Computer Engineering", 26, 'M', "Mumbai", 13,
		        Arrays.asList(999888777L, 888777666L)));

		list.add(new Student("Ishita", "ai444", "Artificial Intelligence", 21, 'F', "Gurgaon", 104,
		        Arrays.asList(888777666L, 777666555L)));

		list.add(new Student("Nikhil", "ds555", "Data Science", 26, 'M', "Ahmedabad", 51,
		        Arrays.asList(777666555L, 666555444L)));

		
		System.out.println("1.Print all students whose rank is less than 50");
		list.stream().filter(x -> x.getRank() < 50).forEach(System.out::println);
		
		System.out.println("\n2.Print all students whose age is greater than 25.");
		list.stream().filter(x -> x.getAge() > 25).forEach(System.out::println);
		
		System.out.println("\n3.Print the names of all students only.");
		list.stream().map(x -> x.getName() + " ").forEach(System.out::println);
		
		System.out.println("\n4.Print all students belonging to Mechanical Engineering.");
		list.stream().filter(x -> x.getField().equals("Mechanical Engineering")).forEach(System.out::println);
		
		System.out.println("\n5.Print all students not from Mumbai.");
		list.stream().filter(x -> !x.getCity().equalsIgnoreCase("Mumbai")).forEach(System.out::println);
		
		System.out.println("\n1.Sort students by rank (ascending).\n");
		list.stream().sorted((a,b) -> a.getRank() - b.getRank()).forEach(System.out::println);
		
		System.out.println("\n2.Sort students by age (descending).\n");
		list.stream().sorted((a,b) -> b.getAge() - a.getAge()).forEach(System.out::println);
		
		System.out.println("\n3.Print top 5 students based on rank.\n");
		list.stream().sorted((a,b) -> a.getRank() - b.getRank()).limit(5).forEach(System.out::println);
		
		System.out.println("\n4.Print last 3 students based on rank.\n");
		list.stream().sorted((a,b) -> b.getRank() - a.getRank()).limit(3).forEach(System.out::println);
		
		System.out.println("\n5.Print students sorted by name and then rank.\n");
		list.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getRank)).forEach(System.out::println);;
		
		
		System.out.println("\n1.Count the number of students in each department.\n");
		list.stream().collect(Collectors.groupingBy(Student::getField, Collectors.counting())).entrySet().stream().forEach(System.out::println);;
		
		System.out.println("\n2.Count the number of students in each city.\n");
		list.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.counting())).entrySet().stream().forEach(System.out::println);;
		
		System.out.println("\n3.Find the average age of students in each department.\n");
		list.stream().collect(Collectors.groupingBy(Student::getField, Collectors.averagingInt(Student::getAge))).entrySet().stream().forEach(System.out::println);;
		
		System.out.println("\n4.Find the average rank of students by gender.\n");
		list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getRank))).entrySet().stream().forEach(System.out::println);;
		
		System.out.println("\n5.Find the total number of students in the organization.\n");
		System.out.println(list.stream().count());
		
		System.out.println("\n6.Find the department with the highest average rank\n");
		list.stream().collect(Collectors.groupingBy(Student::getField, Collectors.averagingInt(Student::getRank))).entrySet().stream().forEach(System.out::println);
		
		System.out.println("\n1.Find the student with the best (lowest) rank.\n");
		list.stream().sorted((a,b) -> a.getRank() - b.getRank()).findFirst().ifPresent(System.out::println);
		
		System.out.println("\n2.Find the student with the worst (highest) rank.\n");
		list.stream().sorted((a,b) -> b.getRank() - a.getRank()).findFirst().ifPresent(System.out::println);
		
		System.out.println("\n3.Find the second best rank holder.\n");
		list.stream().sorted((a,b) -> a.getRank() - b.getRank()).skip(1).findFirst().ifPresent(System.out::println);
		
		System.out.println("\n4.Find the third best rank holder.\n");
		list.stream().sorted((a,b) -> a.getRank() - b.getRank()).skip(2).findFirst().ifPresent(System.out::println);
		
		System.out.println("\n5.Find the youngest student.\n");
		list.stream().sorted((a,b) -> a.getAge() - b.getAge()).findFirst().ifPresent(System.out::println);
		
		System.out.println("\n6.Find the oldest student.\n");
		list.stream().sorted((a,b) -> b.getAge() - a.getAge()).findFirst().ifPresent(System.out::println);
		
		System.out.println("\n1.Count male and female students.\n");
		list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting())).entrySet().forEach(System.out::println);
		
		System.out.println("\n2.Find the average age of male students.\n");
		System.out.println("Avg age: " + list.stream().filter(x -> x.getGender().equals('M')).collect(Collectors.averagingInt(Student::getAge)));
		
		System.out.println("\n3.Find the average age of female students.\n");
		System.out.println("Avg age: " + list.stream().filter(x -> x.getGender().equals('F')).collect(Collectors.averagingInt(Student::getAge)));
		
		System.out.println("\n4.Find the highest ranked male student.\n");
		list.stream().filter(x -> x.getGender().equals('M')).sorted((a,b) -> a.getRank() - b.getRank()).findFirst().ifPresent(System.out::println);
		
		System.out.println("\n5.Find the highest ranked female student.\n");
		list.stream().filter(x -> x.getGender().equals('F')).sorted((a,b) -> a.getRank() - b.getRank()).findFirst().ifPresent(System.out::println);
		
		System.out.println("\n1.List students department-wise with names only.\n");
		list.stream().collect(Collectors.groupingBy(Student::getField, Collectors.mapping(Student::getName, Collectors.toList()))).entrySet().forEach(System.out::println);;
		
		System.out.println("\n2.Find the youngest student in Computer Engineering.\n");
		list.stream().filter(x -> x.getField().equals("Computer Engineering")).sorted(Comparator.comparing(Student::getAge)).findFirst().ifPresent(System.out::println);
		
		System.out.println("\n3.Find the top-ranked student in Mechanical Engineering.\n");
		list.stream().filter(x -> x.getField().equals("Mechanical Engineering")).sorted(Comparator.comparing(Student::getRank)).findFirst().ifPresent(System.out::println);
		
		System.out.println("\n4.Count students in Electronics Engineering from Karnataka.\n");
		System.out.println(list.stream().filter(x -> x.getField().equals("Electronics Engineering") && x.getCity().equals("Karnataka")).count());
		
		System.out.println("\n1.Convert the student list into a Map<Id, Name>.\n");
		Map<String , String> newList = list.stream().collect(Collectors.toMap(Student::getId, Student::getName));
		newList.forEach((id , name) ->
						System.out.println(id + " : " + name)
				
		);
		
		System.out.println("\n2.Convert the student list into a Map<Department, List<Student>>.\n");
		Map<String , List<Student>> newList1 = list.stream().collect(Collectors.groupingBy(Student::getField, Collectors.toList()));
		newList1.forEach((field , student) ->
						System.out.println(field + " : " + student)
				
		);
		
		System.out.println("\n3.Find students whose name starts with ‘S’.\n");
		list.stream().filter(a -> a.getName().startsWith("S")).forEach(System.out::println);
		
		System.out.println("\n4.Find students whose name length is greater than 5.\n");
		list.stream().filter(x -> x.getName().length() > 5).forEach(System.out::println);
		
		System.out.println("\n5.Find students whose rank is even.\n");
		list.stream().filter(x -> x.getRank() % 2 == 0).forEach(System.out::println);
		
		System.out.println("\n6.Find students whose rank is odd.\n");
		list.stream().filter(x -> x.getRank() % 2 != 0).forEach(System.out::println);
		
		System.out.println("\n1.Find the top 3 youngest students.\n");
		list.stream().sorted(Comparator.comparing(Student::getAge)).limit(3).forEach(System.out::println);
		
		System.out.println("\n2.Find the top 3 oldest students.\n");
		list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).limit(3).forEach(System.out::println);
		
		System.out.println("\n3.Partition students based on age > 25.\n");
		Map<Boolean, List<Student>> result =list.stream().collect(Collectors.partitioningBy(s -> s.getAge() > 25));

		result.forEach((key, students) -> {
			    System.out.println(key ? "Age > 25" : "Age <= 25");
			    students.forEach(System.out::println);
			});
		
		System.out.println("\n4.Partition students based on rank < 100.\n");
		Map<Boolean, List<Student>> result1 =list.stream().collect(Collectors.partitioningBy(s -> s.getRank() < 100));

		result1.forEach((key, students) -> {
			    System.out.println(key ? "Rank <= 100" : "Rank > 100");
			    students.forEach(System.out::println);
			});
		
		System.out.println("\n5.Find the city having maximum students.\n");
		list.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(entry ->
        System.out.println("City: " + entry.getKey() +
        ", Students: " + entry.getValue())
		);
		
		System.out.println("\n6.Find the department having minimum students.\n");
		list.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.counting())).entrySet().stream().min(Map.Entry.comparingByValue()).ifPresent(entry ->
		System.out.println("City: " + entry.getKey() +
		", Students: " + entry.getValue())
		);
		
		
		System.out.println("\n1.Print all contact numbers of all students.\n");
		list.stream().forEach(student -> System.out.println(student.getName() + " -> " + student.getContact().stream()
	                                           .map(String::valueOf)
	                                           .collect(Collectors.joining(", "))
	    ));
		
		System.out.println("\n2.Count the total number of contact numbers.\n");
		System.out.println(list.stream().flatMap(student -> student.getContact().stream()).count());
		
		System.out.println("\n3.Find students who have more than one contact number.\n");
		list.stream().filter(student -> student.getContact().size() > 1).forEach(student -> System.out.println(student.getName() + " -> " + student.getContact()));
		
		System.out.println("\n4.Print unique contact numbers.\n");
		list.stream()
	    .flatMap(student -> student.getContact().stream()) 
	    .distinct()                                        
	    .forEach(System.out::println);
		
		System.out.println("\n1.Check if any student belongs to Biotech Engineering.\n");
		System.out.println(list.stream()
	    .anyMatch(student -> student.getField().equalsIgnoreCase("Biotech Engineering")));
		
		System.out.println("\n2.Check if all students are above age 20.\n");
		System.out.println(list.stream().allMatch(student -> student.getAge() > 20));

		System.out.println("\n3.Check if no student belongs to Civil Engineering.\n");
		System.out.println(list.stream().noneMatch(student -> student.getField().equals("Civil Engineering")));
	}

}
