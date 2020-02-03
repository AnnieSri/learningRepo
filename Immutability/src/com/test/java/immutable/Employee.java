package com.test.java.immutable;

public class Employee extends Person {
	
	private String name;
	
	

	public Employee(String name, int id, Address address) {
		super(name, id, address);
		this.name = name;
	}
	@Override
	public String getName() {
		return "SRI";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayMsg() {
		System.out.println("Hello Employee");
	}

	@Override
	public void displayParent() {
		System.out.println("Display child");
	}
	
}
