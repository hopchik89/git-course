package com.class5;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values
		 *  using if-else..if and logical operators provided by a user
		 *  (numbers must be distinct)
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 different numbers");
		double a,b,c;
		a=scan.nextDouble();
		b=scan.nextDouble();
		c=scan.nextDouble();
		double largest;
		if(a>b && a>c) {
			largest=a;
		}else if(b>a && b>c) {
			largest=b;
		}else {
			largest=c;
			}
			System.out.println("The largest number is "+largest);
		}

	}


