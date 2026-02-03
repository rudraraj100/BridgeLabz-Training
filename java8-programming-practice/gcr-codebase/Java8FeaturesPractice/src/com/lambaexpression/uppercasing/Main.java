package com.lambaexpression.uppercasing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("rakesh", "rohan"+"prakash","saket","mohan","brain","noah");
		
		List<String> newList = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(newList);

	}

}
