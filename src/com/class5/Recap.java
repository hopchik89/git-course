package com.class5;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner anyVariableName;
		anyVariableName=new Scanner (System.in);
		
		//to capture entire sentence
		String sentence=anyVariableName.nextLine();
		System.out.println(sentence);
		
		//to capture  NUMBER
		int num=anyVariableName.nextInt();
		System.out.println(num);
		
		//to capture double
		double d=anyVariableName.nextDouble();
		System.out.println(d);
		
		//to capture single character
		char singleCharacter=anyVariableName.next().charAt(0);
		System.out.println(singleCharacter);
		
		
	}

}
