package com.xworkz.string;

public class SwapFirstAndLastCharacter {
	
	public static String count(String str) 
    { 

        if (str.length() < 2) 
            return str; 
        char[] ch = str.toCharArray();  
        char temp = ch[0]; 
        ch[0] = ch[ch.length - 1]; 
        ch[ch.length - 1] = temp; 
  
        return String.valueOf(ch); 
    } 
}
