package com.class10;

public class AllElementUsingAdvancedForLoop {

	public static void main(String[] args) {
		//for each,enhanced for loop, advanced for loop USED ONLY WITH ARRAYS. 
		int[] numbers= {10,14,78,5,90};
		for(int num:numbers) {
			if(num%2==0) {
			System.out.print(num+" ");
			}
		}
		System.out.println();
		String[] name= {"Grey","Ali","Jose","Alec","Ozoda"};
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
		System.out.println();
		System.out.println("---------------------");
		
		for(String n:name) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		System.out.println("----------------------------------");
		
		char[] grades= {'A','B','C','D','F'};
		for(char grade:grades) {
			System.out.print(grades);
		}
		System.out.println();
		System.out.println("---------------------");
		
		boolean[] boo= {true,false,false,false,true};
		for(boolean b:boo) {
			System.out.print(b+" ");
		}
		}
	}


