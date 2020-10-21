package com.xworkz.multipleinheritance;

public class Facebook implements Watsapp,Instagram {

	@Override
	public void username() {
		
		Instagram.super.username();
		Watsapp.super.username();
	}

	@Override
	public void password() {
		
		Instagram.super.password();
		Watsapp.super.username();
	}

	

}
