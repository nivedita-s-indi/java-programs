package com.xworkz.lamadaexpression;

public class MultipleArgumentFuntionalInterfaceTester {

	public static void main(String[] args) {
		
		MultipleArgumentFuntionalInterface multipleArgumentFuntionalInterface =(String str1, String str2)->{
			
			String str3 =str1.concat(str2);
			return str3;
		};
		
		System.out.println(multipleArgumentFuntionalInterface.ConcatTwoString("Hello ", "World"));
		
	}

}
