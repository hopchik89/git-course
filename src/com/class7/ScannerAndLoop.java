package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		/*
		 * I want to capture your name 5 times and say hello to you
		 */
		Scanner scan=new Scanner(System.in);
		String name;
		int q=5;
		while(q<5) {
		System.out.println("Enter your name");
		name=scan.nextLine();
		System.out.println("Hello "+name);
		q++;
		}
	}

}
