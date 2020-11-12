package com.xworkz.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class StringLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> planets = new LinkedList<String>();
		
		System.out.println("Adding Elements:");
		planets.add("mercury");
		planets.add(1, "venus");
		planets.addFirst("earth");
		planets.addLast("neptune");
		planets.offer("mars");
		planets.offerFirst("jupiter");
		planets.offerLast("saturn");
		planets.push("pluto");
		System.out.println(planets.addAll(planets));
		System.out.println(planets);
		
		System.out.println("-----------------------------------------------");
		System.out.println("Using Iterator");
		Iterator<String> str = planets.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Using List Iterator");
		ListIterator<String> listr = planets.listIterator();
		 
	    System.out.println("Forward List Iterator");
	    while(listr.hasNext()){
	       System.out.println(listr.next());
	    }
	    System.out.println("Backward List Iterator");
	    while(listr.hasPrevious()){
	       System.out.println(listr.previous());
	    }
		System.out.println("-----------------------------------------------");
		System.out.println("Using different Retrival Methods");
		System.out.println("Using peak method : " + planets.peek());
		System.out.println("Using peekFirst method : " + planets.peekFirst());
		System.out.println("Using peeklast method : "  + planets.peekLast());
		System.out.println("Using element method : " +planets.element());
		System.out.println("Using getmethod with index : " +planets.get(8));
		System.out.println("Using getFirst method : " + planets.getFirst());
		System.out.println("Using getlast method : " + planets.getLast());
		System.out.println("-----------------------------------------------");
		System.out.println("Using different Removal Methods");
		System.out.println("Using poll method : " + planets.poll());
		System.out.println("Using pollfirst method : " + planets.pollFirst());
		System.out.println("Using polllast method : " + planets.pollLast());
		System.out.println("Using remove method : " + planets.remove());
		System.out.println("Using remove method with index : " +planets.remove(4));
		System.out.println("Using remove object method : " +planets.remove("pluto"));
		System.out.println("Using removefirst method : " + planets.removeFirst());
		System.out.println("Using removefirstoccurrence method : " + planets.removeFirstOccurrence("jupiter"));
		System.out.println("Using removelast method : " + planets.removeLast());
		System.out.println("Using removelastoccurrence method : " + planets.removeLastOccurrence("neptune"));
		System.out.println("Using pop method : " + planets.pop());
		System.out.println(planets);
		

	}

}
