package com;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface TestForEach{
	void print (List test);
}

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>animalList= new ArrayList<String>();
		animalList.add("Lion");
		animalList.add("Tiger");
		animalList.add("Fox");
		animalList.add("Cheetah");
		animalList.add("Wolf");
		animalList.add("Elephant");
		System.out.println("---Iterating by Lambda Expression---");
		animalList.forEach(animals ->System.out.println(animals)); // lambda used here
		TestForEach tfe= animals -> System.out.println(animals);  
	}

}
