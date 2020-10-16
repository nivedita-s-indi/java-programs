package com.xworkz.upcastingdowncasting;

public class HeadPhone {

	private String brand;
	private String price;
	
	public HeadPhone(){
		
	}
	
	public HeadPhone(String inbrand, String inprice) {
		super();
		this.brand = inbrand;
		this.price = inprice;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public void playSongs() {
		System.out.println("playing songs in wired or wireless head phones");
	}
	
	public void bluetoothConnection() {
		System.out.println("may or may not have bluetooth connection");
	}
	
	public void displayDetails() {
		System.out.println("brand: "+brand+"  "+"price: "+price);
	}
	
}
