package com.xworkz.upcastingdowncasting;

public class HeadPhoneTester {

	public static void main(String[] args) {
		
		System.out.println("Instance of parent class");
		HeadPhone headphone = new HeadPhone("JBL","7000");
		
		System.out.println("displaying details using constructor");
		headphone.displayDetails();
		System.out.println();
		
		headphone.setBrand("JBL");
		headphone.setPrice("7000");
		System.out.println("brand: "+headphone.getBrand());
		System.out.println("price: "+headphone.getPrice());
		headphone.playSongs();
		headphone.bluetoothConnection();
		System.out.println();
		System.out.println("displaying details using getter setter");
		headphone.displayDetails();
		
		System.out.println();
		System.out.println("*****************************");
		
		System.out.println("Instance of child class");
		WireLessHeadPhone wireLessHeadPhone = new WireLessHeadPhone("super bass",3);
		
		wireLessHeadPhone.setBrand("Boat");
		wireLessHeadPhone.setPrice("9000");
		System.out.println("displaying details using constructor");
		wireLessHeadPhone.displayDetails();
		System.out.println();
		
		wireLessHeadPhone.setBass("super bass");
		wireLessHeadPhone.setLengthofconnectivity(3);
		
		System.out.println("Brand: "+wireLessHeadPhone.getBrand());
		System.out.println("Price: "+wireLessHeadPhone.getPrice());
		System.out.println("Type: "+wireLessHeadPhone.getBass());
		System.out.println("MemoryInGb: "+wireLessHeadPhone.getLengthofconnectivity());
		wireLessHeadPhone.playSongs();
		wireLessHeadPhone.bluetoothConnection();
		System.out.println();
		System.out.println("displaying details using getter setter");
		wireLessHeadPhone.displayDetails();
		
	}

}
