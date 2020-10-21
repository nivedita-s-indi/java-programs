package com.xworkz.multipleinheritance;

public interface Instagram {
	
	default void username() {
		System.out.println("Username of instagram is Nivedita Indi");
	}
	
	default void password() {
		System.out.println("pasword of instagram is 5678");
	}
}
