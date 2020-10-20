package com.xworkz.interfaces;

public class AirPods implements NeckBand {
	
	String brand;
	String bass;
	float price;
	
	@Override
	public void plugin() {
		System.out.println("Pluged in");
		
	}

	@Override
	public void listenmusic() {
		System.out.println("Music started ");
		
	}

	@Override
	public void plugout() {
		System.out.println("Pluged out");
		
	}

	@Override
	public void batterylife() {
		System.out.println("Batterylife is 48hrs");
		
	}

	@Override
	public void bluetooth() {
		System.out.println("Bluetooth connected");
		
	}

}
