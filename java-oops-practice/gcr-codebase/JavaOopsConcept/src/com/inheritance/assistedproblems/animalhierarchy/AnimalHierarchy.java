package com.inheritance.assistedproblems.animalhierarchy;

public class AnimalHierarchy {
	
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		
		dog.makeSound();
		
		Animal cat = new Cat();
		
		cat.makeSound();
		
		Animal bird = new Bird();
		
		bird.makeSound();
	}

}
