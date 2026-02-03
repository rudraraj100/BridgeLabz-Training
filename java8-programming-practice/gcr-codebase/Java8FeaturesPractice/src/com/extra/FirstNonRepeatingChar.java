package com.extra;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		
		String s = "stress";
		
		s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				 .entrySet().stream().filter(e -> e.getValue() == 1).map(c -> c.getKey()).findFirst().ifPresent(System.out::print);	

	}

}
