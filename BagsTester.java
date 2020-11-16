package com.xworkz.collections.sets.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class BagsTester {

	public static void main(String[] args) {
		
		HashSet<Bags> bags = new HashSet<Bags>();
		
		bags.add(new Bags("wildcraft", "trekking bag", 3500));
		bags.add(new Bags("lavie", "backpack", 2000));
		bags.add(new Bags("caprese", "sling bag", 1500));
		bags.add(new Bags("fastrack", "laptop bag", 3000));
		
		System.out.println(bags);
		
		System.out.println("--------------------------------------");
		
		System.out.println("Traversing through foreach method: ");
		bags.forEach((bag)-> System.out.println(bag));
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Traversing using Iterator: ");
		Iterator<Bags> bagItr = bags.iterator();
			while(bagItr.hasNext())
				System.out.println(bagItr.next());

	}

}
