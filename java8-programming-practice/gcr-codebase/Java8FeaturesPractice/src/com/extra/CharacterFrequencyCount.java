package com.extra;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencyCount {

	public static void main(String[] args) {


		String s = "banana";
		
		Map<Character, Long> output = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
                							Function.identity(),
                							Collectors.counting()
                ));

   System.out.println(output);
} 

	}

