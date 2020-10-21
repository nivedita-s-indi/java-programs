package com.xworkz.multipleinheritance;

public interface Gold {
	
	String symbol(); 
		
	default void costfor10grams() {
		System.out.println(" cost of 10 grams of gold is 50000");
	}
		
}
