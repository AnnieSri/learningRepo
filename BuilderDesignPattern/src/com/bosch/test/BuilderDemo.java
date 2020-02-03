package com.bosch.test;

public class BuilderDemo {

	public static void main(String[] args) {
		Student s1 = new Student.StudentBuilder("Annie", 1).build();
		System.out.println("Student with only mandatory params" +"\n" +s1);
		
		Student s2 = new Student.StudentBuilder("Annie", 1).age(12).lastName("Srivastava").zipCode(4567).build();
		System.out.println(s2);
	}

}
