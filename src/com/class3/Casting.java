package com.class3;

public class Casting {

	public static void main(String[] args) {
		
		/*
		 * CASTING in JAVA
		 * 2 types:
		 * 
		 * widening/implicit(automatically)
		 * 			byte-->short-->int-->long-->float-->double
		 * narrowing/explicit(manually)
		 *			double-->float-->int-->short-->byte
		 */
		
		
		//int i=10.99; type mismatch
		
		//widening or implicit casting
		double d=10;
		System.out.println(d); //10.0
		int num=10;
		
		//narrowing or explicit casting
		int i=(int)12.99;
		System.out.println(i); //12
		
		byte b=(byte)130;
		System.out.println(b); //-126
		
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece); //2
		
		int number=12;
		double result=number/5; 
		System.out.println(result); //2.0 int/int=int
		
		double newNum=10;
		newNum=newNum/3;
		System.out.println(newNum); //3.3333333333333335 double/int=double
		
		// int num1=10+10.5; need double
		
		double num1=10+10.5;
		System.out.println(num1); //20.5
		
		
		
		
		
		
	}

}
