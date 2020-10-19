package com.xworkz.interfaces;

public abstract class DominosPizza implements Pizza {
	
	String pizzaname;
	String crust;
	float price;
	
	abstract void takeaway();
	abstract void extratopping();
	
}
