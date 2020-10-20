package com.xworkz.interfacewithaccessmodifier;

public interface Cake {
	
	String occasion();
	String message();
	
    default void feedback() {
    	System.out.println("Best");	
	}
}
