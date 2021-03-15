package com.class4;

public class NastedIfLastExample {

	public static void main(String[] args) {
		/*
		 * to donate:
		 * you must be 18 and older, otherwise you cannot
		 * your weight must be more than 110 lbs, otherwise you cannot donate
		 */

		double age=19;
		double weight=108;
		
		if (age>=18) {
			System.out.println("You can donate");
			if(weight>110) {
				System.out.println("You can donate");
			}else {
				System.out.println("Your weight is too small, You cannot donate");
			}
		}else {
			System.out.println("Your age is not eligible");
		}
	}

}
