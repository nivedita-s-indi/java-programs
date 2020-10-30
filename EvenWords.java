package com.xworkz.string;

public class EvenWords {
	
	public static String printWords(String s) 
    { 
		
        for (String word : s.split(" ")) 
            if (word.length() % 2 == 0) 
                System.out.println(word);
		return s;
    } 

}
