package com.xworkz.interfaces;

public class PizzaTester {

	public static void main(String[] args) {
		
		//upcasting
		DominosPizza dominospizza = new PizzaReadyToServe(); 
		dominospizza.crust = "Cheese burst";
		dominospizza.pizzaname ="Peppy paneer";
		dominospizza.price = 450;
		System.out.println("CRUST: "+dominospizza.crust);
		System.out.println(dominospizza.pizzaname);
		System.out.println("PRICE: "+dominospizza.price);
		dominospizza.size();
		dominospizza.veg();
		dominospizza.takeaway();
		dominospizza.extratopping();
		
		//upcasting; 
		Pizza pizza = new PizzaReadyToServe(); 
	
		pizza.size();
		pizza.veg();

		
		//creating instance of PizzaReadyToServe
		PizzaReadyToServe pizzaReadyToServe = new PizzaReadyToServe();
		pizzaReadyToServe.crust = "hand toasted";
		pizzaReadyToServe.pizzaname ="veggie paradise";
		pizzaReadyToServe.price = 400;
		pizzaReadyToServe.noofpieces = 6;
		System.out.println("CRUST: "+pizzaReadyToServe.crust);
		System.out.println(pizzaReadyToServe.pizzaname);
		System.out.println("PRICE: "+pizzaReadyToServe.price);
		System.out.println("NUMBER OF PIECES: "+pizzaReadyToServe.noofpieces);
		pizzaReadyToServe.size();
		pizzaReadyToServe.veg();
		pizzaReadyToServe.takeaway();
		pizzaReadyToServe.extratopping();
	
	}

}
