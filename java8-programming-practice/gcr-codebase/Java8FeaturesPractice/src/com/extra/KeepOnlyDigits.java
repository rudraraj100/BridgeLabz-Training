package com.extra;

public class KeepOnlyDigits {

	public static void main(String[] args) {
		
		String s = "orderId=AB123XZ9";
		
		s.chars().mapToObj(c -> (char)c).filter(Character::isDigit)
		 .forEach(System.out::print);


		

	}

}
