package com.class13;

public class CalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator=new Calculator();
		System.out.println(calculator.add(10, 12));
		double results=calculator.sub(15.5, 10);
		System.out.println(results);
		System.out.println(calculator.multiply(10.2,  12.5));
		System.out.println(calculator.div(10.2,  12.5));
	}

}
