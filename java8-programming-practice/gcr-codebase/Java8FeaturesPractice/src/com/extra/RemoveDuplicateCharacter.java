package com.extra;


import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {

		String s = "banana";
		
		s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
				.keySet()
				.forEach(System.out::print);

	}

}
