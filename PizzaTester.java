package com.xworkz.collections.sets.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class PizzaTester {

	public static void main(String[] args) {
		
		LinkedHashSet<Pizza> pizza = new LinkedHashSet<Pizza>();
		
		pizza.add(new Pizza("Dominos", 'L', 600));
		pizza.add(new Pizza("Pizza Hut", 'M', 400));
		pizza.add(new Pizza("Oven Story", 'L', 500));
		
		System.out.println(pizza);
		
		System.out.println("--------------------------------------");
		
		System.out.println("Traversing through foreach method: ");
		pizza.forEach((pizzas)-> System.out.println(pizzas));
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Traversing using Iterator: ");
		Iterator<Pizza> pizzaItr = pizza.iterator();
			while(pizzaItr.hasNext())
				System.out.println(pizzaItr.next());

	}

}
