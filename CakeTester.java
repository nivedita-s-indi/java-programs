package com.xworkz.interfacewithaccessmodifier;

public class CakeTester {

	public static void main(String[] args) {
		
		//upcasting
		Pastry pastry = new Pastry();
		pastry.flavour = "chocolate-tuffle";
		pastry.price = 3500;
		pastry.layers = 3;
		//pastry.weightinKG = 3.5; can not access since it is private
		pastry.shape = "round";
		pastry.occasion();
		pastry.message();
		pastry.feedback();
		
	}

}
