package com.annie.test.lambdaExp;

public class LambdaImpl  {

	public static void main(String[] args) {
		LambdaImpl imp = new LambdaImpl();
		imp.show();
	Lambda l = ()->{System.out.println("hello i am lambda");};
	l.show();

	}

	
	public void show() {
		System.out.println("Lambda demo");
		
	}

}
