package com.class8;

import java.util.Scanner;

public class WhileReview {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int money;
		
		System.out.println("Pls pay for soda");
		money = input.nextInt();
		while (money != 3) {
			
			if(money<3) {
				System.out.println("pls give more money"); 
			}else if (money>3) {
				System.out.println("pls give less money");
			}
			money = input.nextInt();
		}
		System.out.println("That is good!");
	}
		
	}


