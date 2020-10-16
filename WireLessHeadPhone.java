package com.xworkz.upcastingdowncasting;

public class WireLessHeadPhone extends HeadPhone {
	
	public String bass;
	public int lengthofconnectivity;
	
	public WireLessHeadPhone() {
		
	}
	
	public WireLessHeadPhone(String bass, int lengthofconnectivity) {
		super();
		this.bass = bass;
		this.lengthofconnectivity = lengthofconnectivity;
	}
	
	public String getBass() {
		return bass;
	}


	public void setBass(String bass) {
		this.bass = bass;
	}


	public int getLengthofconnectivity() {
		return lengthofconnectivity;
	}


	public void setLengthofconnectivity(int lengthofconnectivity) {
		this.lengthofconnectivity = lengthofconnectivity;
	}


	@Override
	public void playSongs() {
		System.out.println("playing songs with wired head phones");
	}
	
	@Override
	public void bluetoothConnection() {
		System.out.println("has bluetooth connectivity");
	}
	
	@Override
	public void displayDetails() {
		System.out.println("brand: "+getBrand()+"  "+"price: "+getPrice()+"  "+"bass: "+bass+" "+"lengthofconnectivity: "+lengthofconnectivity);
	}
}