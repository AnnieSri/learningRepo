package com.bosch.test;

public class Student {
	
	private String  firstName;
	private  String lastName; 	//optional
	private int id;
	private int age;	//optional
	private int  mobNumber;
	private String city; //optional
	private int zipCode;//optional
	
	
	private Student(StudentBuilder builder) {
		
		this.age=builder.age;
		this.city=builder.city;
		this.firstName=builder.firstName;
		this.lastName=builder.lastName;
		this.mobNumber=builder.mobNumber;
		this.zipCode=builder.zipCode;
		this.id=builder.id;
		
	}
	
	
	public static class StudentBuilder{
		private String  firstName; //mandatory
		private  String lastName; 	//optional
		private int id;				//mandatory
		private int age;			//optional
		private int  mobNumber;
		private String city; 		//optional
		private int zipCode;		//optional
		
		
		public StudentBuilder(String firstName, int id) {
			this.firstName=firstName;
			this.id=id;
		}
		public StudentBuilder lastName(String lastName) {
			this.lastName=lastName;
			return this;
		}
		public StudentBuilder age(int age) {
			this.age=age;
			return this;
		}
		public StudentBuilder mobNumner(int mobNumber) {
			this.mobNumber=mobNumber;
			return this;
		}
		public StudentBuilder city(String city) {
			this.city=city;
			return this;
		}
		public  StudentBuilder zipCode(int  zipCode) {
			this.zipCode=zipCode;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
	}


	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", age=" + age
				+ ", mobNumber=" + mobNumber + ", city=" + city + ", zipCode=" + zipCode + "]";
	}

	
	
}
