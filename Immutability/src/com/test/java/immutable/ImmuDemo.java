package com.test.java.immutable;

public class ImmuDemo {

	public static void main(String[] args) {
		Address a = new Address("Ranchi","JH",834002);
		//Person per1 = new Person("Annie" ,1, new Address("Ranchi","JH",834002));
		
		Person per = new Employee("Annie" ,1, new Address("Ranchi","JH",834002));
		
		
		System.out.println(per.getName());
		
		
		
		Employee emp = new Employee("sandy", 2, new Address("Kannur", "Kerela",2345));
		
		
		
		
	}

}
