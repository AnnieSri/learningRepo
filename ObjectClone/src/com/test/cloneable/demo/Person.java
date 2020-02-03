package com.test.cloneable.demo;

public class Person implements Cloneable{
	private String name;
	private int id;
	private Address address;
	


	public Person(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}



	public Person() {
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}


	public Person clone() throws CloneNotSupportedException{
		Person obj = null;
		obj =(Person)super.clone();
		return obj;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	
	
	

}
