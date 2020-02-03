package com.annie.test.lambdaExp;

public class MethodHidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal an = new Animal();
		Animal ref = new Dog();
		Dog d = new Dog();
		System.out.println(" dog reference caling animals" + " ");
		d.voice();
		ref.show();
		an.voice();
		ref.voice();
	}

}
