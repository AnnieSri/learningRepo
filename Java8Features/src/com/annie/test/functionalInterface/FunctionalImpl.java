package com.annie.test.functionalInterface;

public class FunctionalImpl implements FunctionalDemo{

	public static void main(String[] args) {
		
		FunctionalImpl imp = new FunctionalImpl();
		imp.onlyOneAbstractMethodPossible();
		imp.defaultDemo();
		FunctionalDemo.staticDemo();//static methods cannot be overriden.
		
	}

	@Override
	public void onlyOneAbstractMethodPossible() {
		System.out.println("only one abtract method is possible in functional interface");
		FunctionalDemo.super.defaultDemo();
		
	}
	
	@Override
	public void defaultDemo() {
		System.out.println("Default methods can be overriden");
	}

	
	
}
