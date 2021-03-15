package com.class6;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 */
		
		Scanner scan=new Scanner(System.in);
		int num1, num2, num3, result;
		char operator;
		System.out.println("Enter 2 numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println("Enter your operator");
		operator=scan.next().charAt(0);
		
		switch (operator) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case'/':
			result=num1/num2;
			break;
		default:
			result=0;
		}
		System.out.println(num1+" "+operator+" "+num2+" = "+result);
		

	}

}
