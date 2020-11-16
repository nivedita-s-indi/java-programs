package com.xworkz.collections.sets.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> mobile = new TreeSet<String>();
		
		mobile.add("Apple");
		mobile.add("Oneplus");
		mobile.add("Samsung");
		
		mobile.add("Apple"); //do not allow duplication
		
		//mobile.add(null); //do not allows null
		
		System.out.println(mobile);
		System.out.println("-----------------------------------------------");
		
		System.out.println("Traversing through foreach method: ");
		mobile.forEach((mob)-> System.out.println(mob));
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Traversing using Iterator: ");
		Iterator<String> mobItr = mobile.iterator();
			while(mobItr.hasNext())
				System.out.println(mobItr.next());

	}

}
