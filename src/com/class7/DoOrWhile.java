package com.class7;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		/*
		 * we play lottery and we have a win number which is 17
		 * we need to keep asking a user to enter any number from 1 to 100
		 * UNTIL correct number is entered
		 */

		Scanner scan=new Scanner(System.in);
		int num;
		int lotteryNumber=17;
		do {
		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		num=scan.nextInt();
		}while(num!=lotteryNumber);
		System.out.println("You win");
	}

}
