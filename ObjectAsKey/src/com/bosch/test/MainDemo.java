package com.bosch.test;

import java.util.HashMap;
import java.util.Map;

public class MainDemo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Annie", 1);
		Employee emp2 = new Employee("Annie", 1);
		
		Map<Employee,String> map = new HashMap<>();
		map.put(emp1, "india");
		map.put(emp2,"japan");
		
		map.entrySet().stream().forEach(entry -> System.out.println(entry ));
		
		emp2.setName("Sandeep");
		System.out.println("After chnaging");
		System.out.println(map.get(emp2));

	}

}
