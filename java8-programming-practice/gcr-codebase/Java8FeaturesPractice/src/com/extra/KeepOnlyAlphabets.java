package com.extra;

public class KeepOnlyAlphabets {

	public static void main(String[] args) {


		String s = "java8stream2025";
		
		s.chars().mapToObj(c -> (char)c).filter(Character::isLetter)
		 .forEach(System.out::print);


	}

}
