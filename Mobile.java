package com.xworkz.collections.sets.treeset;

public class Mobile {
	
	private String brand;
	private int cost;
	
	public Mobile(String brand, int cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", cost=" + cost + "]";
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
