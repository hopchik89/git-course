package com.class7;

public class LoopIntro {

	public static void main(String[] args) {
		
		/*
		 * LOOPS IN JAVA
		 * while
		 * do while
		 * for
		 * advanced/ enhanced for loop or for each loop
		 */

		int time=17;
		if (time<12) {

			System.out.println("Hello"); //code executes 1 time
		}
		System.out.println("------WHILE LOOP----");
		
		while (time<12) {

			System.out.println("Hello"); //code runs forever
			time++;
		}
		

		System.out.println("---------print numbers from 1 to 10-------");

		int num=1;
		while(num<11) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
		
		System.out.println("---------print numbers from 20 to 40-------");
	
		 num=20;
		while (num<=40) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
		
		System.out.println("----print 10 to 1--------");
		int a=10;
			while(a>=1) {
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
	}
	

}
