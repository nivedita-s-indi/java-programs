package com.xworkz.map.linkedhashmap;

import java.util.LinkedHashMap;

public class EmployeeTester {

	public static void main(String[] args) {
		
		//Employee - department
		LinkedHashMap<Employee,String> employee = new LinkedHashMap<Employee,String>();
				
		Employee e1=new Employee("Neha", 20133, 45000);
		Employee e2=new Employee("sneha", 20134, 55000);
		Employee e3=new Employee("Thanu", 20135, 50000);
		Employee e4=new Employee("Anu", 20136, 40000);
				
		employee.put(e1,"CS" );
		employee.put(e2,"IS");
		employee.put(e3,"EC");
		employee.put(e4,"CS");
				
		System.out.println(employee);
				
		//Traversing
		employee.forEach((k,v)->System.out.println("key:" + k +  " value: " + v));

		
	}

}
