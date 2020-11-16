package com.xworkz.collections.sets.linkedhashset;

public class Pizza {
	
	private String company;
	private char size ;
	private int price;
	
	public Pizza(String company, char size, int price) {
		super();
		this.company = company;
		this.size = size;
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [company=" + company + ", size=" + size + ", price=" + price + "]";
	}

}
