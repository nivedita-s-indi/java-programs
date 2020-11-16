package com.xworkz.collections.sets.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {
		
		HashSet<String> bags = new HashSet<String>();
		
		bags.add("sling bags");
		bags.add("trekking bags");
		bags.add("backpacks");
		bags.add("clutches");
		bags.add("laptop bags");
		
		bags.add("sling bags"); //do not allow duplication
		
		bags.add(null); //allows null
		
		System.out.println(bags);
		System.out.println("-----------------------------------------------");
		
		System.out.println("Traversing through foreach method: ");
		bags.forEach((bag)-> System.out.println(bag));
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Traversing using Iterator: ");
		Iterator<String> bagItr = bags.iterator();
			while(bagItr.hasNext())
				System.out.println(bagItr.next());
	}

}
