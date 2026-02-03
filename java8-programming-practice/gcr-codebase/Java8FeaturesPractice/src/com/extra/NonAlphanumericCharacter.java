package com.extra;

public class NonAlphanumericCharacter {

	public static void main(String[] args) {
		
		String s = "ja@va#8!!";
		
//		s.chars().mapToObj(c -> (char)c).filter(c -> c >= 'a' && c <= 'z' || c >= '0' && c<= '9')
//				 .forEach(System.out::print);
		
		// or using formula
		
		s.chars().mapToObj(c -> (char)c).filter(Character::isLetterOrDigit)
		 .forEach(System.out::print);

	}

}
