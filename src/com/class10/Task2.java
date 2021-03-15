package com.class10;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create an array of names 
		 * and store all names of your group. 
		 * Then print your name from that array. 
		 * (use 2 different ways of creating an array).
		 */
		System.out.println("===First way===");
		String [] names= {"Aisha","Safiet","Yulia","Kenza","Zhanna","Mirage","Daryna"};
		System.out.println(names[4]);
		
		System.out.println("===ALL ELEMENTS FROM AN ARRAY===");
		//how to get all elements from an array
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("===Second way===");
		String[] names1=new String[7];
		names1[0]="Aisha";
		names1[1]="Safiet";
		names1[2]="Yulia";
		names1[3]="Kenza";
		names1[4]="Zhanna";
		names1[5]="Mirage";
		names1[6]="Daryna";
		System.out.println(names[4]);
		
		
		/*Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array:
		 *  “Saturday is Java coding Day”.
		 */
		System.out.println("===First way===");
		String[] words=new String[5];
		words[0]="Java ";
		words[1]="Saturday ";
		words[2]="Day";
		words[3]="coding ";
		words[4]="is ";
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);
		
		System.out.println("===Second way===");
		String[] words1= {"Java ","Saturday ","Day","coding ","is "};
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);
	}

}
