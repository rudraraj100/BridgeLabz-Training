package com.extra;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCount {

	public static void main(String[] args) {
		
		String s = "java is java and java is fast";
		
		Map<String, Long> output = Arrays.stream(s.split("\\s+")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(output);
	}

}
