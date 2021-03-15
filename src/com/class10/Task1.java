package com.class10;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * create an array of chars
		 * and store grates into it:A B C D E F
		 * than print a grade B
		 */
		char[] a=new char[6];
		a[0]='A';
		a[1]='B';
		a[2]='C';
		a[3]='D';
		a[4]='E';
		a[5]='F';
		System.out.println(a[1]);
		
		
		System.out.println("------Another way of creating an array-----");
		
		char[] grades= {'A','B','C','D','E','F','G'};
		//char[] grades1;
		//grades1={}; --> won't work
		System.out.println(grades[6]);
		System.out.println("Number of elements in 2 array "+grades.length);
	}

}
