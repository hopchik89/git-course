package com.class5;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month.
		 *  Based on the month define the season.
		 *  Example: 
		 *  if user is born in June, July or August --> season =“Summer”.
		 *  At the end of the program we should see output as
		 *   “You were born is season ______“.
		 */
		Scanner scan=new Scanner(System.in);
		String birthMonth;
		String season;
		System.out.println("Please enter your birth month");
		birthMonth = scan.next();
		if (birthMonth.equalsIgnoreCase("January") || birthMonth.equalsIgnoreCase("February") || birthMonth.equals("December")) {
			season = "winter";
		} else if (birthMonth.equalsIgnoreCase("March") || birthMonth.equalsIgnoreCase("April") || birthMonth.equalsIgnoreCase("May")) {
			season = "spring";
		} else if (birthMonth.equalsIgnoreCase("June") || birthMonth.equalsIgnoreCase("July") || birthMonth.equalsIgnoreCase("August")) {
			season = "summer";
		} else if (birthMonth.equalsIgnoreCase("September") || birthMonth.equalsIgnoreCase("October") || birthMonth.equalsIgnoreCase("November")) {
			season = "fall";	
		} else {
			season="try again";
			
		System.out.println("You were born is season"+season);
		System.out.println("Invalid birth month");
		}
		
	}

	}


