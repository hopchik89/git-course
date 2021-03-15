package com.class6;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		/*
		 * Allow user to enter grade (A, B, or C etc...) 
		 * and then provide explanation:
		 *  A-Excellent,
		 *  B-Good, 
		 *  C-Average, 
		 *  D-Bad, 
		 *  any other grade --> Not Acceptable. 
		 *  At the end your program should print which grade was entered by a user with explanation
		 * 
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter your grade:");
		char grade=scan.next().charAt(0);
		String explanation="null";
		
		switch (grade) {
		case 'A':
			explanation="Excellent";
			break;
		case 'B':
			explanation="Good";
			break;
		case 'C':
			explanation="Average";
			break;
		case 'D':
			explanation="Bad";
			break;
		default:
			explanation="Not Acceptable";
		}
		System.out.println("Your grade is "+explanation);
		
		
	}

}
