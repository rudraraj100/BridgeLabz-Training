package com.extra;

import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		
		String s = "programming";
		
		s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1)
				.map(e -> e.getKey() + " ")
				.forEach(System.out::print);

	}

}
