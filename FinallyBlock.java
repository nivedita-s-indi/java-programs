package com.xworkz.exception;

public class FinallyBlock {

	public static void main(String[] args) {
		
		int a=19,b=0,div;
		try {
			div=a/b;
			System.out.println("The result is: "+div);
		}catch(ArithmeticException e) {
			System.out.println("The divisor is zero");
		}finally{
			System.out.println("Program successfully executed");
		}
	}

}
