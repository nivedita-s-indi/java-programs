package com.xworkz.collections.sets.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class StringTreeSetMethod {

	public static void main(String[] args) {
		
		TreeSet<String> fruits = new TreeSet<String>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		
		fruits.add("Apple"); //do not allow duplication
		
		//mobile.add(null); //do not allows null
		
		System.out.println(fruits);
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Traversing using Iterator: ");
		Iterator<String> fruitsItr = fruits.iterator();
			while(fruitsItr.hasNext())
				System.out.println(fruitsItr.next());
			
		System.out.println("-----------------------------------------------");
			
		System.out.println("Flooring: " +fruits.floor("Apple"));
		System.out.println("Ceiling: " +fruits.ceiling("Grapes"));
		System.out.println("First: " +fruits.first());
		System.out.println("Last: " +fruits.last());
		System.out.println("PollFirst: " +fruits.pollFirst());
		System.out.println("PollLast:" +fruits.pollLast());
		
		
		
	}

}
