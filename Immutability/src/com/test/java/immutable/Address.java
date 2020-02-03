package com.test.java.immutable;

public class Address {

	private String city;
	private String country;
	private int zipCode;
	public Address(String city, String address, int zipCode) {
		super();
		this.city = city;
		this.country = address;
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setAddress(String address) {
		this.country = address;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
	
}
