package com.class4;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/*1.
		 * You are a loan specialist and you need to ask user 
		 * what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you
		 *  would lend the money otherwise you would reject the client.
		 */
		
		Scanner input =new Scanner (System.in);
		System.out.println("Enter amount of loan is needed");
		int amount=input.nextInt();
		
		if (amount<= 200000) {
			System.out.println("I will lend money");
		} else {
			System.out.println("I cant lend money");
		}
		
		System.out.println("End of task 01");
		

		
	}


}
