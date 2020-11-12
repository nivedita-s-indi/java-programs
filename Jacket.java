package com.xworkz.collections.linkedlist;

public class Jacket {

	private String brand ;
	private String color;
	private int size;
	private float cost;
	
	public Jacket(String brand, String color, int size, float cost) {
		super();
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Jacket [brand=" + brand + ", color=" + color + ", size=" + size + ", cost=" + cost + "]";
	}
	
	
	
}
