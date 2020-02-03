package com.test.cloneable.demo;

public class CloneableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Annie",1,new Address("blr","kA"));
		try {
			Person person2 = person1.clone();
			
			System.out.println("person1 > " +person1.toString());
			System.out.println("person2 > " +person2.toString());
			System.out.println("After changing values only for person2");
			person2.getAddress().setCity("ranchi");
			System.out.println("person1 > " +person1.toString());
			System.out.println("person2 > " +person2.toString());
			
			Employee emp1 = new Employee("jags", 12,12000);
			System.out.println("emp1 > " +emp1.toString());
			Employee emp2 =(Employee) emp1.clone();
			
			System.out.println("emp1 > " +emp1.toString());

			System.out.println("emp2 > " +emp2.toString());
			
			
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
