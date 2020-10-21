package com.xworkz.multipleinheritance;

public class Cadbury implements DairyMilkSilk,Temptation {

	@Override
	public int price() {
		System.out.println("Cost is 150");
		return 0;
	}

	@Override
	public int weightingrams() {
		System.out.println("350 grams");
		return 0;
	}

}
