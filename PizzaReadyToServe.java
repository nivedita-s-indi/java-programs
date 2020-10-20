package com.xworkz.interfaces;

public class PizzaReadyToServe extends DominosPizza {
	
	int noofpieces;
	
	@Override
	public boolean veg() {
		System.out.println("Veg Pizza");
		return true;
	
	}

	@Override
	public String size() {
		System.out.println("Medium");
		return null;
		
	}

	@Override
	void takeaway() {
		System.out.println("Take Away avilable");
		
	}

	@Override
	void extratopping() {
		System.out.println("Extra topping cost's extra");
		
	}
}
