package com.class8;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] args) {
		/*
		 * we need to make user to pay for a soda
		 * keep asking user to pay you until it enters 3
		 * 
		 * if user gives more>3 -->please give less money
		 * if user gives less than 3 -->please give more money
		 */
		Scanner input= new Scanner(System.in);
		int money;
		
		do {
			System.out.println("Pls pay for soda");
			money = input.nextInt();
			if (money>3) {
				System.out.println("pls give less money");
			}else if (money<3) {
				System.out.println("pls give more money");
			}
		} while (money != 3);
		System.out.println("That is good!");
	}
		
		
	}


