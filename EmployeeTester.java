package com.xworkz.map.hashmap;

import java.util.HashMap;

public class EmployeeTester {

	public static void main(String[] args) {
		
		//Employee - department
		HashMap<Employee,String> employee = new HashMap<Employee,String>();
		
		Employee e1=new Employee("Neha", 20133, 45000);
		Employee e2=new Employee("sneha", 20134, 55000);
		Employee e3=new Employee("Anu", 20135, 50000);
		Employee e4=new Employee("Thanu", 20136, 40000);
		
		employee.put(e1,"CS" );
		employee.put(e2,"IS");
		employee.put(e3,"EC");
		employee.put(e4,"CS");
		
		System.out.println(employee);
		
		//Traversing
		employee.forEach((k,v)->System.out.println("key:" + k +  " value: " + v));

	}

}
