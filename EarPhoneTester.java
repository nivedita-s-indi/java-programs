package com.xworkz.interfaces;

public class EarPhoneTester {

	public static void main(String[] args) {
		
		//upcasting
		NeckBand neckband = new AirPods();
		neckband.batterylife();
		neckband.bluetooth();
		neckband.plugin();
		neckband.listenmusic();
		neckband.plugout();
		
		//upcasting
		EarPhones earphones = new AirPods();
		earphones.plugin();
		earphones.listenmusic();
		earphones.plugout();
		
		//Creating an instance of airpod 
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
