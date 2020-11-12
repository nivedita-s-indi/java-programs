package com.xworkz.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class JacketTester {

	public static void main(String[] args) {
		
		Jacket jkt0 = new Jacket("puma", "black", 32, 2500);
		Jacket jkt1 = new Jacket("Wrogn", "blue", 30, 1300);
		Jacket jkt2 = new Jacket("Calvin Klein", "wine-red", 34, 4300);
		Jacket jkt3 = new Jacket("Tommy Hilfiger", "brown", 30, 3500);
		
		LinkedList<Jacket> jacket = new LinkedList<Jacket>();
		jacket.add(jkt0);
		jacket.add(1, jkt1);
		jacket.addFirst(jkt2);
		jacket.addLast(jkt3);
		jacket.add(jkt1);
		System.out.println(jacket);
		System.out.println("-----------------------------------------------");
		System.out.println("Using ForEach Loop ");
		for(Jacket jkt : jacket)
			System.out.println(jkt);
		System.out.println("-----------------------------------------------");
		System.out.println("Using Iterator ");
		Iterator<Jacket> jktitr = jacket.iterator();
		while(jktitr.hasNext()) {
			System.out.println(jktitr.next());
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Using List Iterator ");
		System.out.println("Forward List Iterator ");
		ListIterator<Jacket> jktlitr = jacket.listIterator();
		while(jktlitr.hasNext()) {
			System.out.println(jktlitr.next());
		}
		System.out.println("Backward List Iterator ");
		while(jktlitr.hasPrevious()) {
			System.out.println(jktlitr.previous());
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Removal Methods ");
		jacket.remove();
		System.out.println(jacket);
		jacket.poll();
		System.out.println(jacket);
		jacket.pollFirst();
		System.out.println(jacket);
		jacket.pollLast();
		System.out.println(jacket);
		jacket.removeAll(jacket);
		System.out.println(jacket);
		System.out.println("Using push method : ");
		jacket.push(jkt2);
		System.out.println(jacket);
		System.out.println("Using pop method : ");
		jacket.pop();
		System.out.println(jacket);
		
		
	}

}
