package com.xworkz.interfaces;

public class AirPods extends NeckBand {

	@Override
	public void plugin() {
		System.out.println("airdop is pluged in");
		
	}

	@Override
	public void listenmusic() {
		System.out.println("Listening music");
		
	}
	
	@Override
	public void plugout() {
		System.out.println("airdop is pluged out");
		
	}

	@Override
	void batterylife() {
		System.out.println("Battery life is 48hrs");
	}

	@Override
	void bluetooth() {
		System.out.println("bluetooth connected");
		
	}

}
