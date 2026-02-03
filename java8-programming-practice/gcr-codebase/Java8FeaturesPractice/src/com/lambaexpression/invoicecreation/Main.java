package com.lambaexpression.invoicecreation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("123plop" , "1598lol", "456tryu");
		
		List<Invoice> invoice = list.stream().map(Invoice::new).collect(Collectors.toList());
		
		System.out.println(invoice);
	}

}
