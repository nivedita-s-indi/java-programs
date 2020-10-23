package com.xworkz.lamadaexpression;

public class NoArgumentFuntionalInterfaceTester {

	public static void main(String[] args) {
		
		NoArgumentFuntionalInterface noArgumentFuntionalInterface = ()-> {return "Hello World";};
		System.out.println(noArgumentFuntionalInterface.PrintHello());

	}

}
