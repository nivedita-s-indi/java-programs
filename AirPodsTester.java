package com.xworkz.interfaces;

public class AirPodsTester {

	public static void main(String[] args) {
		
		AirPods airpods = new AirPods();
		airpods.brand = "Boat";
		airpods.bass = "super bass";
		airpods.price = 2500;
		System.out.println("BRAND: "+airpods.brand);
		System.out.println("BASS: "+airpods.bass);
		System.out.println("PRICE: "+airpods.price);
		airpods.plugin();
		airpods.listenmusic();
		airpods.plugout();
		airpods.batterylife();
		airpods.bluetooth();
		
	}

}
