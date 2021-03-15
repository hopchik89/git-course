package com.class4;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner (System.in);
		
		/*2.
		 * You are DMV representative and you need to ask customer their age.
		 *  If they are 18 and older you will issue a driver license to them,
		 *   otherwise you will offer them to get a learners permit.
		 */
		System.out.println("What is your age?");
		int age=input.nextInt();
		if (age>= 18) {
			System.out.println("You are eligible for a driver license");
		}else {
			System.out.println("You will need to apply for a learners permit");
		}
		
	
		
	}

}
