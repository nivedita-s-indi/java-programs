package com.xworkz.collections.sets.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MobileTester {

	public static void main(String[] args) {
		
		Comparator<Mobile> comp = (o1, o2)-> o1.getBrand().compareTo(o2.getBrand());
		
		TreeSet<Mobile> mobile = new TreeSet<Mobile>(comp);
		
		mobile.add(new Mobile("samsung", 21000));
		mobile.add(new Mobile("Oneplus", 75000));
		mobile.add(new Mobile("Apple", 90000));
		
		System.out.println(mobile);
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Traversing through foreach method: ");
		mobile.forEach((mob)-> System.out.println(mob));
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Traversing using Iterator: ");
		Iterator<Mobile> mobileItr = mobile.iterator();
			while(mobileItr.hasNext())
				System.out.println(mobileItr.next());


	}

}
