package com.xworkz.thiskeyword;

public class Charger {
	
	String brand = "SAMSUNG" ;
	String type = "type-C";
	int price = 1500;
	
	public Charger() {
		System.out.println("default constructor");
		
	}
	
	public Charger(String brand, String type, int price) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
	}
	
	public void displaydetails() {
		
		System.out.println("Brand: "+this.brand);
		System.out.println("Type: "+this.type);
		System.out.println("Price: "+this.price);
		
	}
	
	

}
