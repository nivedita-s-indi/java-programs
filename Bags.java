package com.xworkz.collections.sets.hashset;

public class Bags {
	
	private String brand;
	private String type;
	private int cost;
	
	public Bags(String brand, String type, int cost) {
		super();
		this.brand = brand;
		this.type = type;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Bags [brand=" + brand + ", type=" + type + ", cost=" + cost + "]";
	}
	

}
