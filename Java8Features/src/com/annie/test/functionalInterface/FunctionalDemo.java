package com.annie.test.functionalInterface;

@FunctionalInterface
public interface FunctionalDemo {
	
	public void onlyOneAbstractMethodPossible();
	
	default void defaultDemo() {
		System.out.println("Default demo in interface");
	}
	
	static void staticDemo() {
		System.out.println("Static demo");
	}

}
