package com.class5;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * Prompt the user to enter person heights in inches. 
		 * Person should be classified as one of the following:
		 * short (under 60 inch)
		 * medium(between 60 -72 inch)
		 * tall (over 72 inch)
		 * 
		 */
		Scanner input;
		String name;
		int heights;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your name");
		name=input.next();
		
		System.out.println("Please enter your heights in inches");
		heights=input.nextInt();
		
		if(heights<60) {
			System.out.println(name+" your heights is short");
		}else if(heights>=60 && heights<=72) {
			System.out.println(name+" your heights is medium");
		}else {
			System.out.println(name+" your heights is tall");
		}
		
		System.out.println("---------Task--------");
		/*Write a program that will print whether it is a weekend or weekday.
		 *  If any day from 1-5 -> output “It is a weekday”, 
		 *  anyday from 6-7 -> output “It is a weekend”, 
		 *  any other day -> output “Invalid day”
		 */
		System.out.println("Please enter any day from 1 to 7");
		int day=input.nextInt();
		
		if(day==1 || day==2 || day==3 || day==3 ||day==4 ||day==5) {
			System.out.println("It is a weekday");
		}else if(day==6 || heights==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
	}

}
