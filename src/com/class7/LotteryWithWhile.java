package com.class7;

import java.util.Scanner;

public class LotteryWithWhile {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num;
		int lotteryNumber=17;

		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		num=scan.nextInt();
		while (num!=lotteryNumber) {
			System.out.println("Please enter any number from 1 to 100 to win the lottery");
			num=scan.nextInt();
		}
		System.out.println("You win");
	}
}
