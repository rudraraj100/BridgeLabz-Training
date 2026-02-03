package com.lambaexpression.hospitalpatient;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Patient> list = new ArrayList<>();
		
		list.add(new Patient((long)145732, "Rakesh"));
		list.add(new Patient((long)135692, "Mukesh"));
		list.add(new Patient((long)101234, "Keshav"));
		list.add(new Patient((long)132732, "Rohan"));
		list.add(new Patient((long)100732, "Harshit"));
		list.add(new Patient((long)777732, "Prakash"));
		
		list.forEach(Patient::displayDetail);
		
	}	

}
