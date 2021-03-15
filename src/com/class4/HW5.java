package com.class4;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {


		
		 /* Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, 
		 * tell them to pay off immediately, 
		 * otherwise you can tell them that they can spend more.
		 */
		Scanner scr =new Scanner (System.in);
		String creditCard;
		double balance;
		System.out.println("Do you have a credit card?");
		creditCard=scr.next();
		
		if (creditCard.equalsIgnoreCase("yes")) {
			System.out.println("What is a balance?");
			balance=scr.nextDouble();
			if(balance>1000) {
			System.out.println("Pay off immediately");
			}else {
				System.out.println("Spend more");
			}
		}else {
			System.out.println("Would you like to issue credit card?");
		
		}

	}

}
