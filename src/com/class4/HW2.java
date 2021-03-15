package com.class4;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*3.
		 * Create a Java program that will ask user to input city and temperature.
		 *  Your program should convert Fahrenheit into celsius and print
		 *   “The temperature in the city __ is __”
		 */
		Scanner scr =new Scanner (System.in);
		System.out.println("Enter name of city");
		String city=scr.nextLine();
		System.out.println("Enter temperature at F");
		int temp=scr.nextInt();
		double tempC=(temp-32)/1.8;
		System.out.println("The temperature in "+city+" is "+tempC+" Celsius");
		System.out.println("-----------------------");
		/*1. part 2
		 * Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, 
		 * tell them to pay off immediately, 
		 * otherwise you can tell them that they can spend more.
		 */
		boolean creditCard;
		double balance;
		System.out.println("Do you have a credit card?");
		creditCard=scr.nextBoolean();
		
		if (creditCard) {
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
