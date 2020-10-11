package com.xworkz.exception;

public class ExceptionPropagation {
	
	void method1() {
		System.out.println("You are in method 1");
		try {
			method2();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	void method2() {
		System.out.println("You are in method 2");
		method3();
	}
	
	void method3() {
		System.out.println("You are in method 3");
		String name[] = {"Nivedita ","Nivu ","Nivi","niv"};
		for(int i=0;i<8;i++)
			System.out.print(name[i]+" ");
	}

	public static void main(String[] args) {
		
		System.out.println("start of the program");
		
		ExceptionPropagation ep = new ExceptionPropagation();
		ep.method1();
		
		System.out.println("end of the program");

	}

}
