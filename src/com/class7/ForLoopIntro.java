package com.class7;

public class ForLoopIntro {

	public static void main(String[] args) {

       //SKAZAT HELLO 3 RAZA
		for (int i=1; i<=3; i++) {
			System.out.println("Hello");
		}

		/*
		 * For loop Syntax
		 * for (initialization; condition; increment/decrement) {
		 * code....
		 * }
		 */
		System.out.println();
		System.out.println("-----Print numbers from 1 to 50-------");
		for(int i=1; i<=50; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-----Print numbers from 10 to 1-------");
		for(int i=10; i>=1; i--) {
			System.out.print(i+" ");
		}
	
		System.out.println();
		System.out.println("-----WHAT IS MY OUTPUT-------");
	
		for(int a=0; a<=10; a+=2) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("-----WHAT IS MY OUTPUT-------");
		for(int i=5; i<=50; i+=10) {
			System.out.print(i+" ");
	    }
		System.out.println();

	}
	}
