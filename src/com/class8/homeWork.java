package com.class8;

public class homeWork {

	public static void main(String[] args) {
		int sumEven = 0;
		for (int i = 0; i <= 50; i += 2) {
			sumEven += i;
		}
		System.out.println("The sum of even numbers is " + sumEven);
		int sumOdd = 0;
		for (int i = 1; i <= 50; i += 2) {
			sumOdd += i;
		}
		System.out.println("The sum of odd numbers is " + sumOdd);

	}

}
