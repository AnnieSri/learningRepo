package com.test.java.immutable;

public  class Person {
	
	private final String name;
	private final  int id;
	private final Address address;
	
	
	public Person(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = new Address(address.getCity(), address.getCountry(), address.getZipCode());
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public Address getAddress() {
		return new Address(this.address.getCity(), this.address.getCountry(), this.address.getZipCode());
	}
	
	public void displayParent() {
		System.out.println("Display parent");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", address=" + address + "]";
	}	

}
