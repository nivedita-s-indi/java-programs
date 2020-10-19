package com.xworkz.interfaces;

public class PizzaReadyToServeTester {

	public static void main(String[] args) {
		
		PizzaReadyToServe pizzaReadyToServe = new PizzaReadyToServe();
		pizzaReadyToServe.crust = "Cheese burst";
		pizzaReadyToServe.pizzaname ="Peppy paneer";
		pizzaReadyToServe.price = 450;
		System.out.println("CRUST: "+pizzaReadyToServe.crust);
		System.out.println(pizzaReadyToServe.pizzaname);
		System.out.println("PRICE: "+pizzaReadyToServe.price);
		pizzaReadyToServe.size();
		pizzaReadyToServe.veg();
		pizzaReadyToServe.takeaway();
		pizzaReadyToServe.extratopping();
	
	}

}
