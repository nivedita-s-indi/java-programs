package com.xworkz.collections.sets.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class StringLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Character> pizzasize = new LinkedHashSet<Character>();
		
		pizzasize.add('L');
		pizzasize.add('M');
		pizzasize.add('S');
		
		
		pizzasize.add('L'); //do not allow duplication
		
		pizzasize.add(null); //allows null
		
		System.out.println(pizzasize);
		System.out.println("-----------------------------------------------");
		
		System.out.println("Traversing through foreach method: ");
		pizzasize.forEach((pizzas)-> System.out.println(pizzas));
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Traversing using Iterator: ");
		Iterator<Character> pizzaItr = pizzasize.iterator();
			while(pizzaItr.hasNext())
				System.out.println(pizzaItr.next());

	}

}
