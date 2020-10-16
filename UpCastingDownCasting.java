package com.xworkz.upcastingdowncasting;

public class UpCastingDownCasting {

	public static void main(String[] args) {
		
		System.out.println("Upcasting");
		HeadPhone headphone = new WireLessHeadPhone("super bass",3);//upcasting
		headphone.setBrand("Boat");
		headphone.setPrice("9000RS");
		
		System.out.println("brand: "+headphone.getBrand());
		System.out.println("price: "+headphone.getPrice());
		headphone.displayDetails();
		
		System.out.println("==============================");
		System.out.println("DownCasting");
		
		WireLessHeadPhone wireLessHeadPhone = (WireLessHeadPhone) new HeadPhone();
		wireLessHeadPhone.setBrand("Boat");
		wireLessHeadPhone.setPrice("9000RS");
		wireLessHeadPhone.setBass("super bass");
		wireLessHeadPhone.setLengthofconnectivity(3);
		
		System.out.println("brand: "+wireLessHeadPhone.getBrand());
		System.out.println("price: "+wireLessHeadPhone.getPrice());
		System.out.println("type: "+wireLessHeadPhone.getBass());
		System.out.println("memory: "+wireLessHeadPhone.getLengthofconnectivity());
		
		wireLessHeadPhone.displayDetails();

	}

}
