package com.xworkz.exception;

public class Palindrome {
	
	
	int palindromeOrNot(int num) throws Exception{
		
		int sum=0,r;
		if(num==0) {
			
			Exception e = new Exception("The number entered is Zero");
			throw e;
		}
		
		else
	    {
			while(num!=0) {
				r=num%10;
				sum=(sum*10)+r;
				num/=10;
				if(num==sum)
					System.out.println("Given number is a palindrome ");
			    else
			        System.out.println("Given number is not a palindrome ");
				
			}
	   }
	return sum;
	}
	
	public static void main(String arg[]){
		
		Palindrome p = new Palindrome();
	
		try {
			
			p.palindromeOrNot(0);
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}
	}

}
