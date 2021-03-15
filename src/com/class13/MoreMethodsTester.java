package com.class13;

public class MoreMethodsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MoreMethodsExample MoreMethodsExample=new MoreMethodsExample();
		System.out.println(MoreMethodsExample.print());
		System.out.println(MoreMethodsExample.doubleTheValue(10));
		MoreMethodsExample.isRaining(true);
		
		
		MoreMethodsExample.batch();
		System.out.println(MoreMethodsExample.greater(10, 12));
		MoreMethodsExample.oddOrEven(7);
		
		double [] arr={10.2 ,2, 25};
		System.out.println(MoreMethodsExample.theArraySum(arr));
	
		System.out.println("aba");
		System.out.println("abcdef");
	
	}}
