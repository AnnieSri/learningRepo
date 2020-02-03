package com.test.cloneable.demo;

public class Address {
	private String city;
	private String coutry;
	
	
	Address(String city, String country){
		this.city= city;
		this.coutry=country;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCoutry() {
		return coutry;
	}


	public void setCoutry(String coutry) {
		this.coutry = coutry;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", coutry=" + coutry + "]";
	}

	
}
