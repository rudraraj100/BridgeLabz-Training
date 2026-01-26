package com.collection.listinterface;

import java.util.ArrayList;
import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) {


		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Apple");
		list.add("Orange");
		
		HashMap<String, Integer> map = new HashMap<>();

		for (String s : list) {
		    map.putIfAbsent(s, 0);
		    map.put(s, map.get(s) + 1);
		
		}
		System.out.println(map);

	}

}
