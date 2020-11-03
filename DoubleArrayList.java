package com.xworkz.collections.arraylist;

import java.util.*;

public class DoubleArrayList {

	public static void main(String[] args) {

		ArrayList<Double> weight =  new ArrayList<Double>();
		
		weight.add(43.2);
		weight.add(71.6);
		weight.add(23.4);
		weight.add(56.5);
		
		System.out.println("size of the array: "+weight.size());
		
		for(int i=0;i<weight.size();i++) 
			System.out.println(weight.get(i));
		System.out.println(" ");
		
		for(Double i : weight)
			System.out.println(i);
		System.out.println(" ");
		
		weight.set(2,56.23);
		System.out.println(weight);
		System.out.println(" ");
		
		System.out.println(weight.get(weight.size()-1));
		System.out.println(" ");
		
		weight.remove(0);
		System.out.println(weight);
		System.out.println(" ");
		
		weight.remove(new Double(56.23));
		System.out.println(weight);
		

	}

}
