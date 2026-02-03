package com.collectors.wordcounter;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequency {

	public static void main(String[] args) {
		
		String paragraph = "Java streams make java code clean and streams make code powerful";
		
		Map<String, Long> wordFrequency = Arrays.stream(paragraph.toLowerCase().split("\\W+"))
												.collect(Collectors.toMap(word -> word, word -> 1L, Long::sum));
		
		wordFrequency.forEach((word, count) ->
        System.out.println(word + " : " + count)
		);
	}

}
