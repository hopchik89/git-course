package com.class8;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		/*Create a program that will keep asking user to apply for a credit card. 
		 *  As soon you get “yes” from a user program should stop asking.
		 */
		Scanner input=new Scanner(System.in);
	    String answer;
			
	    do {
	      	 System.out.println("Please apply for a credit card");
	      	 answer=input.nextLine(); }
	    while (!answer.equalsIgnoreCase("yes"));
	  		System.out.println("Okay, no more question");
	  		System.out.println("-----------------ANOTHER WAY----------------------");
	
	  		System.out.println("Please apply for a credit card");
	      	 answer=input.nextLine();
	      	 while(answer.equalsIgnoreCase("yes")) {
	      		System.out.println("Please apply for a credit card");
	      	
	      	 }
	      	
	  		
	}
		}


