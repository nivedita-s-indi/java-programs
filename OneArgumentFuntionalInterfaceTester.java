package com.xworkz.lamadaexpression;

public class OneArgumentFuntionalInterfaceTester {

	public static void main(String[] args) {
		
		OneArgumentFuntionalInterface oneArgumentFuntionalInterface = (int a)->{
			int num = a+5;
			return num;	
		};
		System.out.println(oneArgumentFuntionalInterface.IncrementByFive(1));
	}

}
