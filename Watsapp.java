package com.xworkz.multipleinheritance;

public interface Watsapp {
	
	default void username() {
		System.out.println("Username of watsapp is Nivedita");
	}
	default void password() {
		System.out.println("pasword of watsapp is 1234");
	}

}
