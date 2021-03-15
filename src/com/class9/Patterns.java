package com.class9;

public class Patterns {

	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			System.out.print("*");
				}
		System.out.println("-----------------------------");
		for (int r=1; r<=4; r++) {
			for (int c=1; c<=5; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		for (int r=1; r<=6; r++) {
			for (int c=1; c<=8; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------Numbers square---------");
		for (int r=1; r<=4; r++) {
			for (int c=1; c<=5; c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println("--------Revers Numbers square-2-first way-------");
		for (int r=1; r<=5; r++) {
			for (int c=6; c>=1; c--) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println("--------REvers Numbers square-2-second way-------");
		for (int r=5; r>=1; r--) {
			for (int c=6; c>=1; c--) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println("--------Numbers on line-------");
	   for(int a=1; a<=5;a++) {
		for(int b=5; b>=1;b--) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	   System.out.println("-------Stars triangle-------");
	   for (int r=1; r<=5; r++) { 
			
			for (int c=1; c<=r; c++){ 
				
		    System.out.print("*");
			}
			System.out.println();
		}
	   System.out.println("------Reverse-Stars triangle-------");
	   for (int r=1; r<=5; r++) { 
			
			for (int c=5; c>=r; c--){ 
				
		    System.out.print("*");
			}
			System.out.println();
		}
	}
}

