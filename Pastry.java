package com.xworkz.interfacewithaccessmodifier;

public class Pastry implements Cake {
	
	static String flavour;
	public int layers ;
	float price;
	private float weightinKG ;
	protected String shape;
	
	@Override
	public String occasion() {
		System.out.println("Birthday");
		return null;
	}

	@Override
	public String message() {
		System.out.println("Happy Birthday");
		return null;
	}
	
	
}
