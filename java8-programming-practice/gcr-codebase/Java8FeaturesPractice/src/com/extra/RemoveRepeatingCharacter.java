package com.extra;

import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveRepeatingCharacter {

	public static void main(String[] args) {
		
		String a = "aabbccdde";
		
		a.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				 .entrySet().stream().filter( c -> c.getValue() == 1).map(c -> c.getKey()).forEach(System.out::print);	

	}

}
