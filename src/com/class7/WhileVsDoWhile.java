package com.class7;

public class WhileVsDoWhile {

	public static void main(String[] args) {


		int num=6;
		while(num<=5) { //while loop is used in programming compare to do while !!!
			System.out.println(num);
			num++;
		}
		System.out.println("-----Do while----");
		int num1=6;
		do {
			System.out.println(num1);
			num1++;
		}while(num1<=5);
		/*
		 * While=first check then execute
		 * Do=first execute then check
		 * Even when condition is false Do will execute your code AT LEAST ONCE
		 */
	}

}
