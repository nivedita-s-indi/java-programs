package com.xworkz.collections.arraylist;

import java.util.*;

public class CharacterArrayList {

	public static void main(String[] args) {
		
		ArrayList<Character> letter = new ArrayList<Character>();

		letter.add('h');
		letter.add('e');
		letter.add('r');
		letter.add('o');
		letter.add('s');

		System.out.println(letter.isEmpty());
		System.out.println(" ");

		System.out.println("size of the array: " + letter.size());
		System.out.println(" ");

		for (int i = 0; i < letter.size(); i++)
			System.out.println("for loop:" + letter.get(i));
		System.out.println(" ");

		for (Character i : letter)
			System.out.println("for each loop:" + i);
		System.out.println(" ");

		letter.set(0, 'Z');
		System.out.println(letter);
		System.out.println(" ");

		System.out.println(letter.get(4));
		System.out.println(" ");

		letter.remove(2);
		System.out.println(letter);
		System.out.println(" ");

		System.out.println(letter.contains('Z'));
		System.out.println(" ");

		letter.remove(new Character('Z'));
		System.out.println(letter);

	}

}

