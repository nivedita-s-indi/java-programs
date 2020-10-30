package com.xworkz.string;

public class OnlyAlphabetsTester {

	public static void main(String[] args) {
		
		OnlyAlphabets onlyAlphabets = (String str)->{
			return ((str != null) 
	                && (!str.equals("")) 
	                && (str.chars().allMatch(Character::isLetter))); 
			
		};

	        System.out.println(onlyAlphabets.isStringOnlyAlphabet("Nivedita")); 
	  

	}

}
