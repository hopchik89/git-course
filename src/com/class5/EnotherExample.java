package com.class5;

import java.util.Scanner;

public class EnotherExample {

	public static void main(String[] args) {
		Scanner input;
		String name;
		int heights;
		
		input=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Please enter your heights in inches");
		heights=input.nextInt();
		String definition;
		if(heights<=60) {
			definition="short";
		}else if(heights>60 && heights<=72) {
			definition="medium";
		}else {
			definition="tall";
		}
		System.out.println("You are person who's heights is "+definition);
	}

}
